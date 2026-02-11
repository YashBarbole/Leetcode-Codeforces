package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class redstone {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            HashMap<Integer,Integer> mp= new HashMap<>();
            
            boolean ok= false;
             for(int i=0;i<n;i++){
                int x=sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0)+1);

                if(mp.get(x)>2){
                    ok=true;
                }
             }

             if(true){
                System.out.println("YES");
             }
             else System.out.println("NO");

    }
}}
