package Skill2;
public class operator {
    public static void main(String[] args) {
        
        int a = 10, b = 5;
        int x = 15, y = 4;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b));  
        System.out.println("a / b = " + (a / b));  
        System.out.println("a % b = " + (a % b));  

        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));   
        System.out.println("a < b = " + (a < b));   
        System.out.println("a == b = " + (a == b)); 
        System.out.println("a != b = " + (a != b)); 

        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (x > y): " + ((a > b) && (x > y))); 
        System.out.println("(a < b) || (x > y): " + ((a < b) || (x > y))); 
        System.out.println("!(a > b): " + !(a > b)); 

        System.out.println("\nAssignment Operators:");
        int num = 20;
        System.out.println("num = " + num);
        num += 5; 
        System.out.println("num += 5 => " + num);
        num *= 2; 
        System.out.println("num *= 2 => " + num);

        System.out.println("\nUnary Operators:");
        int c = 5;
        System.out.println("c = " + c);
        System.out.println("++c = " + (++c)); 
        System.out.println("c++ = " + (c++)); 
        System.out.println("After post-increment, c = " + c);
        System.out.println("--c = " + (--c)); 
       
        System.out.println("\nBitwise Operators:");
        int p = 5;  
        int q = 3;  
        System.out.println("p & q = " + (p & q)); 
        System.out.println("p | q = " + (p | q)); 
        System.out.println("p ^ q = " + (p ^ q));  
        System.out.println("~p = " + (~p));       

        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}

