package Game;

public class TestGame {
    public static void main(String[] args) {
        PcBasedGame one = new PcBasedGame("Valorant" , 4 , 100 , 2);
        PcBasedGame two = new PcBasedGame("CS:GO" , 4 , 100 , 3);
        PcBasedGame three = new PcBasedGame("League Of Legend" , 4 , 100 , 4);
        TriviaGame four = new TriviaGame("Who want to millionaire: answer ..",
                1000000, 20);
        BoardGame five = new BoardGame("Hello Game:....", 3, 10, 10);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
    }
}
