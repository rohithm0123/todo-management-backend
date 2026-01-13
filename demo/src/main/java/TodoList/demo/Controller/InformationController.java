package TodoList.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {
     @GetMapping("/")
    public String homePage(){
         return "hie Welcome to our home page ";
     }

     @GetMapping("/info")
    public String infoPage(){
         return "info";
     }
}
