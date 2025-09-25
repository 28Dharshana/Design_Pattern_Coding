public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Build a luxury house using the Director
        House luxuryHouse = director.constructLuxuryHouse(new HouseBuilder());
        System.out.println("Luxury House:");
        luxuryHouse.showHouse();

        // Build a custom house manually (without director)
        House customHouse = new HouseBuilder()
                .buildFoundation("Stone")
                .buildStructure("Glass")
                .buildRoof("Shingles")
                .addGarden()
                .build();

        System.out.println("Custom House:");
        customHouse.showHouse();
    }
}
