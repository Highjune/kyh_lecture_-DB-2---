package hello.springbootall.basic.service;

import hello.springbootall.basic.dto.RequestDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Transactional
@Service
public class BasicService {

    public void doSomething(RequestDto.Member member) {
        log.info("this is member = " + member);
    }
}
