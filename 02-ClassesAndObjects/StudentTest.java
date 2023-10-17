public class StudentTest {
        public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        Student s2 = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.studentID = 123456;
        s.isValid = false;
        s.semester = 3;
        s.avgGrade = 3.67;


        s2.age = 19;
        s2.name = "Norbert";
        s2.studentID = 654321;
        s2.isValid = true;
        s2.semester = 5;
        s2.avgGrade = 4.20;

        // s.sayHello();
        // s.displayName();
        // s.displayAge();

        // s2.sayHello();
        // s2.displayName();
        // s2.displayAge();

        s.displayStudent();

        s.changeIdCardStatus();
        System.out.println(s.isValid);
        
        System.out.println(s.isValid ? "valid" : "invalid");
    }
}

