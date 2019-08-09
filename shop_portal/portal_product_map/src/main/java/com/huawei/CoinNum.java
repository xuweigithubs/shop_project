package com.huawei;

public class CoinNum {
    public static void main(String[] args){
        CoinNum icon=new CoinNum();
        int[] dp=new int[3];
        dp[0]=5;
        dp[1]=10;
        dp[2]=20;
        int aimsNum= icon.getCoins(dp,30);
        System.out.print("这是第一个算法:"+aimsNum);
    }

    public int getCoins(int[] arr,int aims){
        if(arr==null||arr.length==0||aims<0){
            return 0;
        }
        int[][] dp=new int[arr.length][aims+1];
        for(int i=0;i<arr.length;i++){
           dp[i][0]=1;
        }
        for(int j=1;arr[0]*j<=aims;j++){
           dp[0][arr[0]*j]=1;
        }
        int num=0;
        for(int i=1;i<arr.length;i++){
           for(int j=1;j<=aims;j++){
               num=0;
               for(int k=0;j-arr[i]*k>=0;k++){
                  num+=dp[i-1][j-arr[i]*k];
               }
               dp[i][j]=num;
           }
        }
        return dp[arr.length-1][aims];
    }
}
