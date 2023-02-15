package hello.springbootall.basic.service;

import hello.springbootall.basic.constant.Errors;
import hello.springbootall.basic.dto.RequestDto;
import hello.springbootall.basic.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Slf4j
@Transactional
@Service
public class BasicService {

    public void doSomething(RequestDto.Member member) {
        log.info("this is member = " + member);
    }

    public void doSomething2() {
        System.out.println("here");
    }

    public void checkValidation (Object object) {

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(object);
        StringBuilder stringBuilder = new StringBuilder();

        for (ConstraintViolation<Object> violation : violations) {
            stringBuilder.append(String.format("%s : %s \r\n", violation.getInvalidValue(), violation.getMessage()));
        }

        if (violations.size() > 0) {
            log.error(stringBuilder.toString());
            throw new CommonException(Errors.GENERAL_WRONG_PARAM);
        }
    }

}
