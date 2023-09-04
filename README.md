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

## 2023 08 21 monday

### 백준 2178 미로 탐색

```python

from collections import deque

def f(N,M, arr):
    visited = [[0]*M for _ in range(N)]
    q = deque([])
    q.append((0,0))
    visited[0][0] = 1
    while q:
        i,j = q.popleft()
        if i == N-1 and j == M-1:
            return visited[i][j]
        for di,dj in [[0,1],[1,0],[0,-1],[-1,0]]:
            ni = i+di
            nj = j+dj
            if 0<=ni<N and 0<=nj<M and arr[ni][nj] == 1 and visited[ni][nj] ==0:
                q.append((ni,nj))
                visited[ni][nj] = visited[i][j] + 1
    return -1



N,M = map(int, input().split())
arr = [list(map(int, input())) for _ in range(N)]
ans = f(N,M,arr)

print(ans)

```

### swea solving club 5176 이진탐색

```python

def in_order(root):
    global value
    if root <= N:
        in_order(root*2)
        arr[root]=value
        value += 1
        in_order(root*2+1)

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [0]*(N+1)
    value = 1
    in_order(1)
    print(f'#{tc}',arr[1],arr[N//2])

```

## 2023 08 22 tuesday

### 백준 11650 좌표 정렬하기

```python

import sys
input = sys.stdin.readline
N = int(input())
lst = []
for i in range(N):
    a = list(map(int, input().split()))
    lst.append(a)
lst.sort(key=lambda x:(x[0],x[1]))
for i in lst:
    print(*i)

```

### swea solving club 1231 중위순회

```python

def inorder(p,N): # 완전 이진 트리의 마지막 정점
    if p<=N:
        inorder(p*2,N)            # 왼쪽 자식으로 이동
        print(tree[p], end='')    # 중위 순회에서 할일, 전위는 윗줄로감
        inorder(p*2+1,N)          # 오른쪽 자식으로 이동

T = 10
for tc in range(1,T+1):
    N = int(input())
    tree = [0]*(N+1)    # N번 노드까지 있는 완전 이진 트리
    for _ in range(N):
        arr = list(input().split())
        tree[int(arr[0])] = arr[1]
    # 중위 순회
    print(f'#{tc} ',end='')
    inorder(1,N)
    print()

```

### swea solving club 5174 subtree

```python

def subtree(N):
    global node
    if N :
        node += 1
        subtree(left[N])
        subtree(right[N])


T = int(input())
for tc in range(1,T+1):
    E,N = map(int, input().split())
    lst = list(map(int, input().split()))
    left = [0]*(E+2)
    right = [0]*(E+2)
    for i in range(0,E):
        if left[lst[i*2]] == 0:
            left[lst[i*2]] = lst[i*2+1]
        else:
            right[lst[i*2]] = lst[i*2+1]
    node = 0
    subtree(N)
    print(f'#{tc}',node)

```

### swea solving club 5177 이진 힙

```python

'''
완전이진트리 유지
부모 노드의 값 < 자식노드의 값 유지
조건 불만족시 만족할때 까지 부모 노드와 값을 바꾼다
노드 번호는 루트가 1 외쪽에서 오른쪽으로 오른쪽이 없다면 다음 줄로 1씩 증가
'''
def enq(i):  # 최소 힙에 값 넣기
    global last
    last += 1               # 최소 힙에 들어간 값의 개수이며 위치가 되기도 한다
    min_heap[last] = i      # 맨 마지막에 값을 넣어준다.
    c = last                # 1
    p = c // 2
    while p > 0 and min_heap[p] > min_heap[c]:  # 조상이 더 크면 바꾼다.
        min_heap[p], min_heap[c] = min_heap[c], min_heap[p]
        c = p
        p = c // 2


T = int(input())
for tc in range(1, T+1):
    N = int(input())
    lst = list(map(int, input().split()))
    last = 0
    min_heap = [0] * (N+1)              # 최소 힙
    for i in lst:
        enq(i)
    # 조상 노드의 합 구하기
    ans = last // 2  # 조상 노드
    s = 0  # 조상 노드의 합
    while ans:
        s += min_heap[ans]
        ans //= 2
    print(f'#{tc}',s)

```

### swea solving club 1232 사칙연산

```python

def tkclr(n):
    if tree[n][0] not in ['+','-','*','/']:
        return tree[n][0]
    else:
        l = tkclr(tree[n][1])
        r = tkclr(tree[n][2])
        if tree[n][0] == '+':
            return l+r
        elif tree[n][0] == '-':
            return l-r
        elif tree[n][0] == '*':
            return l*r
        else:
            return l/r

T = 10
for tc in range(1,T+1):
    N =int(input())
    tree = [[0,0,0] for _ in range(N+1)]
    arr = [list(input().split()) for _ in range(N)]
    for i in range(N):
        if arr[i][1] not in ['+','-','*','/']: #  숫자 노드이면
            n,v = arr[i]
            n= int(n)
            v= int(v)
            tree[n][0] = v
        else :                  # 연산자 일때
            n, v, lc,rc = arr[i]
            tree[int(n)] = [v,int(lc),int(rc)]
    ans = tkclr(1)
    print(f'#{tc}',int(ans))

```

