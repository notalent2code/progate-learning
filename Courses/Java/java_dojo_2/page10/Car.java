public class Car{
  private String name;
  private String color;
  private int distance;
  private int fuel;
  
  Car(){
    this.fuel = 100;
  }
  
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
    if(dist <= this.fuel){
      this.distance += dist;
      this.fuel -= dist;
    }else{
      System.out.println("Not enough fuel");
    }
      System.out.println("Distance: " + this.distance + "km");
      System.out.println("Fuel: " + this.fuel + "L");
  }
  
  public void charge(int gas){
    System.out.println("Adding " + gas + "L ...");
    if(gas <= 0){
      System.out.println("No fuel added");
    }else if(gas + this.fuel >= 100){
      System.out.println("Tank now full");
      this.fuel = 100;
    }else{
      this.fuel += gas;
    }
    System.out.println("Fuel: " + this.fuel + "L");
  }
  
  public void info(){
    System.out.println("【Car Info】");
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + this.distance + "km");
    System.out.println("Fuel: " + this.fuel + "L");
  }
}