package lt.viko.eif.neinoris.soap.student;

import io.spring.guides.gs_producing_web_service.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class StudentRepository {
    private static final Map<String, Student> students = new HashMap<>();

    @PostConstruct
    public void initData(){
        Student studentas1 = new Student();
        studentas1.setName("Nikolas");
        studentas1.setSurname("Einoris");
        studentas1.setAge(20);

        students.put(studentas1.getName(), studentas1);

        Student studentas2 = new Student();
        studentas2.setName("Mantas");
        studentas2.setSurname("Pavardenis");
        studentas2.setAge(18);

        students.put(studentas2.getName(), studentas2);

        Student studentas3 = new Student();
        studentas3.setName("Testing");
        studentas3.setSurname("StudentTesting");
        studentas3.setAge(22);

        students.put(studentas2.getName(), studentas2);

    }
    public Student findStudent(String name){
        Assert.notNull(name, "The student's name must not be null");
        return students.get(name);
    }

}
