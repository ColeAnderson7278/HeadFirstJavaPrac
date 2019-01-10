public class Gladiator {
    private String name;
    private Integer health;
    private Integer strength;
    public Boolean isDead = false;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public Integer getHealth(){
        return health;
    }

    public void setHealth(Integer newHealth){
        health = newHealth;
    }

    public Integer getStrength(){
        return strength;
    }

    public void setStrength(Integer newStrength) {
        strength = newStrength;
    }

    public Boolean getIsDead(){
        return isDead;
    }

    private void setIsDead(Boolean newDeadStatus){
        isDead = newDeadStatus;
    }

    public void showStats(){
        System.out.println(name);
        System.out.println("Health: " + health + " Strength: " + strength);
    }
}
