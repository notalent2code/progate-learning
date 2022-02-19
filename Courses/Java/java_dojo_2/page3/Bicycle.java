public class Bicycle{
  private String name;
  private String color;
 
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  public String getColor(){
    return this.color;
  }
  
  public void info(){
    System.out.println("【Bicycle Info】");
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
  }
}