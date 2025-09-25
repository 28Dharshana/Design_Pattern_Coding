public class Director {
    public House constructLuxuryHouse(HouseBuilder builder) {
        return builder.buildFoundation("Concrete")
                      .buildStructure("Brick")
                      .buildRoof("Tiles")
                      .addGarage()
                      .addSwimmingPool()
                      .addGarden()
                      .build();
    }

    public House constructBasicHouse(HouseBuilder builder) {
        return builder.buildFoundation("Concrete")
                      .buildStructure("Wood")
                      .buildRoof("Metal")
                      .build();
    }
}
