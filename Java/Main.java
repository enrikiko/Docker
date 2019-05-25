public class Persona{
  // Atributosprivate int idPersona;
  private String nombre;
  private int edad;
  private String genero;
  // Constructores
  public Persona(int id,String nombre, int edad){
    setIdPersona (id);
    setNombre (nombre);
    setEdad (edad);
  }
  public Persona(){}
  public Persona(int id,String nombre, int edad, String genero){
    setIdPersona (id);
    setNombre (nombre);
    setEdad (edad);
    setGenero (genero);
  }
  // Métodos set`s
  public void setIdPersona(int valor){
    this.idPersona=valor;
  }
  public void setNombre(String valor){
    this.nombre=valor;
  }
  public void setGenero(String valor){
    if(valor.equals("F")|| valor.equals("M")){
      this.genero=valor;
    }else{
      System.out.println("El género debe ser F o M");
  }

}




public class TestPersona{
  public static void main (String [] arreglo){
    Persona p = new Persona();
    Persona p1 =new Persona(22,"Marcos",12);
    p1.setGenero("M");
    Persona p4=new Persona(33,"Lucia",34,"F");
    //System.out.println(p1.getIdPersona() + " " + p1.getNombre() + " " p1.getEdad());
    //System.out.println(p4.getIdPersona() + " " + p4.getNombre() + " " +p4.getEdad()+ " "+p4.getGenero());
  }
}
