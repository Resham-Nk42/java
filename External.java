package SEE;

import CIE.Student;

public class External extends Student {
    private int[] externalMarks;

    
    public External(String usn, String name, int sem) {
        super(usn, name, sem);
        externalMarks = new int[5]; 
    }

    
    public void setExternalMarks(int[] marks) {
        if (marks.length == 5) {
            this.externalMarks = marks;
        } else {
            System.out.println("Error: Marks should be for 5 courses.");
        }
    }

    
    public int[] getExternalMarks() {
        return externalMarks;
    }

   
    public int[] getFinalMarks(int[] internalMarks) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i]; 
        }
        return finalMarks;
    }
}