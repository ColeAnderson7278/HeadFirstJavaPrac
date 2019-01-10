public class Battle {
    private Gladiator player1;
    private Gladiator player2;
    private Boolean setUpComplete = false;
    private Boolean bothAlive = true;

    public Battle(Gladiator player1, Gladiator player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void attack(Gladiator attacker, Gladiator defender){
        Integer newHealth = defender.getHealth() - attacker.getStrength();
        defender.setHealth(newHealth);
    }
}
