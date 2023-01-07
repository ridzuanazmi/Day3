package sdf;

public class RockMonster extends Monster {

    // Constructors
    public RockMonster() { }
    public RockMonster(int health) {
        this.health = health;
     }

    @Override
    public void hit(int damage) {
        this.health -= damage * 5;
    }

}
