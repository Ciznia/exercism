import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    private static final Map<String, String> CODON_TO_ACID = new HashMap<>() {
        {
            put("AUG", "Methionine");
            put("UUU", "Phenylalanine");
            put("UUC", "Phenylalanine");
            put("UUA", "Leucine");
            put("UUG", "Leucine");
            put("UCU", "Serine");
            put("UCC", "Serine");
            put("UCA", "Serine");
            put("UCG", "Serine");
            put("UAU", "Tyrosine");
            put("UAC", "Tyrosine");
            put("UGU", "Cysteine");
            put("UGC", "Cysteine");
            put("UGG", "Tryptophan");
            put("UAA", "STOP");
            put("UAG", "STOP");
            put("UGA", "STOP");
        }
    };

    List<String> translate(String rnaSequence) {
        List<String> acids = new java.util.ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);
            String acid = CODON_TO_ACID.get(codon);
            if (acid.equals("STOP")) {
                break;
            }
            acids.add(acid);
        }
        return acids;

    }
}
