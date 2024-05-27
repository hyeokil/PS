import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    S = input().rstrip()
    ans = 0
    visited = [False]*91
    for s in S:
        visited[ord(s)]=True
    for i in range(65,91):
        if visited[i]:
            continue
        ans+=i
    print(ans)