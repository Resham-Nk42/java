import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class AllMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        
        External[] externalStudents = new External[n];
        Internals[] internalMarks = new Internals[n];

        
        for (int i = 0; i < n; i++) {
           
            scanner.nextLine(); 
            System.out.print("\nEnter USN for student " + (i + 1) + ": ");
            String usn = scanner.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter semester for student " + (i + 1) + ": ");
            int sem = scanner.nextInt();

            
            externalStudents[i] = new External(usn, name, sem);

           
            internalMarks[i] = new Internals();
            int[] internalMarksArray = new int[5];
            System.out.println("Enter internal marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
                internalMarksArray[j] = scanner.nextInt();
            }
            internalMarks[i].setInternalMarks(internalMarksArray);

            
            int[] externalMarksArray = new int[5];
            System.out.println("Enter external marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
                externalMarksArray[j] = scanner.nextInt();
            }
            externalStudents[i].setExternalMarks(externalMarksArray);
        }

        
        System.out.println("\nFinal Marks for Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": " + externalStudents[i].getName() + " (" + externalStudents[i].getUsn() + ")");
            int[] finalMarks = externalStudents[i].getFinalMarks(internalMarks[i].getInternalMarks());
            System.out.println("Semester: " + externalStudents[i].getSem());
            System.out.println("Final Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.println("Course " + (j + 1) + ": " + finalMarks[j]);
            }
        }

        scanner.close();
    }
}
