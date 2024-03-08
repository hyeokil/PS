import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,M = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    lst = [0]*(N+1)
    for i in range(M):
        A,B = map(int,input().split())
        arr[A].append(B)
        arr[B].append(A)
    q = deque([1])
    while q:
        x = q.popleft()
        for y in arr[x]:
            if lst[y] == 0 and y!=1:
                lst[y]=lst[x]+1
                q.append(y)
    mx = max(lst)
    cnt = 0
    ans = 0
    for i in range(1,N+1):
        if lst[i] == mx:
            cnt+=1
            if ans == 0:
                ans = i
    print(ans,mx,cnt)
Main()