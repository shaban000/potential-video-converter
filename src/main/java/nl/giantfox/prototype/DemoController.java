package nl.giantfox.prototype;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "api/hello")
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }

}