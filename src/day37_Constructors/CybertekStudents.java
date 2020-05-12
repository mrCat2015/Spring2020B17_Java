package day37_Constructors;

public class CybertekStudents {
    static String schoolName = "Cybertek School";
    String studentName;//we must need to know
    int groupNumber;//we must need to know
    String batch;//we must need to know

    public CybertekStudents(String studentName, int groupNumber, String batch){
       // schoolName = "Cybertek";

        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return studentName + ", "+groupNumber+", "+batch+ ", "+schoolName;
    }



}

class CObjects{
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Marina", 4, "Batch 18");
      //  student1.schoolName = "Cybertek School";
        System.out.println(student1);
        CybertekStudents student2 = new CybertekStudents("Lina", 6, "Batch 18" );
        System.out.println(student2);
        CybertekStudents student3 = new CybertekStudents("Nigina", 8, "Batch 18");

    }


}
