import sys
input = sys.stdin.readline


def Main():
    for tc in range(int(input())):
        N,M,K = map(int,input().split())
        arr = [[]for _ in range(N+1)]
        for i in range(K):
            u,v,c,d = map(int,input().split())
            arr[u].append((v,c,d))
        dp = [[float("inf")]*(M+1) for _ in range(N+1)]
        dp[1][0] = 0
        for cost in range(M+1):
            for node in range(1, N+1):
                if dp[node][cost] != float('inf'):
                    for next, nextC,nextD in arr[node]:
                        curC = cost + nextC
                        curD = dp[node][cost]+nextD
                        if curC > M:
                            continue
                        if dp[next][curC] > curD:
                            dp[next][curC] = curD
        ans = min(dp[N])
        if ans == float('inf'):print("Poor KCM")
        else:print(ans)
Main()
