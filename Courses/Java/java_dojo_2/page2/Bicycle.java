public class Bicycle{
  private String name;
  
  Bicycle(String name){
    this.name = name;
  }
  
  public void info(){
    System.out.println("【Bicycle Info】");
    System.out.println("Name: " + this.name);
  }
}