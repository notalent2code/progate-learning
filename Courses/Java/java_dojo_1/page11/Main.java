import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Number of people: ");
    int n = scanner.nextInt();
    
    int i = 1;
    int maxAge = 0;
    int sumAge = 0;
    
    while(i <= n){
      System.out.println("Person number " + i);  
      System.out.print("First name: ");
      String firstName = scanner.next();
      System.out.print("Last name: ");
      String lastName = scanner.next();
      System.out.print("Age: ");
      int age = scanner.nextInt();
      
      sumAge += age;
      if(age > maxAge){
        maxAge = age;
      }
      
      System.out.print("Height (m): ");
      double height = scanner.nextDouble();
      System.out.print("Weight (kg): ");
      double weight = scanner.nextDouble();
      
      System.out.println("My name is " + firstName + " " + lastName + ".");
      System.out.println("I am " + age + " years old.");
      if(age >= 18){
        System.out.println("I am an adult.");
      }else{
        System.out.println("I am not an adult.");
      }
      
      System.out.println("I am " + height + "m tall.");
      System.out.println("I weigh " + weight + "kg.");
      
      double bmi = Person.countBMI(weight, height);
      
      System.out.println("My BMI is " + (int)bmi + ".");
      
      if(Person.isHealthy(bmi)){
        System.out.println("I am healthy!");
      }else{
        System.out.println("I am not healthy.");
      }
      
    i++;
    }
    System.out.println("Age of oldest person: " + maxAge + "."); 
    System.out.println("Average age: " + sumAge / n + ".");
  }
}
