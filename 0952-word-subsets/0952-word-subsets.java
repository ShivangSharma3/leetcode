class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
         int[] targetFreq = new int[26]; // To store max frequency of each character in words2
        
        for (String word : words2) {
            int[] tempFreq = getFrequency(word);
            for (int i = 0; i < 26; i++) {
                targetFreq[i] = Math.max(targetFreq[i], tempFreq[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (String word : words1) {
            int[] wordFreq = getFrequency(word);
            if (isUniversal(wordFreq, targetFreq)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
    
    private boolean isUniversal(int[] wordFreq, int[] targetFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < targetFreq[i]) {
                return false;
            }
        }
        return true;

    }
}