### swea solving club 5178 노드의 합

```python

def nodesum(L):
    if tree[L] != 0:
        return tree[L]
    else:
        if L*2+1 <= N :
            tree[L] = nodesum(L*2)+nodesum(L*2+1)
        else:
            tree[L] = nodesum(L*2)
        return tree[L]

T = int(input())
for tc in range(1,T+1):
    N,M,L = map(int,input().split())
    tree = [0]*(N+1)
    for i in range(M):
        p,v = map(int, input().split())
        tree[p] = v
    ans = nodesum(L)
    print(f'#{tc}',ans)

```

### 백준 2491 수열

```python

N = int(input())
lst = list(map(int, input().split()))
mxup = 1
mxdn = 1
up = 1
down = 1
for i in range(1,N):
    if lst[i-1] < lst[i]:
        up +=1
        down = 1
    elif lst[i-1] > lst[i]:
        up = 1
        down +=1
    else:
        up += 1
        down +=1
    if up > mxup:
        mxup = up
    if down > mxdn:
        mxdn = down
print(max(mxdn,mxup))

```

### 백준 2559 수열

```python

import sys
input = sys.stdin.readline
N,K = map(int, input().split())
lst = list(map(int, input().split()))
lst1 = []
lst1.append(lst[0])
maxs = -9999999
for i in range(1,N):
    lst1.append(lst[i]+lst1[i-1])
for i in range(K-1,N):
    if i == K-1 :
        s =lst1[i]
    else:
        s = lst1[i]-lst1[i-K]
    if s > maxs :
        maxs =s
print(maxs)

```

### 백준 1764 듣보잡

```python

N,M = map(int, input().split())
heard = []
for i in range(N):
    s = input()
    heard.append(s)
see = []
for i in range(M):
    s= input()
    see.append(s)
h = set(heard)
p = set(see)
ans = h.intersection(p)
ans = sorted(list(ans))
print(len(ans))
for i in ans:
    print(i)

```

### 백준 11047 동전 0

```python

N,K= map(int, input().split())
coin = []
for i in range(N):
    coin.append(int(input()))
cnt = 0
while K >0:
    for i in range(N-1,0,-1):
        if K >= coin[i] :
            cnt += K // coin[i]
            K = K%coin[i]
            break
    else:
        cnt += K
        break
print(cnt)

```

### 백준 17219 비밀번호 찾기

```python

N,M = map(int,input().split())
pw = {}
for _ in range(N):
    s= list(input().split())
    pw[s[0]] = s[1]
for _ in range(M):
    s = input()
    print(pw[s])

```

### 백준 2630 색종이 만들기

```python

N = int(input())
arr = [list(map(int, input().split()))for _ in range(N)]
white = 0
blue = 0
K = N
while K>0:
    for i in range(0,N,K):
        for j in range(0,N,K):
            cnt = 0
            for k in range(K):
                for l in range(K):
                    if arr[i+k][j+l] == 1 :
                        cnt += 1
                    elif arr[i+k][j+l] == -1 :
                        cnt = -130
            if cnt == 0:
                white +=1
                for k in range(K):
                    for l in range(K):
                        arr[i+k][j+l] = -1
            elif cnt == K**2:
                blue += 1
                for k in range(K):
                    for l in range(K):
                        arr[i+k][j+l] = -1
    K //= 2
print(white)
print(blue)
```

### 백준 11399 ATM

```python

N = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst1= [lst[0]]

for i in range(1,N):
    lst1.append(lst[i]+lst1[i-1])
print(sum(lst1))
```

### swea solving club 1240 단순 2진 암호코드

```python

T = int(input())
for tc in range(1,T+1):
    N, M = map(int, input().split())
    arr = [list(input()) for _ in range(N)]
    for i in range(N):
        for j in range(M-1,-1,-1):
            if arr[i][j] == '1':
                pw = arr[i][j-55:j+1]
                break
    horse = 0
    Wkrtn = 0
    for i in range(0,56,7):
        s = ''.join(pw[i:i+7])
        if s == '0001101':
            s = 0
        elif s == '0011001':
            s =1
        elif s== '0010011':
            s =2
        elif s== '0111101':
            s = 3
        elif s=='0100011':
            s= 4
        elif s == '0110001':
            s = 5
        elif s=='0101111':
            s=6
        elif s=='0111011':
            s=7
        elif s=='0110111':
            s=8
        else :
            s=9
        if (i//7+1)%2 == 1:
            horse+=s
        else:
            Wkrtn +=s
    if (horse*3+Wkrtn)%10 != 0:
        print(f'#{tc}',0)
    else:
        print(f'#{tc}',horse+Wkrtn)

```

### swea solving club 5185 이진수

