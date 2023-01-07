package hello.corepractice.discount;

import hello.corepractice.member.Grade;
import hello.corepractice.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiscountTest {

    @Test
    @DisplayName("VIP 할인 잘 되는지")
    void checkVIP() {
        //given
        DiscountPolicy discountPolicy = new FixDiscountPolicy();
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        int discount = discountPolicy.Discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);


    }
}
