import java.util.HashMap;

public class HashMapImpementation {
    void main(){

        String str="banana";
        HashMap<Character,Integer>mp =new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(mp.containsKey(c))mp.put(c,mp.get(c)+1);
            else mp.put(c,1);
        }
        int maxi=Integer.MIN_VALUE;
        char ans= ' ';
        for(Character i: mp.keySet()){

            if(maxi<mp.get(i)){
                maxi=mp.get(i);
                ans=i;
            }
        }
        System.out.println(ans);
        System.out.println(mp);

        System.out.println(mp.put('z',1));// PUT RETURNS THE PREVIOUS //VALUEEEEE!!! IN THIS CASE IT WILL PRINT NULL AS NO Z OCCUR
        //PREVIOUSLY
        //mp.get(100) will give here null

    }
}