```python

bin = {'0':'0000','1':'0001','2':'0010','3':'0011','4':'0100','5':'0101',
      '6':'0110','7':'0111','8':'1000','9':'1001','A':'1010',
       'B':'1011','C':'1100','D':'1101','E':'1110','F':'1111'}
T = int(input())
for tc in range(1,T+1):
    N = list(input().split())
    s = ''
    for i in range(int(N[0])):
        s += bin[N[1][i]]
    print(f'#{tc}',s)

```

### swea solving club 5186 이진수2

```python

T = int(input())
for tc in range(1,T+1):
    N = float(input())
    ans = ''
    while N > 0:
        N *= 2
        if N >= 1:
            N-=1
            ans+='1'
        else:
            ans+='0'
    if len(ans) >=13:
        print(f'#{tc} overflow')
    else:
        print(f'#{tc}',ans)

```

### swea solving club 4615 재미있는 오셀로 게임

```python

T = int(input())
for tc in range(1,T+1):
    N,M = map(int, input().split())
    BRD = [[0]*N for _ in range(N)]
    n =N//2
    BRD[n-1][n-1] = 2
    BRD[n][n] = 2
    BRD[n-1][n] = 1
    BRD[n][n-1] = 1

    for i in range(M):
        C,R,dol = map(int,input().split())
        C-=1
        R-=1
        BRD[R][C] = dol
        re_c = 2 if dol == 1 else 1

        for dr,dc in [(1,0),(-1,0),(0,1),(0,-1),(1,1),(1,-1),(-1,1),(-1,-1)]:
            ni = R +dr
            nj = C +dc

            while 0<=ni<N and 0<=nj<N and BRD[ni][nj] == re_c:
                ni += dr
                nj += dc

            if 0<=ni<N and 0<=nj<N and BRD[ni][nj] == dol :
                while ni != R or nj != C:
                    ni -= dr
                    nj -= dc
                    BRD[ni][nj] =dol
    gmr = 0
    qor = 0
    for i in range(N):
        for j in range(N):
            if BRD[i][j] == 1:
                gmr +=1
            elif BRD[i][j] == 2:
                qor +=1
    print(f'#{tc}',gmr,qor)


```

### 백준 21736 헌내기는 친구가 필요해

```python

def campus(sti, stj):
    stack = []
    visited = [[0]*M for _ in range(N)]
    visited[sti][stj] = 1
    cnt = 0
    while True :
        for di,dj in [(1,0),(0,1),(-1,0),(0,-1)]:
            ni,nj =sti+di,stj+dj
            if 0<=ni<N and 0<=nj<M and arr[ni][nj] != 'X' and visited[ni][nj] == 0:
                if arr[ni][nj] == 'P' :
                    cnt += 1
                stack.append((sti,stj))
                visited[ni][nj] = 1
                sti,stj = ni,nj
                break
        else:
            if stack:
                sti, stj = stack.pop()
            else:
                break
    return cnt

def start(arr):
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 'I':
                return i,j

N,M = map(int, input().split())
arr = [list(input())for _ in range(N)]
sti,stj = start(arr)
ans = campus(sti, stj)
if ans == 0:
    print('TT')
else:
    print(ans)

```

### 백준 11403 경로 찾기

```python

from collections import deque
def bfs():
    ans = [[0] * N for _ in range(N)]
    for w in range(N):
        visited = [0]*N
        q = deque([])
        q.append(w)
        while q:
            i = q.popleft()
            for j in range(N):
                if arr[i][j] == 1 and visited[j] == 0:
                    q.append(j)
                    visited[j] =1
                    ans[w][j] = 1
    return ans

N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
ans = bfs()
for i in ans:
    print(*i)

```


## 2023 08 25 friday

### swea solving club 1220 Magnetic

```python


T = 10
for tc in range(1,T+1):
    N= int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    cnt = 0
    for i in range(N-1,-1,-1):
        for j in range(N):
            if arr[i][j] == 1:
                if i == N-1 :
                    arr[i][j] = 0
                else:
                    for k in range(i+1,N):
                        if arr[k][j]  == 1:
                            break
                        elif arr[k][j] == 2:
                            cnt +=1
                            break
                    else:
                        arr[i][j] = 0
    print(f'#{tc}',cnt)
```

### swea solving club 5356 의석이의 세로로 말해요

```python

T = int(input())
for tc in range(1,T+1):
    arr = [input() for _ in range(5)]
    ans = ''
    lens = 0
    for i in arr:
        if len(i) > lens:
            lens = len(i)
    for j in range(lens):
        for i in range(5):
            try :
                ans += arr[i][j]
            except IndexError:
                pass
    print(f'#{tc}',ans)

```

### swea solving club 13976 IM 대비 기지국

