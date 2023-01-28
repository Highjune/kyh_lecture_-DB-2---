package hello.springbootall.basic.controller;

import hello.springbootall.basic.dto.RequestDto;
import hello.springbootall.basic.service.BasicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
@RequestMapping(value = "/basic/v1")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @PostMapping("/delivery")
    public ResponseEntity doSomething(@Valid @RequestBody RequestDto.Member member) {
        this.basicService.doSomething(member);
        return new ResponseEntity(HttpStatus.OK);
    }


}
