package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class hello {
     @GetMapping("/")
     public String index() {
         return "Hello World from AnhVudev love uuu";
    }
    @GetMapping("/user")
     public String index_1() {
         return "Hello World from user";
    }
    @GetMapping("/admin")
     public String index_2() {
         return "Hello World from admin ";
    }

}
