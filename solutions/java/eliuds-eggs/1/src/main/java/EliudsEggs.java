public class EliudsEggs {
    public int eggCount(int number) {
        int count = 0;
        int length = (int) (Math.log(number) / Math.log(2)) + 1;

        for (int i = 0; i < length; i++) {
            if ((number & (1 << i)) != 0) {
                count++;
            }
            number /= 2;
        }
        return count;
    }
}
