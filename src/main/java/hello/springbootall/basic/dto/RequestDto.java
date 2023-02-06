package hello.springbootall.basic.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

public class RequestDto {

    @Data
    @Builder
    public static class Member {
        @NotNull(message = "이름 정보는 필수입니다.")
        private String name;
        @NotNull(message = "나이 정보는 필수입니다.")
        private Integer age;
    }

    @Data
    @Builder
    public static class Delivery {
        @NotNull(message = "가격 정보는 필수입니다.")
        private String price;
        @NotNull(message = "수량 정보는 필수입니다.")
        private String quantity;
    }

}