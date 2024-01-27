package OOPs;


class StudentsClass{
    String name;
    static String school;

    public static void changeSchool(){
        school = "New School";
    }
}

public class StaticWord {
    public static void main(String[] args){
        StudentsClass.school = "CCSU";
        StudentsClass student1 = new StudentsClass();
        student1.name = "Rahul";
        System.out.println(student1.school);
    }
}
