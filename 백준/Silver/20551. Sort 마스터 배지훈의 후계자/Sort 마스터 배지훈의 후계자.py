import sys
input = sys.stdin.readline

N,M = map(int,input().split())
lstN = [int(input()) for _ in range(N)]
lstN.sort()
for _ in range(M):
    a = int(input())
    s=0
    e=N-1
    while s<e:
        mid = (s+e)//2
        if a>lstN[mid]:
            s=mid+1
        else:
            e=mid
    if lstN[s] != a:
        print(-1)
    else:
        print(s)