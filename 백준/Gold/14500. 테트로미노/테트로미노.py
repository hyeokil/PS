import sys
input = sys.stdin.readline

def f1(x,y):
    A,B = 0,0
    if y+3<M :
        for i in range(4):
            A += arr[x][y+i]
    if x+3<N:
        for i in range(4):
            B += arr[x+i][y]
    return max(A,B)

def f2(x,y):
    S = 0
    if x+1<N and y+1<M :
        S = arr[x][y]+arr[x+1][y]+arr[x][y+1]+arr[x+1][y+1]
    return S

def f3(x,y):
    A, B, C, D,E,F,G,H= 0, 0, 0, 0,0,0,0,0
    if x+2<N and y+1<M :
        A = arr[x][y]+arr[x+1][y]+arr[x+2][y]+arr[x+2][y+1]
    if x+2<N and 0<=y-1 :
        B = arr[x][y]+arr[x+1][y]+arr[x+2][y]+arr[x+2][y-1]
    if 0<=x-1 and y+2<M :
        C = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x-1][y+2]
    if x+1<N and y+2<M :
        D = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+2]
    if 0<=x-2 and y+1<M:
        E = arr[x][y]+arr[x-1][y]+arr[x-2][y]+arr[x-2][y+1]
    if 0<=x-2 and 0<=y-1:
        F = arr[x][y]+arr[x-1][y]+arr[x-2][y]+arr[x-2][y-1]
    if 0<=x-1 and 0<=y-2 :
        G = arr[x][y]+arr[x][y-1]+arr[x][y-2]+arr[x-1][y-2]
    if x+1<N and 0<=y-2 :
        H = arr[x][y]+arr[x][y-1]+arr[x][y-2]+arr[x+1][y-2]
    return max(A,B,C,D,E,F,G,H)

def f4(x,y):
    A, B, C, D = 0, 0, 0, 0
    if x+2<N and y+1<M :
        A = arr[x][y]+arr[x+1][y]+arr[x+1][y+1]+arr[x+2][y+1]
    if x+2<N and 0<=y-1 :
        B = arr[x][y]+arr[x+1][y]+arr[x+1][y-1]+arr[x+2][y-1]
    if 0<=x-1 and y+2<M:
        C = arr[x][y]+arr[x][y+1]+arr[x-1][y+1]+arr[x-1][y+2]
    if x+1<N and y+2<M:
        D = arr[x][y]+arr[x][y+1]+arr[x+1][y+1]+arr[x+1][y+2]
    return max(A,B,C,D)

def f5(x,y):
    A,B,C,D =  0,0,0,0
    if x+1 <N and y+2<M :
        A = arr[x][y] + arr[x][y+1] + arr[x + 1][y + 1] + arr[x][y + 2]
    if 0<=x-1 and y+2<M:
        B = arr[x][y] + arr[x][y+1] + arr[x -1][y + 1] + arr[x][y + 2]
    if x+2<N and y+1<M:
        C = arr[x][y] + arr[x+1][y] + arr[x+ 1][y + 1] + arr[x+2][y]
    if x+2<N and 0<=y-1:
        D = arr[x][y] + arr[x+1][y] + arr[x+ 1][y - 1] + arr[x+2][y]
    return max(A,B,C,D)

N,M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
ans = 0
for i in range(N):
    for j in range(M):
        a = f1(i,j)
        b = f2(i, j)
        c = f3(i, j)
        d = f4(i, j)
        e = f5(i, j)
        ans = max(ans,a,b,c,d,e)
print(ans)