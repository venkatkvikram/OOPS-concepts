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

// Middle Class OR Intermediate classs
class Student extends School {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void getStudentName() {
        System.out.println("Student Name -> " + name);
    }
}

// child class
class Parent extends Student {
    private String name;

    Parent(String name, String StudentName) {
        super(StudentName); // refers to parent class of this class which is student class in this case
        this.name = name;
    }

    void getParentName() {
        System.out.println("Parent Name -> " + name);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Parent parent = new Parent("Ravinder", "Venkata Sai");
        parent.getParentName();
        parent.getStudentName();// can access since it's extends the student class.
        parent.getSchoolName(); // can access since it extends the student class which extends the school class
                                // (2nd Level Inheritance)
    }
}
