class ProductionRemoteControlCar implements RemoteControlCar, Comparable<RemoteControlCar> {

    private int distanceTravelled = 0;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    private int numberOfVictories = 0;

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(RemoteControlCar other) {
        return Integer.compare(this.getNumberOfVictories(), other.getNumberOfVictories());
    }
}
