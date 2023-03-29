import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);

public static void main(String[] args){

boolean keepGoing = true;

while(keepGoing){
 String result = getString("Do you want to add, subtract, multiply or divide?");

    double num1 = getDouble( "enter a double:");
    double num2 = getDouble( "enter another double:");
    
    
        
    
    if  (result.equals("add")){
        System.out.println(Calculator.add(num1,num2));
      }
    if  (result.equals("subtract")){
        System.out.println(Calculator.subtract(num1,num2));
      }
      if  (result.equals("multiply")){
        System.out.println(Calculator.multiply(num1,num2));
      }
      if  (result.equals("divide")){
        System.out.println(Calculator.divide(num1,num2));
      }
      else{
        keepGoing = true;
      }
    
      
       
      
        String result2 = getString("Do you want to continue?");
       
      
      if (result2.equals("yes")){
        keepGoing = true;
      }
      else{
        System.out.println("Goodbye  :)");
        keepGoing = false;
      }
}
}
    
    private static String getString(String prompt) {
    System.out.println(prompt);
    return inputScanner.next();
}

private static double getDouble(String prompt) {
  System.out.println(prompt);
    return inputScanner.nextDouble();
}

}
      
