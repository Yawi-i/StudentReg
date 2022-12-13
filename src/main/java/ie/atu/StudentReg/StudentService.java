package ie.atu.StudentReg;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents()
    {
        List<Student>myStudents = List.of(
                new Student("John","0123456789","mail@mail.com",16),
                new Student("Joe","0123456789","mail1@mail.com",18),
                new Student("Johnson","0123456789","mail2@mail.com",21));
        return myStudents;
    }

    public Student getStudents(String studentName){
        Student found = new Student("Yael","0123456789","yael@mail.com",19);
        return found;

    }
}
