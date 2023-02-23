package hello.springbootall.basic;

import hello.springbootall.basic.controller.ApiExceptionController;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.pl.REGON;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.NotNull;


@Slf4j
public class TestAnything {


    @Test
    public void testAnything() {
        Car car = new Car();
        log.info("car = " + car);
    }

    @ToString
    @NoArgsConstructor(force = true)
//    @NoArgsConstructor
    public static class Car {

        private Long id;
        private String name;
        private String description;
    }

}
