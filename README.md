# PIS(Problems I Solved)

## 2023 08 17 thursday

### swea 1225 암호생성기

```python
for _ in range(10):
    tc = int(input())
    lst = list(map(int, input().split()))
    lmin = (min(lst)//15)
    for i in range(8):
        lst[i] = lst[i]-((lmin-1)*15)
    for i in range(80):
        lst[i%8] -= i%5+1
        if lst[i%8] <= 0:
            lst[i%8] = 0
            break
    for i in range(8):
        if lst[i] == 0:
            print(f'#{tc}',*(lst[i+1:]+lst[:i+1]))
            break
```

### swea solving club 5097 회전

```python
T = int(input())
for tc in range(1,T+1):
    N,M = map(int,input().split())
    lst = list(map(int, input().split()))
    i = M%N
    print(f'#{tc}',lst[i])
```

### 백준 2304 창고 다각형

```python

N = int(input())
llst = []
counts = [0]*1001
for _ in range(N):
    L, H = map(int,input().split())
    llst.append(L)
    counts[L] = H
start = min(llst)
top = max(counts)
end= max(llst)
s = 0
for i in range(1001):
    if counts[start] < counts[i]:
        s += (i-start)*counts[start]
        start= i
    if counts[i]== top:
        break
for i in range(1000,0,-1):
    if counts[end] < counts[i]:
        s += (end-i)*counts[end]
        end = i
    if counts[i]== top:
        break
tlst = []
for i in range(1001):
    if counts[i] == top:
        tlst.append(i)
s += (max(tlst)-min(tlst)+1) * top    
print(s)
```

### 백준 1463 1로 만들기

```python

N = int(input())
dp = [0]*(N+1)
dp[2:6] = [1, 1, 2, 3]

for i in range(6, N+1):
    dp[i] = dp[i-1]+1
    if i%2 == 0:
        dp[i] = min(dp[i//2]+1, dp[i])
    if i%3 == 0:
        dp[i] = min(dp[i//3]+1, dp[i])

print(dp[N])
```

### 백준 11659 구간 합 구하기 4

```python

import sys
input = sys.stdin.readline

N , M = map(int, input().split())
lst = list(map(int, input().split()))
s = 0
lst_s = [0]
for i in lst: 
    s += i
    lst_s.append(s)

for i in range(M):
    a, b = map(int, input().split())
    print(lst_s[b]-lst_s[a-1])    

```

### swea solving club 5099 피자 굽기

```python
T = int(input())
for tc in range(1,T+1):
    N,M = map(int,input().split())
    cheese = [0] + list(map(int, input().split()))
    oven =[0]*N
    newPizza = 1
    while len(oven) >= 2 :
        pizzaNo = oven.pop(0)
        cheese[pizzaNo] //= 2
        if cheese[pizzaNo] == 0:
            if newPizza <= M:
                oven.append(newPizza)
                newPizza+=1
        else:
            oven.append(pizzaNo)
    print(f'#{tc}',*oven)
```

### swea 파리퇴치3

```python
T = int(input())
for tc in range(1,T+1):
    N,M = map(int,input().split())
    arr =[list(map(int, input().split())) for _ in range(N)]
    maxs = 0
    dx = [0,1,0,-1]
    dy = [1,0,-1,0]
    for i in range(N):
        for j in range(N):
            s = 0
            s += arr[i][j]
            for l in range(1,M):
                for k in range(4):
                    if 0 <= i+dx[k]*l < N and 0 <= j+dy[k]*l < N :
                        s += arr[i+dx[k]*l][j+dy[k]*l]
            if s > maxs:
                maxs = s
    tx = [-1,-1,1,1]
    ty = [-1,1,-1,1]
    for i in range(N):
        for j in range(N):
            s = 0
            s += arr[i][j]
            for l in range(1,M):
                for k in range(4):
                    if 0 <= i+tx[k]*l < N and 0 <= j+ty[k]*l < N :
                        s += arr[i+tx[k]*l][j+ty[k]*l]
            if s > maxs:
                maxs = s
    print(f'#{tc}',maxs)
```

