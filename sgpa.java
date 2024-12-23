import java.util.*;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;
    private int numSubjects;

    public Student(String usn, String name, int numSubjects) {
        this.usn = usn;
        this.name = name;
        this.numSubjects = numSubjects;
        this.credits = new int[numSubjects];
        this.marks = new int[numSubjects];
    }

 
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for student: " + name);
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

  
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
        System.out.printf("SGPA: %.2f\n", calculateSGPA());
    }


    public double calculateSGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numSubjects; i++) {
            // Convert marks to grade points (assuming a simple scale)
            double gradePoint = 0;
            if (marks[i] >= 90) {
                gradePoint = 10;
            } else if (marks[i] >= 80) {
                gradePoint = 9;
            } else if (marks[i] >= 70) {
                gradePoint = 8;
            } else if (marks[i] >= 60) {
                gradePoint = 7;
            } else if (marks[i] >= 50) {
                gradePoint = 6;
            } else if (marks[i] >= 40) {
                gradePoint = 5;
            } else {
                gradePoint = 0; // Fail
            }

            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return totalCredits == 0 ? 0 : totalPoints / totalCredits; // Avoid division by zero
    }
}

class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); 

          
            students[i] = new Student(usn, name, numSubjects);
           
            students[i].acceptDetails();
        }

        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}