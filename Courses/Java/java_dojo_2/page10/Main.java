import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    Bicycle bicycle = new Bicycle();
    
    bicycle.setName("Bianchi");
    bicycle.setColor("Green");
    
    bicycle.info();
    
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int dist = scan.nextInt();
    
    bicycle.run(dist);
    System.out.println("Distance: " + bicycle.getDistance() + "km");

    System.out.println("=================");
    
    Car car = new Car();
    car.setName("Ferrari");
    car.setColor("Red");
    car.info();

    System.out.println("-----------------");
    
    System.out.print("Enter distance to move: ");
    dist = scan.nextInt();
    car.run(dist);
    
    System.out.println("-----------------");
    System.out.print("Enter amount to refuel: ");
    int gas = scan.nextInt();
    car.charge(gas);
    
  }
}