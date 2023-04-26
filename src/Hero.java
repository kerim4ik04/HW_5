public class Hero {
    private int Health;
    private int Damage;
    private String superPower;

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public Hero(int health, int damage, String superPower) {
        Health = health;
        Damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}
