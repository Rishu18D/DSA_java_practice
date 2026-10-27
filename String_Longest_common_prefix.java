import java.util.*;
public class String_Longest_common_prefix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.nextLine();
        String str[]=new String[n];

        for(int i=0;i<n;i++)
        {
            str[i]=scn.nextLine();
        }
        System.out.println( "Longest common prefix is: "+ lcp(str));

    }
    static String lcp(String [] str){

        if(str==null || str.length==0){
            return "";
        }
       String prefix=str[0];
            
        for(int i=1;i<str.length;i++){

            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }

            }

        }
        return prefix;
    }
}
