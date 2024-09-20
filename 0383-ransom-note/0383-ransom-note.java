class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i = 0;i<ransomNote.length();i++){
            int x = ransomNote.charAt(i) - 'a';
            arr1[x]++;
        }
        for(int i = 0;i<magazine.length();i++){
            int x = magazine.charAt(i) - 'a';
            arr2[x]++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            int x = ransomNote.charAt(i) - 'a';
            if(arr1[x]>arr2[x])return false;
        }
        return true;
    }
}