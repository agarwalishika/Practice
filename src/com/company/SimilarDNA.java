package com.company;

public class SimilarDNA {
    static int similarDNA(String reference, String[] candidates) {
        int numSim = 0;

        for (int i = 0; i < candidates.length; i++) {
            if (areSimilar(candidates[i], reference)) {
                numSim++;
            }
        }

        return numSim;
    }

    private static boolean areSimilar(String cand, String ref) {
        int c = 0;
        int r = 0;
        String candTemp = cand + cand;
        String refTemp = ref + ref;

        int clen = cand.length();
        int ctlen = candTemp.length();
        int rtlen = refTemp.length();


        while (c < ctlen - clen && r < rtlen - clen) {
            int numMistakes = 0;
            char firstOfCand = candTemp.charAt(c);
            r = ref.indexOf(firstOfCand);
            for(int i = 0; r >= 0 && i < clen; i++) {
                if (candTemp.charAt(c + i) != refTemp.charAt(r + i)) {
                    numMistakes++;
                }
            }

            if (r >= 0 && numMistakes <= 3) {
                return true;
            } else {
                c++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] a = {"GAAATTT",
                "AAATTTG",
                "GAATTTT"};
        String b = "GAAAAAA";
        System.out.println(similarDNA(b, a));
    }
}
