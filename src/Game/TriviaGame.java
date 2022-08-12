package Game;

public class TriviaGame extends Game{
    public int moneyPrize;
    public int numQuest;
    public TriviaGame(String description){super(description);}
    public TriviaGame(String description, int moneyPrize, int numQuest){
        super(description);
        this.moneyPrize = moneyPrize;
        this.numQuest = numQuest;
    }
    public int getMoneyPrize() {return moneyPrize;}
    public void setMoneyPrize(int moneyPrize) {this.moneyPrize = moneyPrize;}
    public int getNumQuest() {return numQuest;}
    public void setNumQuest(int numQuest) {this.numQuest = numQuest;}
    @Override
    public String toString() {
        return super.toString() +
                "moneyPrize=" + moneyPrize +
                ", numQuest=" + numQuest +
                '}';
    }
}
