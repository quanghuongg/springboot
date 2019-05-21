package JavaSpringLearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String SayHello()
    {
        return "Hello World";
    }


}
