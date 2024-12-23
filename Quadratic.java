import java.util.*;

class Quadratic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coefficient of a:");
        double a = input.nextDouble();
        System.out.println("Enter coefficient of b:");
        double b = input.nextDouble();
        System.out.println("Enter coefficient of c:");
        double c = input.nextDouble();
        
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are:"+" "+ r1+" "+r2);
        } else if (d == 0) {
            double r1 =-b/(2 * a);
            double r2=-b/(2*a);
            System.out.println("Root are:"+" "+r1+" "+r2);
        } else if(d<0) {
            System.out.println("Roots are rational");
        }
        else{
            System.out.println("Invalid input!!");
        }
    }
