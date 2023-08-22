class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return name;
    }
}

