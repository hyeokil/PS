import sys
input = sys.stdin.readline

def f(color):
    prefix = [[0]*(M+1) for _ in range(N+1)]
    for i in range(N):
        for j in range(M):
            if (i+j)%2 == 0:
                V = arr[i][j] == color
            else:
                V = arr[i][j] != color
            prefix[i+1][j+1] = prefix[i][j+1]+prefix[i+1][j]-prefix[i][j]+V
    res = float('inf')
    for i in range(1,N-K+2):
        for j in range(1,M-K+2):
            res = min(res,prefix[i+K-1][j+K-1]-prefix[i+K-1][j-1]-prefix[i-1][j+K-1]+prefix[i-1][j-1])
    return res

N,M,K = map(int,input().split())
arr = [input() for _ in range(N)]
print(min(f('B'),f('W')))
