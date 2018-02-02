package jp.ac.uryukyu.ie.e145753;

public class Main {
    //回数
    private final static int NTRIAL = 1;

    public static void main(String[] args) {

        int nFlush = 0;
        int nOnePair = 0;
        int nTwoPair = 0;
        int nThreeCard = 0;
        int nFourCard = 0;
        int nFullHouse = 0;
        int nStraight = 0;
        int nStraightFlush = 0;
        int nRoyalStraightFlush = 0;
        for (int n = 0; n < NTRIAL; n++) {
            // カードの組
            CardStack aCardStack = new CardStack();
            Card[] cards = new Card[5];
            // 5枚カード
            /*for (int i = 0; i < 5; i++) {
                cards[i] = aCardStack.draw();
            }
            // 手札
            Hand hand = new Hand(cards);
            if (hand.isRoyalStraightFlush()) {
                nRoyalStraightFlush++;
            } else if (hand.isStraightFlush()) {
                nStraightFlush++;
            } else if (hand.isFlush()) {
                nFlush++;
            } else if (hand.isStraight()) {
                nStraight++;
            } else if (hand.isFourCard()) {
                nFourCard++;
            } else if (hand.isFullHouse()) {
                nFullHouse++;
            } else if (hand.isThreeCard()) {
                nThreeCard++;
            } else if (hand.isTwoPair()) {
                nTwoPair++;
            } else if (hand.isOnePair()) {
                nOnePair++;
            }*/
        }
        System.out.println("試行回数: " + NTRIAL + "回");
        System.out.println("ワンペア: " + nOnePair + "回．");
        System.out.println("ツーペア: " + nTwoPair + "回．");
        System.out.println("スリーカード: " + nThreeCard + "回．");
        System.out.println("ストレート: " + nStraight + "回．");
        System.out.println("フラッシュ: " + nFlush + "回．");
        System.out.println("フルハウス: " + nFullHouse + "回．");
        System.out.println("フォーカード: " + nFourCard + "回．");
        System.out.println("ストレートフラッシュ: " + nStraightFlush + "回．");
        System.out.println("ロイヤルストレートフラッシュ: " + nRoyalStraightFlush + "回．");
    }
}
