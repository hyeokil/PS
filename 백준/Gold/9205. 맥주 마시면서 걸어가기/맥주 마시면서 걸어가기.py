import sys
input = sys.stdin.readline
from collections import deque
def Main():
    for tc in range(int(input())):
        N =int(input())
        sx,sy = map(int,input().split())
        arr = [list(map(int,input().split())) for _ in range(N+1)]
        visited =[False]*(N+1)
        q =deque()
        q.append((sx,sy))
        ans = "sad"
        while q:
            x,y = q.popleft()
            if x == arr[N][0] and y == arr[N][1]:
                ans = "happy"
                break
            for i in range(N+1):
                if not visited[i] and (abs(x-arr[i][0])+abs(y-arr[i][1]))<=1000:
                    visited[i] = True
                    q.append((arr[i][0],arr[i][1]))
        print(ans)
Main()