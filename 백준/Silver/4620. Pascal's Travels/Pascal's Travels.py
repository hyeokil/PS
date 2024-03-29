import sys
input = sys.stdin.readline

def Main():
    while True:
        N = int(input())
        if N == -1:
            break
        arr = [input() for _ in range(N)]
        dp = [[0]*N for _ in range(N)]
        dp[0][0] = 1
        for i in range(N):
            for j in range(N):
                if arr[i][j] == '0':
                    continue
                tmp = int(arr[i][j])
                if i+tmp<N:
                    dp[i+tmp][j] +=dp[i][j]
                if j+tmp<N:
                    dp[i][j+tmp] +=dp[i][j]
        print(dp[N-1][N-1])
Main()