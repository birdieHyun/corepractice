package hello.corepractice.discount;

import hello.corepractice.member.Member;

public interface DiscountPolicy {

    int Discount(Member member, int price);

}
