package Task.Polimorphism;
/*
Task01:
    1. create an interface named onlineEducation
            variable: boolean onlineStudent
            abstract methods: attendClass();
    2. create an interface named Cybertek that can inherit from online education
            variable: schoolName, requiresITBackGround
    3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
            private variables: studentName, age, grade, has_ITBackGround
            encapsulate all private variables
            actions: studying(), takingBreaks(), toString()
    4. create a class named CybertekSchool
            create 5 objects of students and set your classmates' info
            create a list of Cybertek and store all student objects
            iterate the list to display the full information of students
 */
interface onlineEducation {
    boolean onlineStudent = true;

    void attendClass();

}
interface Cybertek extends onlineEducation{
    static String schoolName = "Cybertek";
    boolean requiresITBackGround = false;

}

class Student implements onlineEducation, Cybertek{

    @Override
    public void attendClass() {

    }
    private String studentName;
    private int age;
    private char grade;
    private boolean has_ITBackGround;

    public Student (String studentName, int age, char grade, boolean has_ITBackGround){
       setStudentName(studentName);
       setAge(age);
       setGrade(grade);
       setHas_ITBackGround(has_ITBackGround);


    }

    public String getStudentName() {
        return studentName;
    }
    public int getAge() {
        return age;
    }
    public int getGrade() {
        return grade;
    }
    public boolean getHas_ITBackGround() {
        return has_ITBackGround;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


    public void setHas_ITBackGround(boolean has_ITBackGround) {
        this.has_ITBackGround = has_ITBackGround;
    }


    public void studying(){
        System.out.println(getStudentName()+ " is studying ");

    }
    public void takingBreaks(){
        System.out.println(getStudentName()+" is taking break");

    }
   // public String toString(){
    //    return setStudentName()+" "+setAge()+" "+setGrade() + " " +setHas_ITBackGround()+"\n";
  //  }
}
