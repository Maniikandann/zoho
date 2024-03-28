package combinedassignment4;

public class OverLoading {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        
        return (double) a / b;
    }
    
    public static double divide(double a, double b) {
       
        return a / b;
    }
    
    public static int modules(int a, int b) {
        return a % b;
    }
    
    public static double modules(double a, double b) {
        return a % b;
    }
    
    
    public static void main(String[] args) {
  
        System.out.println("Addition:");
        System.out.println("Integer: " + add(4, 3));
        System.out.println("Double: " + add(5.5, 3));
        
        System.out.println("\nSubtraction:");
        System.out.println("Integer: " + subtract(5, 3));
        System.out.println("Double: " + subtract(5.5, 3.2));
        
        System.out.println("\nMultiplication:");
        System.out.println("Integer: " + multiply(5, 3));
        System.out.println("Double: " + multiply(5.5, 3.2));
        
        System.out.println("\nDivision:");
        System.out.println("Integer: " + divide(5, 0));
        System.out.println("Double: " + divide(5.5, 2.0));
        
        System.out.println("\nModules:");
        System.out.println("Integer: " + modules(5, 3));
        System.out.println("Double: " + modules(3, 5.2));
        
    }
}

