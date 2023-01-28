package hello.springbootall.basic.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

public class RequestDto {

    @Data
    public static class Member {
        @NotNull
        private String name;
        @NotNull
        private int age;
    }

}