```python

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(input()) for _ in range(N+1)]
    di = [1,0,-1,0]
    dj = [0,1,0,-1]
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 'A':
                for k in range(4):
                    ni,nj = i+di[k],j+dj[k]
                    if 0<=ni<N and 0<=nj<N and arr[ni][nj] == 'H' :
                        arr[ni][nj] ='X'
            if arr[i][j] == 'B':
                for k in range(4):
                    for l in range(1,3):
                        ni,nj = i+di[k]*l,j+dj[k]*l
                        if 0<=ni<N and 0<=nj<N and arr[ni][nj] == 'H' :
                            arr[ni][nj] ='X'
            if arr[i][j] == 'C':
                for k in range(4):
                    for l in range(1, 4):
                        ni, nj = i + di[k] * l, j + dj[k] * l
                        if 0 <= ni < N and 0 <= nj < N and arr[ni][nj] == 'H':
                            arr[ni][nj] = 'X'
    cnt = 0
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 'H':
                cnt += 1
    print(f'#{tc}',cnt)


```


### swea solving club 5658 보물상자 비밀번호

```python

T = int(input())
for tc in range(1,T+1):
    N,K = map(int, input().split())
    lst = list(input())
    n = N//4
    lst1 = []
    for i in range(n):
        a = lst.pop(0)
        lst.append(a)
        for i in range(0, N, N // 4):
            lst1.append(''.join(lst[i:i + N // 4]))
    lst1 = list(set(lst1))
    lst2 = []
    for i in lst1:
        lst2.append(int(i,16))
    lst2.sort(reverse=True)
    print(f'#{tc}',lst2[K-1])

```

### 백준 11727 2 x n 타일링 2

```python

N = int(input())
dp = [1,3]
for i in range(2,N):
    dp.append(dp[i-1]+dp[i-2]*2)
print(dp[N-1]%10007)

```

### 백준 11286 절대값 힙

```python

import sys
input = sys.stdin.readline
import heapq
N = int(input())
heap = []
for _ in range(N):
    x = int(input())
    if x != 0 :
        heapq.heappush(heap,(abs(x),x))
    else:
        if heap:
            print(heapq.heappop(heap)[1])
        else:
            print(0)

```

### 백준 11279 최대 힙

```python

import sys
input = sys.stdin.readline
import heapq
N = int(input())
heap = []
for _ in range(N):
    x = int(input())
    if x != 0 :
        heapq.heappush(heap,-x)
    else:
        if heap:
            print(-heapq.heappop(heap))
        else:
            print(0)

```

### 백준 1927 최소 힙

```python

import sys
input = sys.stdin.readline
import heapq
N = int(input())
heap = []
for _ in range(N):
    x = int(input())
    if x != 0 :
        heapq.heappush(heap,x)
    else:
        if heap:
            print(heapq.heappop(heap))
        else:
            print(0)

```

### 백준 9095 1,2,3 더하기 

```python

N = int(input())
for _ in range(N):
    dp = [0, 1, 2, 4]
    n = int(input())
    for i in range(4,n+1):
        dp.append(dp[i-1] + dp[i-2]+ dp[i-3])
    print(dp[n])

```

## 2023 08 28 monday

### 백준 5218 알파벳 거리

```pyhton

def tonum(a):
    b = ord(a)-64
    return b
for tc in range(1,int(input())+1):
    s1,s2 =input().split()
    lst = []
    for i in range(len(s1)):
        d = tonum(s2[i])-tonum(s1[i])
        if d<0 :
            d+=26
        lst.append(d)
    print(f'Distances:',*lst)

```

### 백준 1260 DFS와 BFS

```python

from collections import deque
def dfs(V):
    visited = [0] * (N+1)
    st = []
    st2 = []
    st2.append(V)
    visited[V] = 1
    while True:
        for w in range(1,N+1):
            if arr[V][w] == 1 and visited[w] == 0:
                st.append(V)
                st2.append(w)
                visited[w]=1
                V = w
                break
        else:
            if st:
                V = st.pop()
            else:
                break
    return st2

def bfs(V):
    visited = [0]*(N+1)
    q = deque([])
    q2 = []
    q.append(V)
    q2.append(V)
    visited[V] = 1
    while q:
        i =q.popleft()
        for j in range(1,N+1):
            if arr[i][j] == 1 and visited[j] ==0 :
                q.append(j)
                q2.append(j)
                visited[j] = 1
    return q2


N,M,V = map(int, input().split())
arr = [[0]*(N+1) for _ in range(N+1)]
lst = [0]*(N+1)
lst2 = [0]*(N+1)
for g in range(M):
    a,b = map(int, input().split())
    arr[a][b] =1
    arr[b][a] = 1
dfs = dfs(V)
bfs = bfs(V)
print(*dfs)
print(*bfs)

```

### 백준 10026 적록색약

