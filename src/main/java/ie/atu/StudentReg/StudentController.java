package ie.atu.StudentReg;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    private StudentService newService;

    public StudentController(StudentService newService){
        this.newService = newService;
    }
    public static void main(String[] args) {SpringApplication.run(StudentController.class, args);}

    @GetMapping("")
    public List<Student> getStudent()
    {
        return newService.getStudents();
    }
    @GetMapping("/{studentName}")
    public Student findStudent(@PathVariable String studentName)
    {
        return(Student) newService.getStudents(studentName);
    }

}
*/