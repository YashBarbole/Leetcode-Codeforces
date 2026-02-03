package CodeForces;
import java.util.*;
public class Favorite_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n= sc.nextInt();
            long b[]= new long[n];

            for(int i=0;i<n;i++){
                b[i]=sc.nextLong();
            }

            long a[]= new long[n];
            int l=0,r=n-1;

            for(int i=0;i<n;i++){
                if(i%2==0){
                    a[i]=b[l++];

                }
                else{
                    a[i]=b[r--];
                }
            }
            StringBuilder sb= new StringBuilder();
            for(long x:a){
                sb.append(x).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
