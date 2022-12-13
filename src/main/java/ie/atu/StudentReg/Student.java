package ie.atu.StudentReg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Student {
    private String studentName, studentPhone, studentemail; int studentAge;

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
