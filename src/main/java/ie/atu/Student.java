package ie.atu;

public class Student {
    private String studentName, studentPhone, studentEmail;
    private int studentAge;

    public Student(String name, String phone, String email, int age){      //Constructor
        studentName = name;
        studentPhone = phone;
        studentAge = age;
        studentEmail=email;
    }

    public void setName(String Name){
        int length = Name.length();
        if (length >= 2){
            studentName = Name;
        }
        else {
            throw new IllegalArgumentException("Name should be 2 letters or more");
        }
    }

    public void setPhone(String Phone){
        int length = Phone.length();
        if (length == 10){
            studentPhone = Phone;
        }
        else{
            throw new IllegalArgumentException("Phone should be 10 numbers or more");
        }
    }

    public void setAge(int Age){
        if (Age >= 16){
            studentAge = Age;
        }
        else
        {
            throw new IllegalArgumentException("Age must be over 16");
        }
    }

    public void setEmail(String Email){
        int a;
        a = Email.indexOf('@');
        if (a != -1){
           studentEmail = Email;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Email");
        }
    }

    public String getName(){
        return studentName;
    }
    public String getPhone(){
        return studentPhone;
    }
    public int getAge(){
        return studentAge;
    }
    public String getEmail(){
        return studentEmail;
    }

}


