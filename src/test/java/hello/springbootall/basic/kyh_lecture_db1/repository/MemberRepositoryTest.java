package hello.springbootall.basic.kyh_lecture_db1.repository;

import hello.springbootall.kyh_lecture_db1.domain.Member;
import hello.springbootall.kyh_lecture_db1.repository.MemberRepositoryVO;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class MemberRepositoryTest {

    MemberRepositoryVO memberRepositoryVO = new MemberRepositoryVO();

    @Test
    void save() throws SQLException {
        Member member = new Member("memberV1", 10000);
        memberRepositoryVO.save(member);
    }
}
