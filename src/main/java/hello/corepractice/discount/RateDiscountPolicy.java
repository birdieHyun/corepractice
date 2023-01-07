package hello.corepractice.discount;

import hello.corepractice.member.Grade;
import hello.corepractice.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private final int DISCOUNT = 10;

    @Override
    public int Discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return price * DISCOUNT / 100;
        }

        return 0;
    }
}
