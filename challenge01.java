import java.util.*;



class Solution {

    int value(char c){
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        if(c=='M')
            return 1000;
        return 0;


    }
    public int romanToInt(String s) {
        //result
        int r = 0;

        for (int i=0;i<s.length();i++){
            //getting value into a[i]
            int a1 = value(s.charAt(i));

            //getting value into a[i+1]
            if(i+1<s.length()){
                int a2 = value(s.charAt(i+1));
                
                //compare values
                if(a1 >= a2){
                    r = r + a1;
                }
                else{
                    r = r + a2 - a1;
                    i++;
                }

            }
            else{
                r = r + a1;
            }
        }

        return r;

    }

    //main
    public static void main(String args[])
    {
        Solution ri = new Solution();

        //get input
        String s = "III";
        System.out.println(ri.romanToInt(s));
    }
    
}