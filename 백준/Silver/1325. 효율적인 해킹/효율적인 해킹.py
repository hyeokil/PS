import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,M = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for i in range(M):
        a,b = map(int,input().split())
        arr[b].append(a)
    res = 1
    ans = []
    for i in range(1,N+1):
        visited = [False] * (N + 1)
        q = deque([i])
        cnt = 1
        visited[i] = True
        while q:
            x = q.popleft()
            for y in arr[x]:
                if visited[y]:
                    continue
                visited[y] = True
                cnt +=1
                q.append(y)
    
        if res<cnt:
            res =cnt
            ans = [i]
        elif res == cnt:
            ans.append(i)
    ans.sort()
    print(*ans)
Main()