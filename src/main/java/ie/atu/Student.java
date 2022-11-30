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
        if (length < 2){
            throw new IllegalArgumentException("Name should be 3 letters or more");
        }
        return length;
    }

    public int Phone(){
        int length = studentPhone.length();
        if (length < 7){
            throw new IllegalArgumentException("Phone should be 10 numbers or more");
        }
        return length;
    }

    public int Age(){
        if (studentAge < 16){
            throw new IllegalArgumentException("Age must be over 16");
        }
        return studentAge;
    }

    public String Email(){

        return studentemail;
    }
}
