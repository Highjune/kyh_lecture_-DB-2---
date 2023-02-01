package hello.springbootall.basic.exception;

import hello.springbootall.basic.constant.Errors;
import lombok.Getter;

@Getter
public class CommonException extends RuntimeException {

    private Errors error;
    private String message;

    public CommonException(Errors e) {
        this.error = e;
        this.message = e.getMessage();
    }

    public CommonException(Errors e, String message) {
        this.error = e;
        this.message = message;
    }

}
