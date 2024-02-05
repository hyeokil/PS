import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N=int(input())
    lst = list(map(int,input().split()))
    visited = [0]*N
    S = int(input())-1
    ans = 0
    q = deque()
    q.append(S)
    while q:
        x= q.popleft()
        visited[x] = 1
        if x-lst[x] >= 0 and visited[x-lst[x]] ==0:
            q.append(x-lst[x])
        if x+lst[x] < N and visited[x+lst[x]]==0:
            q.append(x+lst[x])
    print(sum(visited))
Main()