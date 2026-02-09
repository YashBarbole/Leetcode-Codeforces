package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t= sc.nextInt();

        while(t-->0){
            int n= sc.nextInt();
            String[][] words= new String[3][n];

            HashMap<String,Integer> mp= new HashMap<>();

            for(int p=0;p<3;p++){
                for(int i=0;i<n;i++){
                    String w= sc.next();
                    words[p][i]= w;
                    mp.put(w,mp.getOrDefault(w,0)+1);
                }
            }

            int[]scores= new int [3];

            for(int p=0;p<3;p++){
                for(int i=0;i<n;i++){
                    String w= words[p][i];

                    int count=mp.get(w);

                    if(count==1){
                        scores[p]+=3;
                    }
                    else if(count==2){
                        scores[p]+=1;
                    }
                }
            }
            System.out.println(scores[0] + " " + scores[1] + " " + scores[2]);

        }
        sc.close();
    }
}
