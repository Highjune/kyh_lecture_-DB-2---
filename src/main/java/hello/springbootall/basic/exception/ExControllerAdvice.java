package hello.springbootall.basic.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("hello.springbootall.basic.controller")
@Slf4j
public class ExControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorResult illegalExHandle(IllegalArgumentException e) {
        log.error("[exceptionHandle] ex", e);
        return new ErrorResult("BAD", e.getMessage());
    }

    /**
     * 가장 이상적
     * @ExceptionHanlder 에 예외 클래스를 지정하지 않으면 파라미터에(아래에선 UserException) 있는 것이 적용된다.
     * @ResponseStatus 로 고정적으로 상태코드를 쓰면 정적이므로, ResponseEntity 객체를 통해서 동적으로 내보낼 수 있다.
     */
//    @ExceptionHandler
//    public ResponseEntity<ErrorResult> userExHandle(UserException e) { // UserException ?
//        log.error("[exceptionHandle] ex", e);
//        ErrorResult errorResult = new ErrorResult("USER-EX", e.getMessage());
//        return new ResponseEntity<>(errorResult, HttpStatus.BAD_REQUEST);
//    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ErrorResult exHandle(Exception e) {
        log.error("[exceptionHandle] ex", e);
        return new ErrorResult("EX", "내부 오류");
    }}
