import java.util.List;

class HighScores {

    private List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.get(this.highScores.size() - 1);
    }

    Integer personalBest() {
        return this.highScores.stream().max(Integer::compareTo).orElse(null);
    }

    List<Integer> personalTopThree() {
        return this.highScores.stream().sorted((a, b) -> b.compareTo(a)).limit(3).toList();
    }

}
