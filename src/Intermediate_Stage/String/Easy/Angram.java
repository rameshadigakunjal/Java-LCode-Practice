package Intermediate_Stage.String.Easy;

public class Angram {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
         //   System.out.println("Not Anagram");
         return false;
        }
        else{
            int count[]=new int[26];
            for(int i=0;i<m;i++){
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<26;i++){
                if(count[i]!=0){
                   // System.out.println("Not Anagram");
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Angram an = new Angram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(an.isAnagram(s, t)); // Output: true
        
    }
}
