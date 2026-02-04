package CodeForces;

import java.util.Scanner;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();

        int remTime= 240-k;
        int timeSpent=0;
        int solved=0;

        for(int i=0;i<n;i++){
            timeSpent=5*i;
            if(timeSpent<=remTime){
                solved++;
            }
            else{
                break;
            }
        }

        System.out.println(solved);

    }
}
