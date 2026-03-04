public class ExperimentalRemoteControlCar implements RemoteControlCar, Comparable<RemoteControlCar> {
    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public int compareTo(RemoteControlCar other) {
        return Integer.compare(this.getNumberOfVictories(), other.getNumberOfVictories());
    }
}
