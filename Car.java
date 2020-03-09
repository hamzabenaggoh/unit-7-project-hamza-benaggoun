public abstract class Car {
    //private int gasMiles;
    //private int tankSize;
    private int crashTestRating;
    private double airBagExpTime;

    public Car(int crashTestRating , double airBagExpTime){
        //this.gasMiles = gasMiles;
        //this.tankSize = tankSize;
        this.crashTestRating = crashTestRating;
        this.airBagExpTime = airBagExpTime;
    }
    public abstract int roadTripWorthy();
    public int safetyLevel(){
        return crashTestRating * (int) airBagExpTime;
    }
    /*
    public int getGasMiles() {
        return gasMiles;
    }

    public int getTankSize() {
        return tankSize;
    }
    */
    public int getCrashTestRating() {
        return crashTestRating;
    }

    public double getAirBagExpTime() {
        return airBagExpTime;
    }

    public String toString() {
        String result = "";
        //result += "Gas miles : " + gasMiles + "\n";
       //result += "Tank Size : " + tankSize + "\n";
        result += "CrashTestRating : " + tankSize + "\n";
        result += "Air bag Explosion time: " + airBagExpTime;
        return result;
    }
}
