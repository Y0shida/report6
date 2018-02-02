package jp.ac.uryukyu.ie.e145753;

public class Card {

    public final static int HEART = 0;
    public final static int DIAMOND = 1;
    public final static int SPADE = 2;
    public final static int CLUB = 3;

    public final static int NSUITS = 4;

    public final static int NCARDS_PER_SUIT = 13;

    private int suit;
    private int number;

    public Card(int suit, int number){
        this.number = number;
        this.suit = suit;
    }

    public int getNumber(){
        return number;
    }

    public int getSuit() {
        return suit;
    }


    public String toString() {

        String[] name = {"H", "D", "S", "C"};
        return name[suit] + number;
    }
}
