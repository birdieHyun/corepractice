package hello.corepractice.discount;

import hello.corepractice.member.Grade;
import hello.corepractice.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int DISCOUNT = 1000;

    @Override
    public int Discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return DISCOUNT;
        }

        return 0;
    }
}
