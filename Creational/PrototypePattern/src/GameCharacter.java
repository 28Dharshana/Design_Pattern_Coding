public class GameCharacter implements Cloneable {
    private String name;
    private String type;
    private int health;
    private int power;

    public GameCharacter(String name, String type, int health, int power) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void showCharacter() {
        System.out.println("Character: " + name);
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
        System.out.println("----------------------------");
    }

    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
