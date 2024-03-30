import sys
input = sys.stdin.readline

def Main():
    T = int(input())
    lst = [int(input()) for _ in range(T)]
    MX = max(lst)
    dp = [0]*(MX+1)
    for i in range(1,4):
        dp[i]+=1
        for j in range(i+1,MX+1):
            if dp[j-i]>0:
                dp[j]+=dp[j-i]
    for i in lst:
        print(dp[i])
Main()