```python

from collections import deque
import copy

N = int(input())
arr = [list(input()) for _ in range(N)]
arr1 = copy.deepcopy(arr)
cnt = 0
cnt1 = 0 
di = [1,0,-1,0]
dj = [0,1,0,-1]
for i in range(N):
    for j in range(N):
        if arr[i][j] == 'R' or arr[i][j] == 'B' or arr[i][j] == 'G' :
            cnt +=1
            q= deque()
            alpha = arr[i][j]
            q.append((i,j))
            while q:
                x,y = q.popleft()
                for k in range(4):
                    ni,nj = x+di[k],y+dj[k]
                    if 0<=ni<N and 0<=nj<N and arr[ni][nj] == alpha :
                        q.append((ni,nj))
                        arr[ni][nj] = 0
for i in range(N):
    for j in range(N):
        if arr1[i][j] =='G' :
            arr1[i][j] = 'R'        
for i in range(N):
    for j in range(N):
        if arr1[i][j] == 'R' or arr1[i][j] == 'B'  :
            cnt1 +=1
            q= deque()
            alpha = arr1[i][j]
            q.append((i,j))
            while q:
                x,y = q.popleft()
                for k in range(4):
                    ni,nj = x+di[k],y+dj[k]
                    if 0<=ni<N and 0<=nj<N and arr1[ni][nj] == alpha :
                        q.append((ni,nj))
                        arr1[ni][nj] = 0
print(cnt, cnt1)

```

### 백준 11655 ROT13

```python

def rot13(s):
    if ord(s) >= 97 :
        ss = chr(97+((ord(s)+13)-97)%26)
        return ss
    else:
        ss =chr(65+((ord(s)+13)-65)%26)
        return ss
s= list(input())
for i in range(len(s)):
    if s[i] in list('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'):
        s[i] = rot13(s[i])
s = ''.join(s)
print(s)

```

### 백준 10163 색종이

```python

N =  int(input())
arr = [[0]*1001 for _ in range(1001)]
for tc in range(1,N+1):
    x, y, x1,y1 =map(int,input().split())
    for i in range(x1):
        for j in range(y1):
            arr[x+i][y+j] = tc
for k in range(1,N+1):
    cnt = 0
    for i in range(1001):
        for j in range(1001):
            if arr[i][j] == k:
                cnt +=1
    print(cnt)

```

### swea 11315 오목 판정

```python

def omok():
    di = [1, 0, 1, 1]
    dj = [0, 1, 1, -1]
    cnt = 1
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 'o':
                for k in range(4):
                    for l in range(1, 5):
                        ni, nj = i + di[k] * l, j + dj[k] * l
                        if 0 <= ni < N and 0 <= nj < N and arr[ni][nj] == 'o':
                            cnt += 1
                        else:
                            cnt = 1
                            break
                        if cnt == 5:
                            return 1
    return


T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [input() for _ in range(N)]
    ans = omok()
    if ans == 1:
        print(f'#{tc}','YES')
    else:
        print(f'#{tc}','NO')

```

## 2023 08 29 tuesday

### 백준 1389 케빈 베이컨의 6단계 법칙

```python

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

```

### 백준 1541 잃어버린 괄호

```python

lst = list(input())
s = ''
lst1 = []

for i in range(len(lst)):
    if lst[i] not in '+-':
        if i == len(lst)-1:
            s+=lst[i]
            lst1.append(s)
        s+=lst[i]
    else:
        lst1.append(s)
        lst1.append(lst[i])
        s=''
for i in range(len(lst1)):
    if lst1[i] not in '+-':
        lst1[i] = int(lst1[i])
lst2 = []
while lst1 :
    for i in range(len(lst1)):
        if lst1[i] == '+':
            ss =lst2.pop()
            ss += lst1[i+1]
            lst2.append(ss)
            lst1.pop(0)
            lst1.pop(0)
            break
        else:
            lst2.append(lst1[i])
            lst1.pop(0)
            break
lst3 = []
while lst2 :
    for i in range(len(lst2)):
        if lst2[i] == '-':
            ss =lst3.pop()
            ss -= lst2[i+1]
            lst3.append(ss)
            lst2.pop(0)
            lst2.pop(0)
            break
        else:
            lst3.append(lst2[i])
            lst2.pop(0)
            break
print(*lst3)


```

## 2023 08 30 wednesday

### 백준 9461 파도반 수열

```python

T = int(input())
lst = [1,1,1,2,2]
for tc in range(1,T+1):
    N = int(input())
    for i in range(len(lst),N):
        lst.append(lst[i-2]+lst[i-3])
    print(lst[N-1])

```

### swea solving club 10966 물놀이를 가자

```python

from collections import deque
T = int(input())
for tc in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [input() for _ in range(N)]
    s = 0
    visited = [[0] * M for _ in range(N)]
    q = deque()
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 'W':
                q.append((i, j))
    while q:
        x, y = q.popleft()
        for a, b in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
            ni, nj = x + a, y + b
            if 0 <= ni < N and 0 <= nj < M and arr[ni][nj] == 'L' and visited[ni][nj] ==0:
                q.append((ni, nj))
                visited[ni][nj] = visited[x][y] + 1
    for k in visited:
       s += sum(k)
    print(f'#{tc}',s)


```

### swea solving club 5203 베이비진 게임

