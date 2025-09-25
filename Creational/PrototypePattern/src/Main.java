public class Main {
    public static void main(String[] args) {
        // Create prototypes
        GameCharacter warrior = new GameCharacter("DefaultWarrior", "Warrior", 100, 80);
        GameCharacter mage = new GameCharacter("DefaultMage", "Mage", 70, 120);

        // Register prototypes
        CharacterRegistry registry = new CharacterRegistry();
        registry.addPrototype("warrior", warrior);
        registry.addPrototype("mage", mage);

        // Clone characters
        GameCharacter warrior1 = registry.getClonedCharacter("warrior");
        warrior1.setName("WarriorX");
        warrior1.setPower(90);

        GameCharacter mage1 = registry.getClonedCharacter("mage");
        mage1.setName("MageY");
        mage1.setPower(130);

        // Show characters
        System.out.println("Original Prototypes:");
        warrior.showCharacter();
        mage.showCharacter();

        System.out.println("Cloned Characters:");
        warrior1.showCharacter();
        mage1.showCharacter();
    }
}
