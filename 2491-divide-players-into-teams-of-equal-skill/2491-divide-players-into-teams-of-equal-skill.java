class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int s = 0;
        int e = skill.length-1;
        int ts = skill[e] + skill[s];
        long ans = 0;
        while(s<e){
            if(skill[e] + skill[s] != ts) return -1;
            ans+= (long) skill[e]*skill[s];
            s++;
            e--;
        }
        return ans;
    }
}