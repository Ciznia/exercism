public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double sucess_rate = 0;
        if (speed >= 1 && speed <= 4)
            sucess_rate = 1;
        else if (speed >= 5 && speed <= 8)
            sucess_rate = 0.9;
        else if (speed == 9)
            sucess_rate = 0.8;
        else
            sucess_rate = 0.77;
        int raw_troughput = 221 * speed;
        double correct_car = raw_troughput * sucess_rate;
        return correct_car;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
