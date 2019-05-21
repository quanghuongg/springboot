package JavaSpringLearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ListStudentController {
    @RequestMapping("list")
    public List<Student> getAllList()
    {
        return Arrays.asList(
                new Student("1","HuongNQ","1996"),
                new Student("1","ThanhNN","1996"),
                new Student("1","HungHH","1996")
        );
    }

}
