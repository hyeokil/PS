from collections import deque
def bfs(n):
    visited =[-1]*(N+1)
    q = deque()
    q.append(n)
    visited[n] = 0
    while q:
        n = q.popleft()
        for w in range(1,N+1):
            if arr[n][w] == 1 and visited[w] == -1:
                q.append(w)
                visited[w] = visited[n]+1

    return visited
N,M = map(int, input().split())
arr = [[0]*(N+1) for _ in range(N+1)]
for tc in range(1,M+1):
    a,b =map(int, input().split())
    arr[a][b]= 1
    arr[b][a]= 1
mins = N**2
who = 0
for i in range(1,N+1):
    s =sum(bfs(i))
    if s < mins :
        mins = s
        who = i
print(who)


