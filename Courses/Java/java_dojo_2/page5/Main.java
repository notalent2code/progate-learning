class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    
    bicycle.setName("Bianchi");
    bicycle.setColor("Green");
    
    bicycle.info();
    
    System.out.println("-----------------");
    
    bicycle.run(10);
    System.out.println("Distance: " + bicycle.getDistance() + "km");

  }
}