package sdf;

public class Zelda {
    
    public static void main(String[] args) {
        Monster monster = new Monster();
        RockMonster rockMonster = new RockMonster();
        Link link = new Link();
        Tree tree = new Tree();

        link.attack(rockMonster);
        link.attack(monster);
        link.attack(tree);

        link.attack(monster);
        if (monster.isDead()) {
            System.out.println("You win");
        }
    }
}
