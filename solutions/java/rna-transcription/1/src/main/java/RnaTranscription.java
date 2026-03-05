class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand.replace('G', 'C')
                .replace('C', 'G')
                .replace('T', 'A')
                .replace('A', 'U');
    }

}
