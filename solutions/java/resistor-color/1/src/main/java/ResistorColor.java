class ResistorColor {

    private static final String[] COLOR_CODES = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    };

    int colorCode(String color) {
        for (int i = 0; i < COLOR_CODES.length; i++) {
            if (COLOR_CODES[i].equals(color)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid color: " + color);
    }

    String[] colors() {
        return COLOR_CODES;
    }
}
