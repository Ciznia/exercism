class Acronym {

    private String acronym;

    Acronym(String phrase) {
        String split[] = phrase.split("\s");
        StringBuilder acronymBuilder = new StringBuilder();
        for (String word : split) {
            if (!word.isEmpty()) {
                acronymBuilder.append(word.charAt(0));
            }
        }
        this.acronym = acronymBuilder.toString().toUpperCase();
    }

    String get() {
        return this.acronym;
    }

}
