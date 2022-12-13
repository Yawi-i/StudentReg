package ie.atu.StudentReg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/students")
public class StudentRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegApplication.class, args);
	}

	@GetMapping
	public List<Student> getStudents()
	{
		List<Student>myStudents = List.of(
			new Student("John","0123456789","mail@mail.com",16),
			new Student("Joe","0123456789","mail1@mail.com",18),
			new Student("Johnson","0123456789","mail2@mail.com",21));
	return myStudents;
	}
}

