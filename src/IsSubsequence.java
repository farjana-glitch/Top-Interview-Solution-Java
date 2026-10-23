public class IsSubsequence {
    public boolean isSubsequence(String s , String t){
        int i = 0 ;
        int j = 0 ;
        while (i< s.length() && j< t.length() ){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
class IsSubsequenceDemo{
   public static void main(String[] args){
       IsSubsequence obj = new IsSubsequence();
       System.out.println(obj.isSubsequence("abc", "ahbgdc"));
       System.out.println(obj.isSubsequence("axc", "ahbgdc"));
       System.out.println(obj.isSubsequence("", "ahbgdc"));
    }
}
