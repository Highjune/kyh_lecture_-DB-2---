package hello.springbootall.basic.controller;

import hello.springbootall.basic.dto.RequestDto;
import hello.springbootall.basic.service.BasicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Date;


@Slf4j
@RestController
@RequestMapping(value = "/basic/v1")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @PostMapping("/delivery")
    public ResponseEntity<Void> doSomething(@Valid @RequestBody RequestDto.Member member) {
        this.basicService.doSomething(member);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/delivery/something")
    public ResponseEntity<Void> doSomething2() {
        this.basicService.doSomething2();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<Void> doSomething3() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping("/test2")
    public ResponseEntity<ApiExceptionController.MemberDto> doSomething4(
//            @RequestBody ApiExceptionController.MemberDto memberDto) {
            ) {
        ApiExceptionController.MemberDto memberDto = ApiExceptionController.MemberDto.builder()
                .regDate(LocalDateTime.now())
                .memberId(4)
                .build();

        log.info("memberDto = " + memberDto);
        return new ResponseEntity<>(memberDto, HttpStatus.OK);
    }

}
