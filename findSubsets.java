public class findSubsets{
    public static void findSubs(String str, int i, String ans){
        //Base Case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("Null");
                return;
            }else{
                System.out.println(ans);
                return;
            }
        }
        //Recursion
        findSubs(str, i+1, ans+str.charAt(i)); // Yes
        findSubs(str, i+1, ans); //no
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubs(str, 0, "");

    }
}