public class Gladiator {
    private String name;
    private Integer health;
    private Integer strength;

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

    public void showStats(){
        System.out.println(name);
        System.out.println("Health: " + health + " Strength: " + strength);
    }
}
