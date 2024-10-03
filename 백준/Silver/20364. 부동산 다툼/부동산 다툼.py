import sys
input = sys.stdin.readline

N,Q = map(int,input().split())
visited = [False for i in range(N+1)]
for _ in range(Q):
    A = int(input())
    a = A
    res = 0
    while a>1:
        if visited[a]:
            res = a
        a//=2
    if res == 0:
        visited[A]= True
    print(res)