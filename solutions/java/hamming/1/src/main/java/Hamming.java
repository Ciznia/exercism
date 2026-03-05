public class Hamming {
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        int differenceCount = 0;
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                differenceCount++;
            }
        }
        this.hammingDistance = differenceCount;
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
}