```python

T = int(input())
for tc in range(1,T+1):
    lst = list(map(int, input().split()))
    p1 = []
    p2 = []
    p1w = 0
    draw = 0
    for i in range(12):
        if i%2 == 0:
            p1.append(lst[i])
            if p1.count(lst[i]) ==3:
                p1w = 1
                break
            elif lst[i]-1 in p1 and lst[i]+1 in p1:
                p1w = 1
                break
            elif lst[i]-1 in p1 and lst[i]-2 in p1:
                p1w = 1
                break
            elif lst[i]+1 in p1 and lst[i]+2 in p1:
                p1w = 1
                break
        else:
            p2.append(lst[i])
            if p2.count(lst[i]) == 3:
                break
            elif lst[i] - 1 in p2 and lst[i] + 1 in p2:
                break
            elif lst[i] - 1 in p2 and lst[i] - 2 in p2:
                break
            elif lst[i] + 1 in p2 and lst[i] + 2 in p2:
                break
    else:
        draw = 1
    if p1w == 1:
        print(f'#{tc}',1)
    elif draw == 1 :
        print(f'#{tc}',0)
    else:
        print(f'#{tc}',2)

```

### swea solving club 5189 전자카트

```python

def f(i, sumV):
    global minV
    if sumV > minV:
        return
    elif i == N :
        if minV > sumV + arr[p[i-1]][0] :
            minV = sumV+ arr[p[i-1]][0]
            return
    else:       # p[i]에 들어갈 숫자를 결정
        for j in range(N):
            if used[j]==0:   # 아직 사용되기 전이면
                p[i]=j
                used[j]=1
                f(i+1, sumV+arr[p[i-1]][p[i]])
                used[j] = 0

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    used = [0] *N
    p = [0]+[-1] * (N-1)+[0]
    used[0] = 1
    minV = 101*101
    f(1,0)
    print(f'#{tc}',minV)


```

### swea solving club 5188 최소합


```python

def f(x,y,sumV):
    global minV
    if sumV > minV :
        return
    if x == N-1 and y == N-1 :
        if sumV < minV:
            minV = sumV
            return
    else:
        for i,j in [(1,0),(0,1)]:
            ni,nj = x+i,y+j
            if 0<=ni<N and 0<=nj<N :
                f(ni,nj,sumV+arr[ni][nj])


T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    minV = 26*11
    f(0,0,arr[0][0])
    print(f'#{tc}',minV)

```

### swea solving club 1247 최적 경로

```python

def f(k, sumV):
    global minV
    if sumV > minV :
        return
    if k == N+1 :
        if minV > sumV+(abs(lst1[p[k-1]][0]-lst1[p[k]][0])+abs(lst1[p[k-1]][1]-lst1[p[k]][1])) :
            minV =sumV+(abs(lst1[p[k-1]][0]-lst1[p[k]][0])+abs(lst1[p[k-1]][1]-lst1[p[k]][1]))
        return
    else:
        for j in range(1,N+1):
            if used[j]==0:   # 아직 사용되기 전이면
                p[k]=j
                used[j]=1
                f(k+1, sumV+abs(lst1[p[k-1]][0]-lst1[p[k]][0]) + abs(lst1[p[k-1]][1]-lst1[p[k]][1]))
                used[j] = 0
T = int(input())
for tc in range(1,T+1):
    N = int(input())
    lst = list(map(int,input().split()))
    lst1 = []
    sti,stj = lst[0],lst[1]
    fi,fj = lst[2],lst[3]
    for i in range(2,N+2):
        lst1.append([lst[i*2],lst[i*2+1]])
    used = [0] * (N+2)
    p = [0]+[-1]*N+[N+1]
    lst1 = [[sti,stj]]+lst1+[[fi,fj]]
    used[0] = 1
    used[N+1]= 1
    minV =200*12
    f(1,0)
    print(f'#{tc}',minV)


```

### 백준 11050 이항 계수 1

```python

N,K = map(int, input().split())
s = 1
ss = 1
for i in range(1,N+1):
    s *= i
for i in range(1,N-K+1):
    ss *= i
for i in range(1,K+1):
    ss *= i
print(s//ss)

```

## 2023 08 31 thursday

### 백준 4153 직각삼각형

```python

while True:
    a,b,c = map(int, input().split())
    if a== 0 and b == 0 and c == 0 :
        break
    if max(a**2,b**2,c**2) != a**2+b**2+c**2-max(a**2,b**2,c**2) :
        print('wrong')
    else:
        print('right')

```

### 백준 1259 팰린드롬수 

```python

while True :
    a = input()
    if a == '0':
        break
    for i in range(len(a)//2):
        if a[i] != a[-1-i]:
            print('no')
            break
    else:
        print('yes')

```

### 백준 11866 요세푸스 문제 0

```python

from collections import deque
N, K = map(int,input().split())
lst = deque([i for i in range(1,N+1)])
st = []
cnt = 1
while len(st) < N :
    a = lst.popleft()
    if cnt%K == 0:
        st.append(a)
    else:
        lst.append(a)
    cnt += 1
print('<',end='')
print(*st,sep=', ',end='')
print('>')

```

### swea solving club 1861 정사각형 방

