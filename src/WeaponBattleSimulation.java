public class WeaponBattleSimulation {
    public static void main(String[] args) {
        Weapon gunOne = new Weapon("gunOne", 30);
        Weapon gunTwo = new Weapon("gunTwo", 50);
        Weapon[] weapons = {gunOne, gunTwo};

        Player hero = new Player("src.Hero", 100);
        Player villain = new Player("src.Villain", 100);

        System.out.println("The battle begins!");
        hero.equipWeapon(gunOne);
        villain.equipWeapon(gunOne);


        while (hero.isAlive() && villain.isAlive()) {
            int heroDamage = hero.getWeapon().getDamage();
            int villainDamage = villain.getWeapon().getDamage();

            villain.takeDamage(heroDamage);
            hero.takeDamage(villainDamage);

            System.out.println(hero.getName() + " attacks " + villain.getName() + " with " + hero.getWeapon() +
                    " causing " + heroDamage + " damage.");
            System.out.println(villain.getName() + " attacks " + hero.getName() + " with " + villain.getWeapon() +
                    " causing " + villainDamage + " damage.");

            System.out.println(hero.getName() + "'s health: " + hero.getHealth());
            System.out.println(villain.getName() + "'s health: " + villain.getHealth());
            System.out.println();
        }


        Player winner = hero.isAlive() ? hero : villain;
        System.out.println("The battle is over!");
        System.out.println(winner.getName() + " wins with " + winner.getHealth() + " health remaining.");
    }
}
