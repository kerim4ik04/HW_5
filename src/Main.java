public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(999);
        boss.setAtakType("magic");
        System.out.println("health: " + boss.getHealth() + " damage: " + boss.getDamage() + " atak type: " + boss.getAtakType());
    }
}