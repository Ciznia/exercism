class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        int length = 0;

        for (int i = numberToCheck; i > 0; i /= 10) {
            length++;
        }

        for (int i = numberToCheck; i > 0; i /= 10) {
            int digit = i % 10;
            sum += Math.pow(digit, length);
        }
        return sum == numberToCheck;
    }

}
