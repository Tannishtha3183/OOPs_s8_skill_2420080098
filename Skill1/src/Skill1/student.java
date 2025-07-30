package Skill1;

public class student {

    public static void main(String[] args) {
     
        long roll_no = 2420080098L;     
        String name = "Tannishtha";  
        float marks = 97.5F;          
        char gender = 'F';             
        boolean hasPassed = marks >= 40.0F;   
        

        System.out.printf("Roll Number : %d%n", roll_no);
        System.out.printf("Name : %s%n", name);
        System.out.printf("Marks : %.2f%n", marks);
        System.out.printf("Gender : %c%n", gender);
        System.out.printf("Status : %s%n", hasPassed ? "Pass" : "Fail");
        
    }
}