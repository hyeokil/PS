def f(x,y):
    for dx,dy in [(1,0),(-1,0),(0,1),(0,-1)]:
        nx,ny = x+dx,y+dy
        while 0<=nx<N and 0<=ny<N:
            if arr[nx][ny]=="X":
                nx+=dx
                ny+=dy
            elif arr[nx][ny]=="S":
                return False
            else:
                break
    return True

def dfs(cnt):
    if cnt==0:
        res = True
        for i in range(N):
            for j in range(N):
                if arr[i][j]=="T":
                    res &= f(i,j)
        return res
    ans = False
    for i in range(N):
        for j in range(N):
            if arr[i][j]=="X":
                arr[i][j]="O"
                ans |= dfs(cnt-1)
                arr[i][j]="X"
    return ans

N=int(input())
arr=[list(input().split()) for _ in range(N)]
if dfs(3):
    print("YES")
else:
    print("NO")