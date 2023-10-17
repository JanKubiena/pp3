public class Student {
    String name;
    int age;
    int studentID;
    boolean isValid;
    int semester;
    double avgGrade;


    // void sayHello(){
    //     System.out.println("Hello from "+name);
    // }
    // void displayName(){
    //     System.out.println(name);
    // }
    // void displayAge(){
    //     System.out.println(age);
    // }

    void displayStudent(){
        System.out.println("Student name: "+name+", semester: "+semester+", average grade: "+avgGrade);
    }
    void changeIdCardStatus(){
        if (isValid) {
            isValid = false;
        } else {
            isValid = true;
        }
    }

}
