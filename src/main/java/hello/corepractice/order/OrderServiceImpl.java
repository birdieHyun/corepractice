package hello.corepractice.order;

import hello.corepractice.discount.DiscountPolicy;
import hello.corepractice.discount.FixDiscountPolicy;
import hello.corepractice.member.Member;
import hello.corepractice.member.MemberRepository;
import hello.corepractice.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.Discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
