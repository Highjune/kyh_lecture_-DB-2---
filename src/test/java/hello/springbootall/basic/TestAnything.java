package hello.springbootall.basic;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.NotNull;


@Slf4j
public class TestAnything {



    @Test
    public void testAnything() {
    }

    @ToString
    @Value
    @AllArgsConstructor
    public static class Car {

        private Long id;
        private String name;
        private String description;
    }

}
