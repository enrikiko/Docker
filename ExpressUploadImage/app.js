const http = require("http");
const path = require("path");
const fs = require("fs");
const multer = require("multer");
const express = require('express')
const app = express()
let count = 0

const upload = multer({
  dest: "images/"
});

app.post('/test', upload.single("imageFile"),(req, res) => {
    // console.log(req.file.originalname);
    // console.log(req.file.path);
    const tempPath = req.file.path;
    const targetPath = path.join(__dirname, "images/image_" + count + ".jpeg");
    count++
    fs.rename(tempPath, targetPath, err => {
      if (err) {
        console.log(err);
      }
    })
    res
      .status(200)
      .contentType("text/plain")
      .end("File uploaded!");
  }
);

app.listen(80)
