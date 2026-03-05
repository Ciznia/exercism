public class PangramChecker {

    public boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowerCaseInput.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

}
