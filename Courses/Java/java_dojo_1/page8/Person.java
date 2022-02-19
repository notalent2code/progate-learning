import java.lang.Math;

public class Person{
  public static double countBMI(double weight, double height){
    return Math.round(weight / height / height);
  }
  
  public static boolean isHealthy(double bmi){
    if(bmi >= 18.5 && bmi < 25.0){
      return true;
    }else{
      return false;
    }
  }
}