```python

def f(i, j, c, d):
    global n
    for di, dj in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
        ni, nj = i + di, j + dj
        if 0 <= ni < N and 0 <= nj < N and visited[ni][nj] == False and arr[ni][nj] == arr[i][j] + 1:
            visited[i][j] = True
            f(ni, nj, c, d+1)
            visited[i][j] = False
    else:
        if n[1] < d:
            n = [c,d]
        elif n[1] == d and n[0] > c:
            n[0] = c

T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    visited = [[False] * N for _ in range(N)]
    n = [0, 0]
    for i in range(N):
        for j in range(N):
            f(i, j, arr[i][j], 1)
    print(f'#{tc}', *n)

```

### swea solving club 5202 화물 도크

```python


T = int(input())
for tc in range(1,T+1):
    N = int(input())
    lst = []
    for z in range(N):
        s,e= map(int, input().split())
        lst.append([e,s])
    lst.sort(reverse=True)
    y,x = lst.pop()
    cnt = 1
    while lst:
        j,i =lst.pop()
        if i>= y :
            cnt +=1
            x,y =i,j
    print(f'#{tc}',cnt)

```

### swea solving club 5201 컨테이너 운반

```python

T = int(input())
for tc in range(1,T+1):
    N,M = map(int,input().split())
    lstN = list(map(int, input().split()))
    lstM = list(map(int, input().split()))
    lstN.sort()
    lstM.sort()
    W = 0
    for i in range(N):
        a = lstN.pop()
        if lstM:
            b = lstM.pop()
            if b >= a:
                W +=a
            else:
                lstM.append(b)
    print(f'#{tc}',W)

```

### swea solving club 2817 부분 수열의 합

```python

def f(x,sumV):
    global cnt
    if sumV == K:
        cnt += 1
        return
    if x == N:
        return
    bit[x] =0
    f(x+1,sumV)
    bit[x] = 1
    f(x+1,sumV+lst[x])


T = int(input())
for tc in range(1,T+1):
    N,K = map(int, input().split())
    lst = list(map(int, input().split()))
    bit = [0]*N
    cnt = 0
    f(0,0)
    print(f'#{tc}',cnt)

```

### 백준 18870 좌표 압축

```python

N = int(input())
lst = list(map(int, input().split()))
lsts = sorted(list(set(lst)))
dict = {}
for i in range(len(lsts)):
    dict[lsts[i]] = i
for j in range(len(lst)):
    lst[j] = dict[lst[j]]
print(*lst)

```

### 백준 7576 토마토

```python

from collections import deque
M,N =map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
cnt =0
q = deque()
for i in range(N):
    for j in range(M):
        if arr[i][j] == 0:
            cnt =1
        if arr[i][j] == 1:
            q.append((i,j))

di = [1,0,-1,0]
dj = [0,1,0,-1]
while q:
    x,y = q.popleft()
    for k in range(4):
        ni,nj = x+di[k],y+dj[k]
        if 0<=ni<N and 0<=nj<M and arr[ni][nj] == 0:
            q.append((ni,nj))
            arr[ni][nj] = arr[x][y]+1

q =0
if cnt == 0:
    print(0)
else:
    for i in range(N):
        if q== -1 :
            break
        for j in range(M):
            if arr[i][j] == 0:
                q = -1
                print(-1)
                break
    else:
        maxs = 0
        for i in arr :
            s =max(i)-1
            if s> maxs:
                maxs = s

        print(maxs)

```

## 2023 09 01 friday

### swea solving club 4366 정식이의 은행업무


```python

T = int(input())
for tc in range(1,T+1):
    bi = input()        # 2진수
    thr = list(map(int , input()))       # 3진수

    N = len(bi)
    M = len(thr)
    ans = 0

    binary = int(bi,2)  # 정수로 변환
    bin_list = [0]* N   # 각 비트를 반전시킨 수 N개 저장
    for i in range(N):  # 각 비트를 반전시킨 2진수 만들기
        bin_list[i] = binary^(1<<i)
    for i in range(M):
        num1 = 0    # (thr[j]+1)%3
        num2 = 0
        for j in range(M):
            if i!=j:
                num1 = num1*3+thr[j]
                num2 = num2*3+thr[j]
            else:
                num1 = num1*3+(thr[j]+1)%3
                num2 = num2*3+(thr[j]+2)%3
        if num1 in bin_list:
            ans = num1
            break   # for i
        if num2 in bin_list:
            ans = num2
            break   # for i
    print(f'#{tc}',ans)

```

### 백준 10866 덱

```python

from collections import deque
import sys
input = sys.stdin.readline
N = int(input())
deq = deque()
for i in range(N):
    lst = list(input().split())
    if lst[0] == 'push_back':
        deq.append(lst[1])
    elif lst[0] =='push_front':
        deq.insert(0,lst[1])
    elif lst[0] == 'pop_front':
        if deq:
            print(deq.popleft())
        else:
            print(-1)
    elif lst[0] == 'pop_back':
        if deq:
            print(deq.pop())
        else:
            print(-1)
    elif lst[0] == 'size':
        print(len(deq))
    elif lst[0] == 'empty':
        if deq :
            print(0)
        else:
            print(1)
    elif lst[0] == 'front':
        if deq:
            print(deq[0])
        else:
            print(-1)
    else:
        if deq:
            print(deq[-1])
        else:
            print(-1)


```

