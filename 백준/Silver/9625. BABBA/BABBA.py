import sys
input = sys.stdin.readline

def Main():
    K = int(input())
    dp = [1]*(K+1)
    A = 0
    B = 1
    for i in range(2,K+1):
        dp[i] = dp[i-1]+dp[i-2]
        tmp = B
        B = B+A
        A = tmp
    print(A,B)
Main()