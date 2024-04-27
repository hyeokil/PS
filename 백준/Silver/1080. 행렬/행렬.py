import sys
input = sys.stdin.readline

def f(arr,x,y):
    for i in range(3):
        for j in range(3):
            arr[x+i][y+j]= abs(arr[x+i][y+j]-1)



N,M = map(int,input().split())
A = [list(map(int,input().rstrip())) for i in range(N)]
B = [list(map(int,input().rstrip())) for i in range(N)]
ans = 0
for i in range(N):
    for j in range(M):
        if A[i][j]!=B[i][j] and i+2<N and j+2<M:
            f(A,i,j)
            ans+=1
if A==B:
    print(ans)
else:
    print(-1)
