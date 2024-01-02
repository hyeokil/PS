def Main():
    N,M = map(int,input().split())
    arr1 = [list(map(int,input().split())) for _ in range(N)]
    M,K = map(int,input().split())
    arr2 = [list(map(int,input().split())) for _ in range(M)]
    arr = [[0]*K for _ in range(N)]
    for j in range(K):
        for i in range(N):
            for k in range(M):
                arr[i][j]+=arr1[i][k]*arr2[k][j]
    for i in arr:
        print(*i)
Main()