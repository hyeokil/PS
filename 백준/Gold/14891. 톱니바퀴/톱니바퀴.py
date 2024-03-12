from collections import deque

arr = []
ans = 0
for i in range(4):
    arr.append(deque(list(input())))
for i in range(int(input())):
    A,B = map(int,input().split())
    A-=1
    q = deque()
    q.append((A,B))
    visited = [False]*4
    while q:
        x,y = q.popleft()
        visited[x] = True
        if y >0 :
            tmp = arr[x].pop()
            arr[x].appendleft(tmp)
        else:
            tmp = arr[x].popleft()
            arr[x].append(tmp)
        if x-1 >= 0 and not visited[x-1]:
            if arr[x-1][2] != arr[x][6+y]:
                q.append(((x-1),-y))
        if x+1 < 4 and not visited[x+1]:
            if arr[x+1][6] != arr[x][2+y]:
                q.append(((x+1),-y))
for i in range(4):
    ans += int(arr[i][0])*2**i
print(ans)