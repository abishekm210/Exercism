class RnaTranscription {

    char conversion(char dna)
    {
        switch(dna)
        {
            case 'G': return 'C';
            case 'C': return 'G';
            case 'T': return 'A';
            case 'A': return 'U';
        }
        return 'Y';
    }

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        for(int i = 0 ; i < dnaStrand.length() ; i++)
        {
            rna.append(dnaStrand.charAt(i));
        }
        return dnaStrand.toString();
    }

}