### swea solving club 1953 탈주범 검거

```python

def bfs(i,j):
    visited = [[0]*M for _ in range(N)]
    q = []
    q.append((i,j))
    visited[i][j] = 1
    while q:
        x,y = q.pop(0)
        for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
            nx,ny =x+dx,y+dy
            if 0<=nx<N and 0<=ny<M and visited[nx][ny] == 0:
                if arr[x][y] == 1 and (dx,dy) == (1,0):
                    if arr[nx][ny] in [2,4,7,1] :
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 1 and (dx,dy) == (0,1):
                    if arr[nx][ny] in [3,6,7,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 1 and (dx,dy) == (-1,0):
                    if arr[nx][ny] in [2,5,6,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 1 and (dx,dy) == (0,-1):
                    if arr[nx][ny] in [3,4,5,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 2 and (dx,dy) == (1,0):
                    if arr[nx][ny] in [2,4,7,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 2 and (dx,dy) == (-1,0):
                    if arr[nx][ny] in [2,5,6,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 3 and (dx,dy) == (0,1):
                    if arr[nx][ny] in [3,6,7,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 3 and (dx,dy) == (0,-1):
                    if arr[nx][ny] in [3,4,5,1]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 4 and (dx,dy) == (-1,0):
                    if arr[nx][ny] in [1,5,6,2]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 4 and (dx,dy) == (0,1):
                    if arr[nx][ny] in [1,3,6,7]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 5 and (dx,dy) == (0,1):
                    if arr[nx][ny] in [1,3,6,7]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 5 and (dx,dy) == (1,0):
                    if arr[nx][ny] in [1,2,4,7]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 6 and (dx,dy) == (1,0):
                    if arr[nx][ny] in [1,2,4,7]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 6 and (dx,dy) == (0,-1):
                    if arr[nx][ny] in [1,3,4,5]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 7 and (dx,dy) == (-1,0):
                    if arr[nx][ny] in [1,5,6,2]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
                elif arr[x][y] == 7 and (dx,dy) == (0,-1):
                    if arr[nx][ny] in [1,3,4,5]:
                        q.append((nx,ny))
                        visited[nx][ny] = visited[x][y] +1
    return visited

T = int(input())
for tc in range(1,T+1):
    N,M,R,C,L =map(int,input().split()) # N = 행 , M = 열, R = 시작 행, C = 시작 열, L= 시간
    arr = [list(map(int, input().split())) for _ in range(N)]
    cnt = 0
    a = bfs(R,C)
    for i in a:
        for j in i:
            if 0< j <= L:
                cnt +=1

    print(f'#{tc}',cnt)

```

### 백준 16120 PPAP

```python

from collections import deque

s= deque(list(input()))
q = []
while s :
    a = s.popleft()
    q.append(a)
    if len(q)>=4:
        if q[-4:] == ['P','P','A','P']:
            q.pop()
            q.pop()
            q.pop()
q =''.join(q)
if q == 'P':
    print('PPAP')
else:
    print('NP')


```

### 백준 28279 덱 2

```python

from collections import deque
import sys
input = sys.stdin.readline
N = int(input())
deq = deque()
for i in range(N):
    lst = list(map( int, input().split()))
    if lst[0] == 2:
        deq.append(lst[1])
    elif lst[0] == 1:
        deq.insert(0,lst[1])
    elif lst[0] == 3:
        if deq:
            print(deq.popleft())
        else:
            print(-1)
    elif lst[0] == 4:
        if deq:
            print(deq.pop())
        else:
            print(-1)
    elif lst[0] == 5:
        print(len(deq))
    elif lst[0] == 6:
        if deq :
            print(0)
        else:
            print(1)
    elif lst[0] == 7:
        if deq:
            print(deq[0])
        else:
            print(-1)
    else:
        if deq:
            print(deq[-1])
        else:
            print(-1)

```

## 2023 09 03 sunday

### 백준 2018 수들의 합 5

```python

N=int(input())
cnt = 0
start = 1
end = 1  
s = 0
while start < N+1:
        if s == N :
            cnt += 1
            s -= start
            start +=1
        elif s < N:
            s += end
            end +=1
        elif s > N:
            s -= start
            start+=1
print(cnt)

```

## 2023 09 04 monday

### 백준 1940 주몽

```python

import sys
input = sys.stdin.readline
N = int(input())
M = int(input())
lst = sorted(list(map(int, input().split())))
end = N-1
start = 0
cnt =0
while start < end:
    s = lst[start] + lst[end]
    if s == M :
        cnt += 1
        start += 1
        end -= 1
    elif s > M :
        end -= 1
    elif s < M :
        start += 1
print(cnt)

```

### 