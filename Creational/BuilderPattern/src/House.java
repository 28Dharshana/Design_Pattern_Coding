public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void showHouse() {
        System.out.println("House with:");
        System.out.println("Foundation: " + foundation);
        System.out.println("Structure: " + structure);
        System.out.println("Roof: " + roof);
        System.out.println("Garage: " + (hasGarage ? "Yes" : "No"));
        System.out.println("Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
        System.out.println("Garden: " + (hasGarden ? "Yes" : "No"));
        System.out.println("---------------------------------");
    }
}
