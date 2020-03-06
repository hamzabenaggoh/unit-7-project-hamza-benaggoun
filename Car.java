public abstract class Car {
    private int gasMiles;
    private int tankSize;
    private int crashTestRating;
    private String model;

    public Car(int gasMiles ,int tankSize , int crashTestRating , String model){
        this.gasMiles = gasMiles;
        this.tankSize = tankSize;
        this.crashTestRating = crashTestRating;
        this.model = model;
    }

    public int getGasMiles() {
        return gasMiles;
    }

    public int getTankSize() {
        return tankSize;
    }

    public int getCrashTestRating() {
        return crashTestRating;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        String result = "";
        result += model + "\n";
        result += "Gas miles : " + gasMiles + "\n";
        result += "Tank Size : " + tankSize + "\n";
        result += "CrashTestRating : " + tankSize + "\n";
        return result;
    }
}
