package Game;

public class BoardGame extends Game{
    public int minPlayer;
    public int maxPlayer;
    public int timeLimit;
    public BoardGame (String description){super(description);}
    public BoardGame (String description, int minPlayer, int maxPlayer, int timeLimit){
        super(description);
        this.maxPlayer = maxPlayer;
        this.minPlayer = minPlayer;
        this.timeLimit = timeLimit;
    }
    public int getMaxPlayer() {return maxPlayer;}
    public void setMaxPlayer(int maxPlayer) {this.maxPlayer = maxPlayer;}
    public int getMinPlayer() {return minPlayer;}
    public void setMinPlayer(int minPlayer) {this.minPlayer = minPlayer;}
    public int getTimeLimit() {return timeLimit;}
    public void setTimeLimit(int timeLimit) {this.timeLimit = timeLimit;}
    @Override
    public String toString() {return super.toString() + "minPlayer=" + minPlayer + ", maxPlayer=" + maxPlayer +
                ", timeLimit=" + timeLimit +" minutes";
    }
}
