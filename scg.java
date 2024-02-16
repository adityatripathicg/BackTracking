public class scg {

    public static int printSubstring(String str){
        int n = str.length();
            int count=0;
        for(int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
        }
        return count;
        
        
    }
    public static void main(String args[]){
        String str = "abcab";
        System.out.println(printSubstring(str));
    }
}