class Solution {
    public int minimumDeletions(String s) {
        if (s.length() == 1) {
            return 0;
        }
        
        int count = 0;
        int count1 = 0;
        int delete = Integer.MAX_VALUE;
        
        // Counting the number of 'a's in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }   
        }
        
        // Calculating the minimum deletions required
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                count1++;
            } else {
                count--;
            }
            delete = Math.min(delete, count1 + count);
        }
        
        return Math.min(delete, Math.min(count1, s.length() - count1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage
        String s = "aababbab";
        int result = solution.minimumDeletions(s);
        
        System.out.println("Minimum deletions required: " + result);
    }
}
