/*
Coding Practice with Kick Start Session #1 - Kick Start 2022
link to the problem - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4332/0000000000942404
*/

import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=0;i<T;i++){
            int N =input.nextInt();
            int M =input.nextInt();
            int can[]=new int[N];
            int sum=0;
            for(int j=0;j<N;j++){
                can[j]=input.nextInt();
                sum=sum+can[j];
            }
            int rem=sum%M;
            System.out.println("Case #"+(i+1)+": "+rem);
        }
    }
}
