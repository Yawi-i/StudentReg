package ie.atu;

public class Student {
    String studentName, studentPhone, studentemail; int studentAge;

    public Student(String name, String phone, String email, int age){      //Constructor
        studentName = name;
        studentPhone = phone;
        studentemail = email;
        studentAge = age;
    }

    public int Name(){
        int length = studentName.length();
        if (length < 3){
            throw new IllegalArgumentException("Name should be 3 letters or more");
        }
        return length;
    }

}
