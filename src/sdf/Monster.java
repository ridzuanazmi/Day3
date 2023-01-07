package sdf;

public class Monster implements Damageable {

    protected int health = 10;

    // Constructors
    public Monster() { }
    public Monster(int health) { this.health = health;}

    // Getters and Setters
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return health <=0;
    }

    @Override
    public void hit(int damage) {
        this.health -= damage;
    }
    
}