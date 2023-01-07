package hello.corepractice.order;

import hello.corepractice.member.Grade;
import hello.corepractice.member.Member;
import hello.corepractice.member.MemberService;
import hello.corepractice.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    @Test
    @DisplayName("주문 테스트")
    void checkOrder() {
        //given
        OrderService orderService = new OrderServiceImpl();
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        Long memberId = member.getId();

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        Assertions.assertThat(order.getDiscount()).isEqualTo(1000);
    }


}
