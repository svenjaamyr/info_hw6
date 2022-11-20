public class Shuffle {
    private int number;
    public int getNumber(){
        return number;
    }
    public void Shuffle(){
        number = (int) (Math.random()*101);
    }
}
