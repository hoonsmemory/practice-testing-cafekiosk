package sample.cafekiosk.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import sample.cafekiosk.spring.client.mail.MailSendClient;

// test 상에서 사용할 경우 자동으로 롤백된다. (비즈니스 로직 등 트랜잭션이 생성되어야 할 곳에 적용되어있지 않다면, 변경 감지 등 그런 작업이 누락될 수 있다.)
// 일반적으로 JpaRepository를 사용할 경우 내부적으로 @Transactional이 적용되어 있다.
//@Transactional

//JPA 관련한 빈만 주입
//리포지토리와 관련된 테스트를 수행할 때, 데이터베이스와 상호작용하는 코드에 집중하여 테스트할 수 있도록 설정
//@DataJpaTest

@ActiveProfiles("test") // test 프로파일 설정
@SpringBootTest
public abstract class IntegrationTestSupport {

    //동일한 테스트 환경이라도 @MockBean 이 있다면 환경이 달라져 환경을 다시 초기화 한다.
    @MockBean
    protected MailSendClient mailSendClient;
}
