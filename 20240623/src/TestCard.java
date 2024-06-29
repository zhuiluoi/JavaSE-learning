import java.util.ArrayList;
import java.util.List;

public class TestCard {
    public static void main(String[] args) {
        Cards cards = new Cards();
        List<Card> cardList = cards.buyCard();
        System.out.println("刚买回来的牌:");
        System.out.println(cardList);

        cards.shuffle(cardList);
        System.out.println("洗过的牌:");
        System.out.println(cardList);

        // 三个人，每个人轮流抓 5 张牌
        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                hands.get(j).add(cardList.remove(0));
            }
        }

        System.out.println("剩余的牌:");
        System.out.println(cardList);

        System.out.println("A 手中的牌:");
        System.out.println(hands.get(0));

        System.out.println("B 手中的牌:");
        System.out.println(hands.get(1));

        System.out.println("C 手中的牌:");
        System.out.println(hands.get(2));
    }
}
