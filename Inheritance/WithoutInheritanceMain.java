// import java.util.*;


// without inheritance

class School {
    private String name;

    School() {
        name = "DPS";
    }

    void getSchoolName() {
        System.out.println("School name =>" + name);
    }
}

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void getStudentName() {
        System.out.println("Student Name -> " + name);
    }
}

class WithoutInheritanceMain {
    public static void main(String[] args) {
        School school = new School();
        Student student = new Student("Venkata Sai");
        student.getStudentName();
        school.getSchoolName();
    }
}