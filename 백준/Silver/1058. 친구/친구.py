import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = [input() for _ in range(N)]
    ans = 0
    for i in range(N):
        visited = [False]*N
        visited[i] = True
        res = 0
        for j in range(N):
            if arr[i][j] == "Y":
                visited[j] = True
                res += 1
        for j in range(N):
            if arr[i][j] == "Y":
                for k in range(N):
                    if arr[k][j] == "Y" and not visited[k]:
                        visited[k] = True
                        res += 1
        ans = max(ans,res)
    print(ans)

Main()