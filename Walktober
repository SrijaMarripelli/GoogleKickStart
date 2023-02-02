/*
Round G 2022 - Kick Start 2022
link to the problem - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb2e1/0000000000c174f2
*/

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=0;i<T;i++){
            int M = input.nextInt();
            int N = input.nextInt();
            int P = input.nextInt();
            int arr[][]=new int[M][N];
            int high;
            int count =0;
            for(int j=0;j<M;j++){
                for(int k=0;k<N;k++){
                    arr[j][k]=input.nextInt();
                }
            }
            for(int j=0;j<N;j++){
                high=0;
                for(int k=0;k<M;k++){
                    if(arr[k][j]>high){
                        high=arr[k][j];
                    }
                }
                for(int k=0;k<M;k++){
                    if(k+1==P){
                        count=count+(high-arr[k][j]); 
                    }
                }
            }
            System.out.println("Case #"+(i+1)+": "+count);
        }
    }
}
