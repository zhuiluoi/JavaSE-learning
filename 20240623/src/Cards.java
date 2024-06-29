import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
    public static final String[] suits = {"♠", "♥", "♣", "♦"};

    public List<Card> buyCard() {
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                int rank = j;
                String suit = suits[i];
                Card card = new Card(rank, suit);
                cardList.add(card);
            }
        }
        return  cardList;
    }

    public void shuffle(List<Card> cardList) {
        Random random = new Random(20240623);
        for (int i = cardList.size()-1; i >0; i--) {
            int randIndex = random.nextInt(i);
            swap(cardList, i, randIndex);
        }
    }

    private void swap(List<Card> cardList, int i, int j) {
        Card tmp = cardList.get(i);
        cardList.set(i, cardList.get(j));
        cardList.set(j, tmp);
    }


}
