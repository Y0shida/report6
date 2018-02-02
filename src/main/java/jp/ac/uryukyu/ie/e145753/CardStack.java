package jp.ac.uryukyu.ie.e145753;

public class CardStack {
    private int nCard;

    private boolean[][] taken = new boolean[Card.NSUITS][Card.NCARDS_PER_SUIT];


    public CardStack() {

        nCard = Card.NSUITS * Card.NCARDS_PER_SUIT;
    }


    public Card draw() {
        if (nCard == 0) {
            return null;
        }

        while (true) {
            int s = (int) (Math.random() * Card.NSUITS);
            int n = (int) (Math.random() * Card.NCARDS_PER_SUIT);

            if (!taken[s][n]) {
                taken[s][n] = true;
                nCard--;
                //0から始まっているのであわせるために+1
                return new Card(s, n + 1);
            }
        }
    }
}
