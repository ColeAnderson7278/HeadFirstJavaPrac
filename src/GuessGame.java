public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1guess;
        int p2guess;
        int p3guess;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        while(true){
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1guess = p1.number;
            System.out.println("Player one guessed" + p1guess);

            p2guess = p2.number;
            System.out.println("Player two guessed" + p2guess);

            p3guess = p3.number;
            System.out.println("Player three guessed" + p3guess);

            if (p1guess == targetNumber){
                p1isRight = true;
            }

            if (p2guess == targetNumber){
                p2isRight = true;
            }

            if (p3guess == targetNumber){
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?" + p1isRight);
                System.out.println("Player two got it right?" + p2isRight);
                System.out.println("Player three got it right?" + p3isRight);
                System.out.println("Game over.");
                break;
            }
            else {
                System.out.println("Players we'll have to try again.");
            }
        }
    }
}