### swea 진기의 최고급 붕어빵

```python
T = int(input())
for tc in range(1,T+1):
    N,M,K = map(int,input().split())
    lst = list(map(int, input().split()))
    lst.sort()
    if min(lst) < M or ((max(lst)//M)*K) < N:
        print(f'#{tc} Impossible')
    else:
        cnt = 0
        for i in range(M,max(lst)+1,M):
            for _ in range(K):
                if lst:
                    n = lst.pop(0)
                    if n < i:
                        cnt +=1
                        break
            if cnt != 0:
                break
        if lst :
            print(f'#{tc} Impossible')
        else:
            print(f'#{tc} Possible')
```

### swea 1486 장훈이의 높은 선반

```python

def partial(k, cursum):             # 진짜 백트래킹
    global memo
    if k == n:
        if cursum >= B :
            memo.append(cursum)
        return
    result[k] = 0       # result의 k가 포함이안되었다.
    partial(k + 1, cursum)      # 그냥 그 값 그대로 내려감

    result[k] = 1       # 포함이 됨
    partial(k + 1, cursum + arr[k])     # 그때의 위치값을 더해서 내려감


T = int(input())
for tc in range(1,T+1):
    n,B = map(int, input().split())
    arr = list(map(int, input().split()))
    result = [-1]*n
    memo = []
    partial(0,0)
    print(f'#{tc}',min(memo)-B)
```

## 2023 08 18 friday

### 백준 1357 뒤집힌 덧셈

```python
def rev(x):
    x = reversed(list(str(x)))
    x = ''.join(x)
    return int(x)

a, b = map(int, input().split())
print(rev(rev(a)+rev(b)))
```

### 백준 5576 콘테스트

```python
W = []
K = []
for i in range(20):
    if i <10:
        W.append(int(input()))
    else:
        K.append(int(input()))
W.sort()
K.sort()
print(W[-1]+W[-2]+W[-3],K[-1]+K[-2]+K[-3])
```

### swea solving club 5105 미로의 거리

```python


def bfs(sti, stj, N):
    visited = [[0]*N for _ in range(N)] # visited 생성
    q = []                              # 큐 생성
    q.append((sti,stj))                 # 시작점 인큐
    visited[sti][stj] = 1               # 시작점 인큐 표시
    while q:                            # 큐가 비워질 때 까지
        i, j = q.pop(0)                 # 디큐
        if maze[i][j] == 3:             # 처리
            return visited[i][j]-2      # 지나온 칸 수 리턴
        # 인접하고 인큐된 적이 없으면...
        # 인큐, 인큐표시
        for di, dj in [[0,1],[1,0],[0,-1],[-1,0]]:
            ni, nj = i+di, j+dj
            if 0<=ni<N and 0<=nj<N and maze[ni][nj]!=1 and visited[ni][nj] ==0:
                q.append((ni, nj))
                visited[ni][nj] = visited[i][j] +1
    return 0        # 3인 칸에 도달할 수 없는 경우


def find_start(N):
    for i in range(N):
        for j in range(N):
            if maze[i][j] == 2:
                return i, j

T = int(input())
for tc in range(1,T +1):
    N = int(input())
    maze = [list(map(int, input())) for _ in range(N)]
    sti, stj = find_start(N)
    ans = bfs(sti, stj, N)
    print(f'#{tc} {ans}')

```


### swea 1226 미로 

