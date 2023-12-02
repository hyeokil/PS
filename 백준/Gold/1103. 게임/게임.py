import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(x,y,cnt):
    global ans
    k = int(arr[x][y])
    if ans == -1 :
        return
    if ans < cnt :
        ans = cnt
    for dx,dy in [(k,0),(0,k),(-k,0),(0,-k)]:
        nx,ny = dx+x,dy+y
        if 0<=nx<N and 0<=ny<M and arr[nx][ny] != 'H' and done[nx][ny] < cnt+1 :
            if visited[nx][ny] :
                ans = -1
                return
            visited[nx][ny] = True
            dfs(nx,ny,cnt+1)
            visited[nx][ny] = False
    done[x][y] =cnt
N,M = map(int, input().split())
arr = [input() for _ in range(N)]
visited = [[False]*M for _ in range(N)]
done = [[0]*M for _ in range(N)]
visited[0][0] = True
ans = 1
dfs(0,0,1)
print(ans)
