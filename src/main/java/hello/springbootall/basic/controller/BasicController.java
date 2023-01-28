package hello.springbootall.basic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/basic")
public class BasicController {

    @GetMapping("/hi")
    public String mainPage() {
        return "hi";
    }

    @GetMapping("/hi2")
    public ResponseEntity basicFucntion() {
        return new ResponseEntity(HttpStatus.OK);
    }

}
