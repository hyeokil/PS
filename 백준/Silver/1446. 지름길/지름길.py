import sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    arr = []
    for i in range(N):
        a,b,c = map(int,input().split())
        if b <= M and c < b-a :
            arr.append((a,b,c))
    arr.sort(key=lambda x:x[1])
    dp = [i for i in range(M+1)]
    for a,b,c in arr:
        if dp[b] > dp[a]+c:
            dp[b] = dp[a]+c
            for j in range(b+1,M+1):
                dp[j] = dp[j-1]+1
    print(dp[M])
Main()