import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    mx = 0
    ans =1
    for i in range(N):
        visited = [False]*N
        visited[i] = True
        v = 0
        for j in range(5):
            for k in range(N):
                if not visited[k] and arr[i][j] == arr[k][j]:
                    visited[k]=True
                    v+=1
        if v>mx :
            mx = v
            ans = i+1
    print(ans)
Main()