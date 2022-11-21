public class Player {
    private int currentCard;
    public int getCurrentCard(){
        return currentCard;
    }
    public void Play(){
        BetMore_Game Game1 = new BetMore_Game();
        currentCard = Game1.pick_card();
    }
}
