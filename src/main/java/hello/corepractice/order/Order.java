package hello.corepractice.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discount;

    public Order(Long memberId, String itemName, int itemPrice, int discount) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discount = discount;
    }

    public int calculatePrice(int itemPrice, int discount) {
        return itemPrice - discount;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscount() {
        return discount;
    }
}
