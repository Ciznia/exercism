
class ResistorColorDuo {
    int value(String[] colors) {
        ResistorColor resistorColor = new ResistorColor();
        int firstDigit = resistorColor.colorCode(colors[0]);
        int secondDigit = resistorColor.colorCode(colors[1]);
        return firstDigit * 10 + secondDigit;
    }
}
