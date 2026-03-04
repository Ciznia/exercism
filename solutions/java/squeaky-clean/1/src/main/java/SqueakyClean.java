import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        String spaceReplaced = identifier.replaceAll(" ", "_");

        // Handle dash-followed-by-letter pattern
        Pattern pattern = Pattern.compile("-(\\w)");
        Matcher matcher = pattern.matcher(spaceReplaced);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        String result = sb.toString();

        // Apply remaining transformations
        return result.replaceAll(" ", "_")
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't')
                .replaceAll("[^a-zA-Z_]", "");
    }
}
