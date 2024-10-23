import sys
input = sys.stdin.readline
def Main():
    dx = [0,0,1,1,1,-1,-1,-1]
    dy = [-1,1,0,1,-1,0,1,-1]

    while True :
        N,M= map(int,input().split())
        if N==0 and M==0: break
        arr = [list(input().rstrip()) for _ in range(N)]
        for i in range(N):
            for j in range(M):
                if arr[i][j] == "*":
                    for k in range(8):
                        ni = i+dx[k]
                        nj = j+dy[k]
                        if 0<=ni<N and 0<=nj<M and arr[ni][nj] != "*":
                            if arr[ni][nj] == ".":
                                arr[ni][nj] = 1
                            else:
                                arr[ni][nj] += 1
        for i in range(N):
            ans = ""
            for j in range(M):
                if arr[i][j] == ".":
                    arr[i][j] = 0
                ans+=str(arr[i][j])
            print(ans)
Main()