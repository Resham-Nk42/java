package CIE;

public class Internals {
    private int[] internalMarks;

    
    public Internals() {
        internalMarks = new int[5]; 
    }

   
    public void setInternalMarks(int[] marks) {
        if (marks.length == 5) {
            this.internalMarks = marks;
        } else {
            System.out.println("Error: Marks should be for 5 courses.");
        }
    }

    
    public int[] getInternalMarks() {
        return internalMarks;
    }
}
