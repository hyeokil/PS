import sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    arr = [input().rstrip() for _ in range(N)]
    ans = 1
    for k in range(1,min(N,M)+1):
        for i in range(N):
            for j in range(M):
                if i+k < N and j+k < M:
                    if arr[i][j] == arr[i][j+k] and arr[i][j] == arr[i+k][j] and arr[i][j] == arr[i+k][j+k]:
                        ans = (k+1)**2
    print(ans)
Main()