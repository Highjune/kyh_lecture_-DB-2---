package hello.springbootall.basic.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Errors {

    GENERAL_UNKNOWN_ERROR(-10, "에러", "알 수 없는 에러가 발생했습니다"),
    GENERAL_WRONG_PARAM(-11, "에러", "파라미터가 정보가 잘못되었습니다.")
    ;


    private final int code;
    private final String title;
    private final String message;
}
