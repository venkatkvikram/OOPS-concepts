
//PARENT CLASS OR SUPER CLASS
class School {
    private String name;

    School() {
        name = "DPS";
    }

    void getSchoolName() {
        System.out.println("School name =>" + name);
    }
}

//SUBCLASS OR CHILD CLASS
class Student extends School {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void getStudentName() {
        System.out.println("Student Name -> " + name);
    }
}

public class WithInheritanceMain {
    public static void main(String[] args) {
        Student studet = new Student("Venkata Sai");
        studet.getStudentName();
        studet.getSchoolName(); //has access to school class methods as it's inherited.
    }
}
