public class JedliksToyCar {
    private int distance = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (distance >= 2000) {
            return "Battery empty";
        }
        return "Battery at " + (100 - distance / 20) + "%";
    }

    public void drive() {
        if (100 - distance / 20 > 0) {
            distance += 20;
        }
    }

}
