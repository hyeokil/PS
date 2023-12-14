def par(i,m):
    if m == M :
        chicken_partials.append([*chicken_partial])
        return
    if i == chicken_len:
        return
    chicken_partial[m] = i
    par(i+1,m+1)
    chicken_partial[m] = -1
    par(i+1, m)


N,M = map(int,input().split())
arr = [list(map(int,input().split())) for _ in range(N)]
home = []
chicken = []
chicken_partial = [-1]*M
chicken_partials = []
ans = float('inf')
for i in range(N):
    for j in range(N):
        if arr[i][j] == 1:
            home.append((i,j))
        elif arr[i][j] == 2:
            chicken.append((i,j))
chicken_len = len(chicken)
par(0,0)
for lst in chicken_partials:
    res = [float('inf')] * len(home)
    for i in lst:
        x1,y1 = chicken[i]
        for j in range(len(home)):
            x2,y2 = home[j]
            if abs(x1-x2)+abs(y1-y2) < res[j]:
                res[j] = abs(x1-x2)+abs(y1-y2)
    ans = min(ans,sum(res))
print(ans)