```python


def bfs(sti, stj, N):
    visited = [[0]*N for _ in range(N)] # visited 생성
    q = []                              # 큐 생성
    q.append((sti,stj))                 # 시작점 인큐
    visited[sti][stj] = 1               # 시작점 인큐 표시
    while q:                            # 큐가 비워질 때 까지
        i, j = q.pop(0)                 # 디큐
        if maze[i][j] == 3:             # 처리
            return 1    
        # 인접하고 인큐된 적이 없으면...
        # 인큐, 인큐표시
        for di, dj in [[0,1],[1,0],[0,-1],[-1,0]]:
            ni, nj = i+di, j+dj
            if 0<=ni<N and 0<=nj<N and maze[ni][nj]!=1 and visited[ni][nj] ==0:
                q.append((ni, nj))
                visited[ni][nj] = 1
    return 0        # 3인 칸에 도달할 수 없는 경우


def find_start(N):
    for i in range(N):
        for j in range(N):
            if maze[i][j] == 2:
                return i, j

for _ in range(1,11):
    tc = int(input())
    N = 16
    maze = [list(map(int, input())) for _ in range(N)]
    sti, stj = find_start(N)
    ans = bfs(sti, stj, N)
    print(f'#{tc} {ans}')

```

### swea solving club 5102 노드의 거리

```python

def bfs(S, G, V):
    visited = [0]*(V+1)    # visited 생성
    q = []                                       # 큐 생성
    q.append(S)                          # 시작점 인큐
    visited[S] = 1                      # 시작점 인큐 표시
    while q:                            # 큐가 비워질 때 까지
        i = q.pop(0)                 # 디큐
        if i == G:                     # 처리
            return visited[i] -1    # 지나온 칸 수 리턴
        # 인접하고 인큐된 적이 없으면...
        # 인큐, 인큐표시
        for j in range(1,V+1):
            if arr[i][j] == 1 and visited[j] ==0:
                q.append(j)
                visited[j] = visited[i] + 1
    return 0        # G에 도달할 수 없는 경우

T =int(input())
for tc in range(1,T+1):
    V,E = map(int, input().split())
    arr = [[0]*(V+1) for _ in range(V+1)]
    for _ in range(E):
        a,b = map(int, input().split())
        arr[a][b] =1
        arr[b][a] =1
    S,G = map(int, input().split())
    ans = bfs(S, G, V)
    print(f'#{tc} {ans}')

```

### swea 1227 미로2

```python

def bfs(sti,stj,arr):
    visited = [[0]*100 for ___ in range(100)]
    q = []
    q.append((sti,stj))
    visited[sti][stj] = 1
    while q:
        i,j = q.pop(0)
        if arr[i][j] == 3:
            return 1
        for di, dj in [[0,1],[1,0],[0,-1],[-1,0]]:
            ni, nj = i+di, j+dj
            if 0<=ni<100 and 0<=nj<100 and arr[ni][nj]!=1 and visited[ni][nj]==0 :
                q.append((ni,nj))
                visited[ni][nj] = 1
    return  0

def sij(arr):
    for i in range(100):
        for j in range(100):
            if arr[i][j] == 2:
                return i,j

for _ in range(1,11):
    tc = int(input())
    arr = [list(map(int,input())) for __ in range(100)]
    sti, stj = sij(arr)
    ans = bfs(sti,stj,arr)
    print(f'#{tc}',ans)

```

### swea 1238 Contact

```python

def bfs(S, arr):
    visited= [0]*101
    q = []
    q.append(S)
    visited[S] = 1
    while q:
        i = q.pop(0)
        for j in range(101):
            if arr[i][j] == 1 and visited[j] == 0:
                q.append(j)
                visited[j] = visited[i] + 1
    return visited
for tc in range(1,11):
    N, S = map(int,input().split())
    lst = list(map(int, input().split()))
    arr = [[0]*101 for _ in range(101)]
    for i in range(N//2):
        arr[lst[2*i]][lst[2*i+1]] = 1
    result = bfs(S,arr)
    ans = 0
    for i in range(101):
        if result[i] == max(result):
            if i > ans :
                ans = i
    print(f'#{tc}',ans)


```

