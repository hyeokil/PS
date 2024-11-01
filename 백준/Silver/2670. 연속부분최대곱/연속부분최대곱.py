import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    dp = [0]*N
    n = float(input())
    if n>=1:
        dp[0]=n
    for i in range(1,N):
        n = float(input())
        dp[i] = max(dp[i-1]*n,n)
    print(f"{max(dp):.3f}")
Main()