package hello.springbootall.kyh_lecture_db1.repository;

import hello.springbootall.kyh_lecture_db1.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Member findById(String memberId);
    void update(String memberId, int money);
    void delete(String memberId);
}
