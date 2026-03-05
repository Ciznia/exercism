import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        if (a == 'A') {
            return List.of("A");
        }
        int half_size = a - 'A' + 1;
        StringBuilder half = new StringBuilder();
        StringBuilder lineBuilder = new StringBuilder();
        StringBuilder diamondBuilder = new StringBuilder();
        for (int i = 0; i < half_size; i++) {
            char currentChar = (char) ('A' + i);
            lineBuilder.setLength(0);
            lineBuilder.append(" ".repeat(half_size - i - 1));
            lineBuilder.append(currentChar);
            lineBuilder.append(" ".repeat(half_size - i - 1));
            lineBuilder.append("\n");
            half.append(lineBuilder);
        }
        diamondBuilder.append(half);
        diamondBuilder.append(" ".repeat(half_size - 1 - 1)).append(a).append(" ".repeat(half_size - 1 - 1))
                .append("\n");
        diamondBuilder.append(half.reverse());
        return diamondBuilder.toString().lines().toList();
    }

}
