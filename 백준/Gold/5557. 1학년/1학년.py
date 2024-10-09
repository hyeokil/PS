import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = list(map(int,input().split()))
    res = lst[N-1]
    dp = [[0]*21 for _ in range(N-1)]
    dp[0][lst[0]] = 1
    for i in range(N-2):
        for j in range(21):
            if dp[i][j] !=0:
                n1 = j-lst[i+1]
                n2 = j+lst[i+1]
                if n1>=0:
                    dp[i+1][n1]+=dp[i][j]
                if n2<=20:
                    dp[i+1][n2]+=dp[i][j]
    print(dp[N-2][lst[N-1]])
Main()