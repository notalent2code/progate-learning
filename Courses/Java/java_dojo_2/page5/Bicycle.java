public class Bicycle{
  private String name;
  private String color;
  private int distance;
  
  
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
  
  public void setDistance(int distance){
    this.distance = distance;
  }
  
  public int getDistance(){
    return this.distance;
  }
  
  public void run(int dist){
    System.out.println("Moving " + dist + "km ..." );
    this.distance += dist;
  }
  
  public void info(){
    System.out.println("【Bicycle Info】");
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + this.distance + "km");
  }
}