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

class Student extends School {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void getStudentName() {
        System.out.println("Student Name -> " + name);
    }
}

class Teacher extends School {
    private String teacherName;
    private String subjectName;

    Teacher(String teacherName, String subjectName) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
    }

    void getTeacherInfo() {
        System.out.println("Teacher Name ->" + teacherName);
        System.out.println("Subject Name ->" + subjectName);
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Student student = new Student("Venkata Sai");
        Teacher teacher = new Teacher("Mani", "Maths");
        student.getStudentName();
        teacher.getSchoolName();
        teacher.getTeacherInfo();
    }
}
//Since both Teacher and Student are extending the same class this is known as Hierarchial Inheritance