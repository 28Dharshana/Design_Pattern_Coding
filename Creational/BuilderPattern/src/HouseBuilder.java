public class HouseBuilder {
    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildFoundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildStructure(String structure) {
        house.setStructure(structure);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public HouseBuilder addGarage() {
        house.setGarage(true);
        return this;
    }

    public HouseBuilder addSwimmingPool() {
        house.setSwimmingPool(true);
        return this;
    }

    public HouseBuilder addGarden() {
        house.setGarden(true);
        return this;
    }

    public House build() {
        return house;
    }
}
