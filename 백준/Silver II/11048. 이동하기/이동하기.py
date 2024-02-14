def Main():
    N,M = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(N)]
    ans = [[0]*M for _ in range(N)]
    for i in range(N):
        for j in range(M):
            a,b,c=0,0,0
            if 1<=i and 1<=j : c=ans[i-1][j-1]
            if 1<=i : a=ans[i-1][j]
            if 1<=j : b=ans[i][j-1]
            ans[i][j] = arr[i][j]+max(a,b,c)
    print(ans[N-1][M-1])
Main()