package hello.springbootall.basic;

import hello.springbootall.basic.service.BasicService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@SpringBootTest
public class TestAnything {

    @Autowired
    private BasicService basicService;

    @Test
    public void testAnything() {
        this.basicService.doSomething2();
    }

    @Test
    public void testtest() {
        AtomicInteger atomicInteger = new AtomicInteger(4);
    }

    @AllArgsConstructor
    public class Car {
        private String name;
        private int age;
    }
}
