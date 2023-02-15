package hello.springbootall.basic;

import hello.springbootall.basic.service.BasicService;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


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
        Double a = 127.1310583573;
        Double b = 127.1310583574;

        System.out.println(a);
        System.out.println(b);
        System.out.println(Double.compare(a, b));

    }
}
