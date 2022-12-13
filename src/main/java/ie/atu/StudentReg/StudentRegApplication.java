package ie.atu.StudentReg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/students")
public class StudentRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegApplication.class, args);
	}

	@GetMapping("api/students")
	public List<Student> getStudents()
	{
		StudentService myService =  new StudentService();
		return myService.getStudents();
	}
	@GetMapping("")
	public Student getStudents(@PathVariable String studentName){
		Student found = new Student("Yael","0123456789","yael@mail.com",19);
		return found;

	}
}

