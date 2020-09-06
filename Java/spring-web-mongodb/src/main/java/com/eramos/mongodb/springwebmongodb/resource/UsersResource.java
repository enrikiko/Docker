package com.eramos.mongodb.springwebmongodb.resource;

import com.eramos.mongodb.springwebmongodb.document.Users;
import com.eramos.mongodb.springwebmongodb.repository.UsersRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static com.eramos.mongodb.springwebmongodb.resource.Id.id;

@RestController
@RequestMapping("/users")
public class UsersResource {

    private UsersRepository usersRepository;
    private Password password = new Password();

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    private String getTest(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Test.class).test;}

    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResponseEntity test(HttpServletRequest request,
                               @RequestBody String body) throws JsonProcessingException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                "{" +
                        "\"test\": \""+getTest(body)+"\"," +
                        "\"method\": \""+request.getMethod()+"\"," +
                        "\"getContextPath\": \""+request.getContextPath()+"\"," +
                        "\"getHeader_User-Agent\": \""+request.getHeader("User-Agent")+"\"," +
                        "\"getPathInfo\": \""+request.getPathInfo()+"\"," +
                        "\"getRequestedSessionId\": \""+request.getRequestedSessionId()+"\"," +
                        "\"getRemoteUser\": \""+request.getRemoteUser()+"\"," +
                        "}");
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity addUser(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "teamName") String teamName,
            @RequestParam(value = "salary") Long salary,
            @RequestParam(value = "password") String password) {
        Optional<Users> user = usersRepository.findById(id(name));
        if (user.isEmpty()){
            String salt = Password.getSalt();
            int hash = Password.getHash(password, salt);
            Users newUser = usersRepository.insert(new Users(id(name), name, teamName, salary, salt, hash));
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("{\"New user\": \""+ newUser.getName() +"\"}");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"User already exist\": true}");
        }
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity checkUser(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "password") String password) {
        Optional<Users> user = usersRepository.findById(id(name));
        if (user.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Check\": false}");
            }
        else{
            int hash = user.get().getHash();
            String salt = user.get().getSalt();
            int newHash = Password.getHash(password, salt);
            if ( hash == newHash ){
                return ResponseEntity.status(HttpStatus.ACCEPTED).body("{\"Check\": true}");
            }
            else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Check\": false}");
            }
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
    public Optional<Users> getUser(
            @RequestParam(value = "name") String name) {
        return usersRepository.findById(id(name));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces = "application/json")
    public Optional<Users> deleteUser(
            @RequestParam(value = "name") String name) {
        Optional<Users> user = usersRepository.findById(id(name));
        usersRepository.deleteById(id(name));
        return user;
    }
}