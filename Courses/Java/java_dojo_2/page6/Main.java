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

  }
}