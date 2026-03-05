class ResistorColorTrio {
    String label(String[] colors) {
        ResistorColor resistorColor = new ResistorColor();
        int firstDigit = resistorColor.colorCode(colors[0]);
        int secondDigit = resistorColor.colorCode(colors[1]);
        int multiplier = resistorColor.colorCode(colors[2]);
        long resistanceValue = (firstDigit * 10 + secondDigit) * (long) Math.pow(10, multiplier);
        String unit;
        if (resistanceValue >= 1_000_000_000) {
            resistanceValue /= 1_000_000_000;
            unit = "giga";
        } else if (resistanceValue >= 1_000_000) {
            resistanceValue /= 1_000_000;
            unit = "mega";
        } else if (resistanceValue >= 1_000) {
            resistanceValue /= 1_000;
            unit = "kilo";
        } else {
            unit = "";
        }
        return resistanceValue + unit + " ohms";
    }
}
