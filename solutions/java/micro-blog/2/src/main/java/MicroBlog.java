class MicroBlog {
    public String truncate(String input) {
        if (input.length() <= 5) {
            return input;
        }
        return input.codePoints().limit(5)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
