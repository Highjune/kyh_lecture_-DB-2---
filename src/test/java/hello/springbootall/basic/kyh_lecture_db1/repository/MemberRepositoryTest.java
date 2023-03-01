package hello.springbootall.basic.kyh_lecture_db1.repository;

import hello.springbootall.kyh_lecture_db1.domain.Member;
import hello.springbootall.kyh_lecture_db1.repository.MemberRepositoryVO;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

@Slf4j
class MemberRepositoryTest {

    MemberRepositoryVO repository = new MemberRepositoryVO();

    @Test
    void crud() throws SQLException {
        //save
        Member member = new Member("memberV4", 10000);
        repository.save(member);

        //findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember={}", findMember);
        log.info("membrer == findMember {}", member == findMember);
        log.info("membrer equals findMember {}", member.equals(findMember));
        Assertions.assertThat(findMember).isEqualTo(member);
    }
}
