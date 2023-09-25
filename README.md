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

### 백준 1026 보물

```python

N = int(input())
lstA = list(map(int, input().split()))
lstB=list(map(int, input().split()))
lstA.sort()
lstB.sort(reverse=True)
s = 0
for i in range(N):
    s += lstA[i]*lstB[i]
    
print(s)

```

## 2023 09 05 tuesday

### 백준 13023 ABCDE

```python

# 1

import sys
input = sys.stdin.readline
def dfs(x, d):
    if d == 5:
        return 1
    for i in arr[x]:
        if visited[i] == False:
            visited[i] = True
            t = dfs(i, d+1)
            if t == 1 :
                return 1
            visited[i] = False
            
    return

N,M = map(int, input().split())
arr = [[]*N for _ in range(N)]
for i in range(M):
    a,b= map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)
visited = [False]*N
for j in range(N):
    visited[j] = True
    if dfs(j, 1) == 1:
        print(1)
        break
    visited[j] = False
else:
    print(0)


# 2

import sys
input = sys.stdin.readline
def dfs(x, cnt, path):
    # visited = [0] * N
    st = []
    st.append((x,cnt,path))
    # visited[x] = 1
    while st:
        x, cnt, path =  st.pop()
        # if visited[x] == 5:
        #     return 1
        for y in arr[x]:
            if  y not in path:
                if cnt + 1 == 5:
                    return 1
                st.append((y, cnt + 1, path+[y]))

                # visited[y] = visited[x] +1
                # x = y
                # break
        # else:
        #     if st :
        #         x = st.pop()
        #     else:
        #         break
    return 0

N,M = map(int, input().split())
arr = [[]*N for _ in range(N)]
for i in range(M):
    a,b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)

for x in range(N):
    V = dfs(x, 1, [x])
    if V == 1:
        print(1)
        break
else :
    print(0)

```

### 백준 2606 바이러스

```python

from collections import deque
def bfs(x):
    global visited
    visited[x] = 1
    q =deque()
    q.append(x)
    while q:
        i = q.popleft()
        for j in arr[i]:
            if visited[j] == 0 :
                visited[j] = 1
                q.append(j)
    return

N = int(input())
M = int(input())
arr = [[]*(N+1) for _ in range(N+1)]
for i in range(M):
    a,b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)
visited = [0]*(N+1)
bfs(1)
print(sum(visited)-1)

```

## 2023 09 06 wednesday

### 백준 11724 연결 요소의 개수

```python

import sys
from collections import deque
input = sys.stdin.readline
def bfs(x):
    q = deque()
    visited[x] = True
    q.append(x)
    while q :
        i = q.popleft()
        for j in arr[i]:
            if visited[j] == False :
                q.append(j)
                visited[j] = True
    return



N,M = map(int, input().split())
arr =[[]*(N+1) for _ in range(N+1)]
for tc in range(M):
    u,v =map(int,input().split())
    arr[u].append(v)
    arr[v].append(u)
visited = [False]*(N+1)
cnt = 0
for i in range(1,N+1):
    if visited[i] == False :
        bfs(i)
        cnt += 1

print(cnt)
```

### 백준 1920 수 찾기

```python

N = int(input())
lstN = sorted(list(map(int, input().split())))
M = int(input())
lstM = list(map(int,input().split()))
for i in lstM:
    left = 0
    right = N-1
    while left <= right :
        a = (left+right)//2
        if i > lstN[a]:
            left = a+1
        elif i < lstN[a]:
            right = a-1
        else:
            print(1)
            break
    else:
        print(0)

```

## 2023 09 07 thursday

### 백준 18110 solved.ac

```python

import sys
input = sys.stdin.readline

N = int(input())
lst = []
if N == 0 :
    print(0)
else:
    for q in range(N):
        n = int(input())
        lst.append(n)
    lst.sort()
    a = int(N*0.15+0.5)
    print(int((sum(lst[a:N-a])/(N-2*a))+0.5))

```

### 백준 10816 숫자 카드 2

```python

import sys
input =  sys.stdin.readline

N = int(input())
lstN = list(map(int, input().split()))
sN = set(lstN)
M = int(input())
lstM = list(map(int, input().split()))
lstcnt ={}
for i in sN:
    lstcnt[i] = 0
for i in range(N):
    lstcnt[lstN[i]] += 1
for i in lstM:
    try:
        print(lstcnt[i],end=' ')
    except KeyError:
        print(0, end= ' ')


```

## 2023 09 08 friday

### 백준 15829 Hashing

```python

import sys
input = sys.stdin.readline

L = int(input())
s = input()
dict = {}
en = 'abcdefghijklmnopqrstuvwxyz'
for i in range(26):
    dict[en[i]] = i+1


ans = 0
for i in range(L):
    ans += dict[s[i]]*31**i 

print(ans%1234567891)


```

### 백준 7568 덩치

```python

N = int(input())
arr = []
for tc in range(N):
    lst = list(map(int, input().split()))
    arr.append(lst)
ans = []
for i in range(N):
    cnt = 0

    for j in range(N):
        if i != j and arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            cnt += 1
    ans.append(cnt+1)
print(*ans)

```

## 2023 09 11 monday

### 백준 11723 집합

```python
import sys
input = sys.stdin.readline
M = int(input())
S = set()
for m in range(M):
    lst = input().split()
    if lst[0] == 'add':
        S.add(int(lst[1]))
    elif lst[0] == 'remove' :
        S.discard(int(lst[1]))
    elif lst[0] == 'check':
        if int(lst[1]) in S :
            print(1)
        else:
            print(0)
    elif lst[0] == 'toggle' :
        if int(lst[1]) in S :
            S.discard(int(lst[1]))
        else:
            S.add(int(lst[1]))
    elif lst[0] == 'all' :
        S = set([i for i in range(1,21)])
    else:
        S = set()


```

### 백준 11726 2xn 타일링

```python

lst = [1,2,3]
n = int(input()) -1
for i in range(len(lst),n+1):
    lst.append(lst[i-2]+lst[i-1])
print(lst[n]%10007)

```

## 2023 09 12 tuesday

### 백준 1926 그림

```python

N,M = map(int, input().split())
arr = [list(map(int, input().split())) for i in range(N)]
cnt = 0
ans = 0
for i in range(N):
    for j in range(M):
        if arr[i][j] == 1:
            arr[i][j] = -1
            cnt +=1
            x = i
            y = j
            cnt1 = 1
            st = []
            while True :
                for di,dj in [(1,0),(0,1),(-1,0),(0,-1)]:
                    ni,nj=x+di,y+dj
                    if 0<=ni<N and 0<=nj<M and arr[ni][nj] == 1:
                        arr[ni][nj] = -1
                        st.append((x,y))
                        x = ni
                        y = nj
                        cnt1 += 1
                        break

                else:
                    if st:
                        x,y = st.pop()
                    else:
                        break
            if cnt1 > ans :
                ans = cnt1
print(cnt)
print(ans)

```

### 백준 1012 유기농 배추

```python

from collections import deque
T = int(input())
for tc in range(1,T+1):
    M,N,K = map(int, input().split())
    arr= [[0]*M for _ in range(N)]
    for k in range(K):
        a,b = map(int, input().split())
        arr[b][a] = 1
    cnt = 0
    q = deque()
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 1:
                arr[i][j] = -1
                cnt +=1
                q.append((i,j))
                while q :
                    x,y =q.popleft()
                    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                        nx,ny=x+dx,y+dy
                        if 0<=nx<N and 0<=ny<M and arr[nx][ny] == 1 :
                            q.append((nx,ny))
                            arr[nx][ny] = -1
    print(cnt)


```

### 백준 15649 N 과 M (1)

```python

def f(x):
    if x==M:
        print(*p)
        return
    else:
        for i in range(N):
            if used[i] == 0 :
                p[x] = A[i]
                used[i] = 1
                f(x+1)
                used[i] = 0
N,M = map(int, input().split())
A=[i for i in range(1,N+1)]
used = [0]*N
p = [0] * M
f(0)

```

### 백준 15650 N 과 M (2)

```python

N,M= map(int, input().split())
lst = [i for i in range(1,N+1)]
bit = [0]*(N+1)
def partial(x,k):
    if k == M :
        result = []
        for i in range(1,N+1):
            if bit[i] == 1:
                result.append(i)
        print(*result)
        return
    if x == N+1:
        return
    bit[x] = 1
    partial(x+1,k+1)
    bit[x]= 0
    partial(x+1,k)
partial(1,0)

```

## 2023 09 13 wednesday

### 백준 7569 토마토

```python

from collections import deque
import sys
input = sys.stdin.readline
M,N,H = map(int,input().split())
arr = [list(map(int, input().split())) for _ in range(N*H)]
q = deque()
for i in range(N*H):
    for j in range(M):
        if arr[i][j] == 1 :
            q.append((i,j))
while q:
    x,y = q.popleft()
    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1),(-N,0),(N,0)]:
        nx,ny = x+dx,y+dy
        if dx == -N or dx == N :
            if 0<= nx < (N *H) and 0 <= ny < M and arr[nx][ny] == 0:
                q.append((nx, ny))
                arr[nx][ny] = arr[x][y] + 1
        else:
            if N*(x//N)<=nx<(N*(x//N+1)) and 0<=ny<M and arr[nx][ny] ==0 :
                q.append((nx,ny))
                arr[nx][ny] = arr[x][y] + 1

x = 0
ans = 0
for i in range(N*H):
    if x == 1:
        break
    for j in range(M):
        if arr[i][j] > ans :
            ans = arr[i][j]
        if arr[i][j] == 0:
            x = 1
            break
if x == 0 :
    print(ans-1)
else:
    print(-1)


```

### 백준 11003 최솟값 찾기

```python

import sys
input = sys.stdin.readline
from collections import deque
N,L = map(int, input().split())
lst= list(map(int, input().split()))
q = deque()
for i in range(N):
    while q and q[-1][0] >= lst[i]:
        q.pop()
    q.append((lst[i],i))
    if i - q[0][1] >= L:
        q.popleft()
    print(q[0][0], end=' ')


```

### 백준 2583 영역 구하기

```python

from collections import deque
M,N,K = map(int, input().split())
arr = [[0]*N for _ in range(M)]
for tc in range(K):
    x1,y1,x2,y2 = map(int, input().split())
    for i in range(y1,y2):
        for j in range(x1,x2):
            arr[i][j] =-1
cnt = 0
ans = []
for i in range(M):
    for j in range(N):
        if arr[i][j] == 0:
            q = deque()
            q.append((i,j))
            cnt += 1
            arr[i][j] = 1
            sumV = 1
            while q :
                x,y = q.popleft()
                for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                    nx,ny = x + dx, y + dy
                    if 0<=nx<M and 0<=ny<N and arr[nx][ny] == 0 :
                        q.append((nx,ny))
                        arr[nx][ny] = 1
                        sumV += 1
            ans.append(sumV)
ans.sort()
print(cnt)
print(*ans)

```

## 2023 09 14 thursday

### 백준 2667 단지번호붙이기

```python

from collections import deque
N = int(input())
arr = [list(input()) for _ in range(N)]
q = deque()
cnt = 0
ans = []
for i in range(N):
    for j in range(N):
        if arr[i][j] == '1' :
            arr[i][j] = '0'
            cnt += 1
            sumV = 1
            q.append((i,j))
            while q :
                x,y = q.popleft()
                for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                    nx,ny =x+dx,y+dy
                    if 0<=nx<N and 0<=ny<N and arr[nx][ny] == '1':
                        q.append((nx,ny))
                        arr[nx][ny] = '0'
                        sumV+=1
            ans.append(sumV)
ans.sort()
print(cnt)
for i in ans:
    print(i)


```

### 백준 1697 숨바꼭질

```python

import sys
from collections import deque
input = sys.stdin.readline
N,K = map(int, input().split())
q = deque()
q.append((N,0))
visited = [False]*100001
while q:
    x,y = q.popleft()
    if x == K :
        print(y)
        break
    for i in (x-1, x+1, 2*x):
        if 0<=i<=100000 and visited[i] == False:
            q.append((i,y+1))
            visited[i] = True


```

### 백준 12851 숨바꼭질 2

```python

import sys
input = sys.stdin.readline
from collections import deque
N,K = map(int, input().split())
q = deque()
q.append(N)
visited = [0] * 100001
ans = -1
cnt = 0
visited[N] = 1
while q:
    x = q.popleft()
    if ans != -1 and visited[x] > ans :
        break
    if x == K :
        ans = visited[x]
        cnt +=1
    else:
        for i in (2*x,x-1, x+1):
            if 0<=i<=100000 and (visited[i] == 0 or visited[i] == visited[x] + 1) :
                q.append(i)
                visited[i] = visited[x]+1
print(ans-1)
print(cnt)

```

### 백준 1966 프린터 큐

```python

from collections import deque
T = int(input())
for tc in range(1,T+1):
    N,M = map(int, input().split())
    q = deque(list(map(int, input().split())))
    idx = deque([i for i in range(N)])
    cnt = 0
    while True:
        x = q.popleft()
        y = idx.popleft()
        if q and x < max(q) :
            q.append(x)
            idx.append(y)
        else :
            cnt +=1
            if y == M :
                print(cnt)
                break

```

## 2023 09 15 friday

### 백준 2346 풍선 터뜨리기

```python

from collections import deque
N = int(input())
q = deque(list(map(int,input().split())))
idx = deque(list(range(1,N+1)))
ans = []
cnt = 1
while True:
    if cnt > 0 :
        if q :
            for i in range(cnt):
                x = q.popleft()
                y = idx.popleft()
                q.append(x)
                idx.append(y)
            else:
                x = q.pop()
                y = idx.pop()
                ans.append(y)
                cnt = x
        else:
            break
    else:
        if q :
            for i in range(abs(cnt)):
                x = q.pop()
                y = idx.pop()
                q.appendleft(x)
                idx.appendleft(y)
            else:
                x = q.popleft()
                y = idx.popleft()
                ans.append(y)
                cnt = x
        else:
            break
print(*ans)

```

### 백준 14425 문자열 집합

```python

import sys
input = sys.stdin.readline
N,M = map(int, input().split())
Nset = set()
cnt = 0
for i in range(N):
    s = input()
    Nset.add(s)
for i in range(M):
    s = input()
    if s in Nset:
        cnt += 1
print(cnt)

```

### 백준 7785 회사에 있는 사람

```python

import sys
input = sys.stdin.readline
N = int(input())
Nset = set()
for i in range(N):
    a,b = input().split()
    if b == 'enter':
        Nset.add(a)
    else:
        if a in Nset:
            Nset.discard(a)
lst = list(Nset)
lst.sort(reverse=True)
for i in lst:
    print(i)

```

### 백준 1269 대칭 차집합

```python

A,B = map(int, input().split())
A = set(map(int,input().split()))
B = set(map(int,input().split()))
print(len(A-B)+len(B-A))

```

### 백준 14502 연구소

```python

from collections import deque
import copy
def bfs(arr):
    q1 = copy.deepcopy(q)
    arr1 = copy.deepcopy(arr)
    cnt =0
    while q1:
        x,y = q1.popleft()
        for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
            nx,ny =x+dx,y+dy
            if 0<=nx<N and 0<=ny<M and arr1[nx][ny] == 0 :
                arr1[nx][ny] = 2
                q1.append((nx,ny))
    for g in range(N):
        for h in range(M):
            if arr1[g][h] == 0 :
                cnt += 1
    return cnt
N,M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]

q = deque()
lst0 = []
ans = 0
for i in range(N):
    for j in range(M):
        if arr[i][j] == 2:
            q.append((i,j))
        if arr[i][j] == 0:
            lst0.append((i,j))
for i in range(len(lst0)):
    arr[lst0[i][0]][lst0[i][1]] = 1
    for j in range(i+1,len(lst0)):
        arr[lst0[j][0]][lst0[j][1]] = 1
        for k in range(j+1,len(lst0)):
            arr[lst0[k][0]][lst0[k][1]] = 1
            result = bfs(arr)
            
            if result > ans :
                ans = result

            arr[lst0[k][0]][lst0[k][1]] = 0
        arr[lst0[j][0]][lst0[j][1]] = 0
    arr[lst0[i][0]][lst0[i][1]] = 0



print(ans)

```

## 2023 09 16 sunday

### 백준 2343 기타 레슨

```python

N,M = map(int,input().split())
lst = list(map(int, input().split()))
s = max(lst)
e= sum(lst)
while s<=e:
  mid = (s+e)//2
  blue = [0]*M
  cnt = 0
  for i in lst:
    if blue[cnt] + i <= mid :
      blue[cnt] += i
    else:
      cnt += 1
      if cnt >= M :
        s = mid + 1
        break
      else:
        blue[cnt] += i
  else:
    e = mid - 1
    
print(s)

```

## 2023 09 18 monday

### swea solving club 5204 퀵 정렬

```python

def h_par(s,e):
    p = s
    i = s
    j = e
    while i<=j :
        while i<=j and lst[i] <= lst[p]:
            i += 1
        while i<=j and lst[j] >= lst[p]:
            j -= 1
        if i<j :
            lst[i], lst[j] = lst[j], lst[i]

    lst[p], lst[j] = lst[j], lst[p]
    return j

def quick_sort(s,e):
    if s>=e:
        return -1
    pivot = h_par(s,e)
    quick_sort(s,pivot-1)
    quick_sort(pivot+1,e)

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    lst = list(map(int, input().split()))
    quick_sort(0,N-1)
    print(f'#{tc}',lst[N//2])

```

### swea solving club 5204 병합 정렬

```python

def merge(l_lst, r_lst):
    global cnt
    result = []
    l_pos = r_pos = 0
    while l_pos < len(l_lst) and r_pos < len(r_lst):
        if l_lst[l_pos] <= r_lst[r_pos] :
            result.append(l_lst[l_pos])
            l_pos += 1
        else:
            result.append(r_lst[r_pos])
            r_pos += 1
    result += l_lst[l_pos:]
    result += r_lst[r_pos:]
    if l_pos < r_pos :
        cnt+= 1
    return result

def merge_sort(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr)//2
    l_lst = merge_sort(arr[:mid])
    r_lst = merge_sort(arr[mid:])
    result = merge(l_lst,r_lst)
    return result

T = int(input())
for tc in range(1,T+1):
    cnt = 0
    N = int(input())
    lst = list(map(int, input().split()))
    arr = merge_sort(lst)
    print(f'#{tc}',arr[N//2],cnt)

```

### swea solving club 5207 이진 탐색

```python

def b(t):
    low = 0
    high = n - 1
    lw = 0
    rw = 0
    while low <= high :
        mid = (low+high) // 2
        if lstN[mid] == t :
            return 1
        elif lstN[mid] < t :
            rw += 1
            lw = 0
            if rw >= 2 :
                break
            low = mid +1
        else:
            lw += 1
            rw = 0
            if lw >= 2:
                break
            high = mid - 1
    return 0

T = int(input())
for tc in range(1,T+1):
    N,M = map(int, input().split())
    lstN = list(map(int, input().split()))
    lstM = list(map(int, input().split()))
    lstN.sort()
    n = len(lstN)
    cnt = 0
    for i in lstM:
        cnt += b(i)
    print(f'#{tc}',cnt)

```

### swea solving club 1486 장훈이의 높은 선반

```python

def p(k,curS):
    global ans
    if curS >= B :
        if ans > curS:
            ans = curS
        return
    if k == N :
        return
    bit[k] = 0
    p(k+1,curS)
    bit[k] = 1
    p(k+1, curS + lst[k])
    return
T = int(input())
for tc in range(1,T+1):
    N,B = map(int, input().split())
    lst = list(map(int, input().split()))
    bit = [0]*(N+1)
    ans = sum(lst)+1
    p(0,0)
    print(f'#{tc}',ans-B)

```

### 백준 1167 트리의 지름

```python

from collections import deque

def bfs(x):
    q = deque()
    visited = [0] * (V + 1)
    q.append(x)
    visited[x] = 1
    while q:
        a = q.popleft()
        for b in arr[a].keys():
            if visited[b] == 0:
                visited[b] = visited[a] + arr[a][b]
                q.append(b)
    return visited.index(max(visited))


def bfs1(x):
    q = deque()
    visited = [0] * (V + 1)
    q.append(x)
    visited[x] = 1
    while q:
        a = q.popleft()
        for b in arr[a].keys():
            if visited[b] == 0:
                visited[b] = visited[a] + arr[a][b]
                q.append(b)
    return max(visited)

V = int(input())
arr = [{} for _ in range(V+1)]
for i in range(V):
    lst = list(map(int, input().split()))
    for j in range(1,len(lst),2):
        if lst[j] != -1 :
            arr[lst[0]][lst[j]] =lst[j+1]

r = bfs(1)
ans = bfs1(r)
print(ans-1)

```

## 2023 09 19 tuesday

### 백준 15652 N과 M (4)

```python

def back(cnt):
    if cnt == M:
        print(*path)
        return

    for num in arr :
        if num < path[cnt-1] :
             continue
        path[cnt] = num
        back(cnt+1)
        path[cnt]= 0

N, M = map(int, input().split())

arr = [i for i in range(1,N+1)]
path = [0] * M
back(0)

```

### 백준 15652 N과 M (5)

```python

def back(cnt):
    if cnt == M:
        print(*path)
        return
    for num in arr :
        if num in path:
            continue
        path[cnt] = num
        back(cnt+1)
        path[cnt]= 0

N, M = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
path = [0] * M
back(0)

```

### 백준 15652 N과 M (6)


```python

def back(cnt):

    if cnt == M:
        print(*path)
        return

    for num in arr :
        if num not in path and num > path[cnt-1]:
            path[cnt] = num
            back(cnt+1)
            path[cnt]= 0

N, M = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
path = [0] * M
back(0)

```

### 백준 15652 N과 M (7)

```python

def back(cnt):

    if cnt == M:
        print(*path)
        return

    for num in arr :
            path[cnt] = num
            back(cnt+1)
            path[cnt]= 0

N, M = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
path = [0] * M
back(0)

```

### 백준 15652 N과 M (8)

```python

def back(cnt):
    if cnt == M:
        print(*path)
        return
    for num in arr :
        if num >= path[cnt-1]:
            path[cnt] = num
            back(cnt+1)
            path[cnt]= 0

N, M = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
path = [0] * M
back(0)

```

### swea solving club 5209 최소 생산 비용

```python

def f(x, curS):
    global maxs
    if curS  >= maxs:
        return
    if x == N :
        if curS < maxs:
            maxs = curS
        return
    else:
        for i in range(N):
            if bit[i] == 0:
                bit[i] = 1
                f(x+1,curS+arr[x][i])
                bit[i] = 0


T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    bit = [0] * N
    maxs = 1500
    f(0, 0)
    print(f'#{tc}',maxs)

```

### swea solving club 1865 동철이의 일 분배

```python

def f(x, curS):
    global maxs
    if maxs >= curS:
        return
    if x == N :
        if curS > maxs:
            maxs = curS
        return
    else:
        for i in range(N):
            if bit[i] == 0:
                bit[i] = 1
                f(x+1,curS*arr[x][i]/100)
                bit[i] = 0

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    bit = [0]*N
    maxs = 0
    f(0,1)
    print(f'#{tc} {maxs*100:.6f}')

```

### swea solving club 5208 전기버스2

```python

def charge(x,cnt):
    global mincnt
    if cnt > mincnt:
        return
    elif x >= N-1:
        mincnt = cnt
        return
    else:
        for i in range(1,stop[x]+1):
            if  x+stop[x]+stop[x+stop[x]] <= x+i+stop[x+i]:
                charge(x+i,cnt + 1)


T = int(input())
for tc in range(1, T+1):
    lst = list(map(int, input().split()))
    N = lst[0]
    stop = lst[1:] + [0]*100
    # print(stop)
    mincnt = 101
    charge(0,-1)
    print(f'#{tc}',mincnt)

```


### swea solving club 2819 격자판의 숫자 이어 붙이기

```python 

def f(i,j,ans):
    if len(ans) == 7 :
        result.add(ans)
        return
    for di,dj in [(1,0),(0,1),(-1,0),(0,-1)]:
        ni, nj = i+di,j+dj
        if 0<=ni<4 and 0<=nj<4 :
            f(ni,nj,ans+arr[ni][nj])
 
T = int(input())
for tc in range(1,T+1):
    arr = [list(input().split()) for _ in range(4)]
    # print(arr)
    result = set()
    for i in range(4):
        for j in range(4):
            f(i,j,arr[i][j])
    print(f'#{tc}',len(result))

```

### 백준 1931 회의실 배정

```python

import sys
input = sys.stdin.readline
N = int(input())
lst = []
for _ in range(N):
    a,b = map(int, input().split())
    lst.append((b,a))
lst.sort(reverse=True)
y,x = lst.pop()
cnt = 1
while lst :
    j, i = lst.pop()
    if i >= y :
        cnt += 1
        x,y = i,j
print(cnt)

```

### 백준 1715 카드 정렬하기

```python

import heapq
import sys
input = sys.stdin.readline
N = int(input())
heap = []
for _ in range(N):
    a = int(input())
    heapq.heappush(heap,a)

s = 0

while len(heap) >=2 :
    x = heapq.heappop(heap)
    y= heapq.heappop(heap)
    s+=x + y
    heapq.heappush(heap,x+y)

print(s)

```

### 백준 1744 수 묶기

```python

import heapq
import sys
input = sys.stdin.readline

N = int(input())
heap = []
cnt = 0
for _ in range(N):
    a = int(input())
    if a != 0:
        heapq.heappush(heap,-a)
    else :
      cnt = 1
s = 0
if heap :
    if len(heap) == 1:
        print(-heap[0])
    else:
        while len(heap)>=2:
            x = -heapq.heappop(heap)
            y = -heapq.heappop(heap)
            if y > 1 :
                s += x*y
            
            elif  y == 1 :
                  s+= x+y
            elif x > 0 and y < 0:
                if len(heap)%2 == 1:
                    s+= x
                    heapq.heappush(heap,-y)
                else:
                    if cnt == 1:
                        s += x
                    else:
                        s += x+y
            else:                
                if len(heap)%2 == 1 :
                    if cnt == 1 :
                        heapq.heappush(heap,-y)
                    else:
                        s += x
                        heapq.heappush(heap,-y)
                else:
                    s+=x*y
        if heap :
            s-= heap[0]  
        print(s)
else:
    print(0)

```

## 2023 09 20 wednesday

### swea solving club 1238 Contect

```python

from collections import deque
def bfs(x):
    visited = [0]*101
    q = deque()
    visited[x] = 1
    q.append(x)
    while q:
        i = q.popleft()
        for j in range(1,101):
            if arr[i][j] == 1 and visited[j] == 0:
                q.append(j)
                visited[j] = visited[i] + 1
    return visited


T = 10
for tc in range(1,T+1):
    N, k = map(int, input().split())
    arr = [[0]*101 for _ in range(101)]
    lst = list(map(int, input().split()))
    for i in range(0,N,2):
        arr[lst[i]][lst[i+1]] = 1

    V = bfs(k)
    for i in range(100,0,-1):
        if V[i] == max(V):
            print(f'#{tc}',i)
            break

```

### swea solving club 5248 그룹 나누기

```python

from collections import deque

def bfs(x):
    q = deque()
    q.append(x)
    while q :
        i = q.popleft()
        for j in range(1,N+1):
            if arr[i][j] == 1 and visited[j] == 0 :
                    q.append(j)
                    visited[j] = 1
    return

T = int(input())
for tc in range(1,T+1):
    N,M = map(int, input().split())
    arr = [[0]*(N+1) for _ in range(N+1)]
    lst = list(map(int, input().split()))
    for i in range(0,len(lst),2):
        arr[lst[i]][lst[i+1]] = 1
        arr[lst[i+1]][lst[i]] = 1
    visited = [0]*(N+1)
    cnt = 0
    for k in range(1,N+1):
        if visited[k] == 0:
            visited[k] = 1
            bfs(k)
            cnt += 1

    print(f'#{tc}',cnt)

```

### swea solving club 5247 연산

```python

from collections import deque

T = int(input())
for tc in range(1,T+1):
    N,M = map(int,input().split())
    visited = [False]*1000001
    cnt = 1000001
    q = deque()
    q.append((N,0))
    while q :
        x,y = q.popleft()
        if x == M :
            print(f'#{tc}',y)
            break
        for i in (x+1,x-1,x*2,x-10):
            if 0<=i<=1000000 and visited[i] == False:
                q.append((i,y+1))
                visited[i] = True

```

### 백준 1300 K번째 수 

```python

N = int(input())
k = int(input())
s = 1
e = k
ans = 0
while s<=e :
    mid = (s+e)//2
    cnt = 0
    for i in range(1,N+1):
        if mid//i < N :
            cnt += mid//i
        else:
            cnt += N
    if cnt < k :
        s = mid + 1
    else:
        e = mid - 1
        ans = mid
print(ans)

```

### 백준 1874 스택 수열

```python

import sys
input = sys.stdin.readline
N = int(input())
st = []
lst = [i for i in range(1,N+1)]
lst.sort(reverse=True)
result= ''
x = 0
for _ in range(N):
    a = int(input())
    if st :
        if a in st :
            while st :
                b = st.pop()
                result += '-'
                if b == a:
                    break
        else:
            if a in lst:
                while True:
                    c = lst.pop()
                    if c == a :
                        result+='+'
                        result+='-'
                        break
                    else:
                        st.append(c)
                        result+='+'

            else:
                x = 1

    else:
        if a in lst:
            while True:
                d = lst.pop()
                if d == a :
                    result += '+'
                    result += '-'
                    break
                else:
                    st.append(d)
                    result += '+'
        else:
            x = 1

if x == 1:
    print('NO')
else:
    for i in result:
        print(i)

```

### 백준 13549 숨바꼭질 3

```python

import sys
input =  sys.stdin.readline
from collections import deque
N,K = map(int, input().split())
q = deque()
q.append(N)
visited = [0] * 100001
ans = -1
visited[N] = 1
while q:
    x = q.popleft()
    if ans != -1 and visited[x] > ans :
        break
    if x == K :
        ans = visited[x]
    else:
        for i in (2*x,x-1, x+1):
            if i == 2*x :
                if 0<=i<=100000 and (visited[i] == 0 or visited[i] == visited[x] + 1) :
                    q.append(i)
                    visited[i] = visited[x]
            else:
                if 0 <= i <= 100000 and (visited[i] == 0 or visited[i] == visited[x] + 1):
                    q.append(i)
                    visited[i] = visited[x] + 1
print(ans-1)


```

### 백준 13549 숨바꼭질 4

```python

import sys
input = sys.stdin.readline
from collections import deque
N,K = map(int, input().split())
q = deque()
q.append((N,f'{N}'))
visited = [0] * 100001
ans = -1
visited[N] = 1
while q:
    x,lst = q.popleft()
    if x == K :
        ans = visited[x]
        print(ans - 1)
        print(lst)
        break
    else:
        for i in (2*x,x-1, x+1):
            if 0<=i<=100000 and (visited[i] == 0 or visited[i] == visited[x] + 1) :
                q.append((i,lst+' '+str(i)))
                visited[i] = visited[x]+1

```


## 2023 09 21 thursday

### 백준 2589 보물섬


```python

import sys
input = sys.stdin.readline
from collections import deque

L, W = map(int, input().split())
arr = [input() for _ in range(L)]
ans = 0
for i in range(L):
    for j in range(W):
        if arr[i][j] == 'L':
            q = deque()
            q.append((i,j,0))
            visited = [[0]*W for _ in range(L)]
            visited[i][j] = 1
            while q:
                x,y,k = q.popleft()
                if k > ans :
                    ans = k
                    if ans == L + W - 2:
                        break
                for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                    nx,ny = x+dx,y+dy
                    if 0<=nx<L and 0<=ny<W and arr[nx][ny] == 'L' and visited[nx][ny] == 0:
                        q.append((nx,ny,k+1))
                        visited[nx][ny] = 1

print(ans)


```

### swea solving club 5249 최소 신장 트리

```python

def prim(s):
    # 연결된 노드의 번호를 저장
    U = []
    D = [100] * (N+1)

    D[s] = 0
    for _ in range(N+1):
        # D에 있는 것중에 최선을 고른다(제일 작은값)
        minV = 10000
        for i in range(N+1):
            if i in U:
                continue
            if D[i] < minV:
                minV = D[i]
                curN = i

        # curN 결정
        U.append(curN)

        # curN 와 연결되어있는 노드들의 값을 최선으로 변경
        for i in range(N+1):
            if i in U or arr[curN][i] == 0:
                continue
            if D[i] > arr[curN][i]:
                D[i] = arr[curN][i]

    return sum(D)


T = int(input())
for tc in range(1,T+1):
    N, E = map(int, input().split())
    arr = [[0] * (N+1) for _ in range(N+1)]
    for i in range(E):
        a, b, w = map(int, input().split())
        arr[a][b] = w
        arr[b][a] = w
    print(f'#{tc}',prim(0))

```

### swea solving club 5251 최소 이동 거리

```python

def d(s):
    # 연결된 노드의 번호를 저장
    U = []
    D = [100] * (N+1)

    D[s] = 0
    for _ in range(N+1):
        # D에 있는 것중에 최선을 고른다(제일 작은값)
        minV = 10000
        for i in range(N+1):
            if i in U:
                continue
            if D[i] < minV:
                minV = D[i]
                curN = i

        # curN 결정
        U.append(curN)

        # curN 와 연결되어있는 노드들의 값을 최선으로 변경
        for i in range(N+1):
            if i in U or arr[curN][i] == 0:
                continue
            if D[i] > arr[curN][i] + D[curN]:
                D[i] = arr[curN][i] + D[curN]

    return D[N]


T = int(input())
for tc in range(1,T+1):
    N, E = map(int, input().split())
    arr = [[0] * (N+1) for _ in range(N+1)]
    for i in range(E):
        a, b, w = map(int, input().split())
        arr[a][b] = w
    print(f'#{tc}',d(0))


```

### swea solving club 5250 최소 비용

```python

from collections import deque

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    q = deque()
    visited = [[0] * N for _ in range(N)]
    q.append((0, 0))
    visited[0][0] = 1
    while q:
        x, y = q.popleft()
        for dx, dy in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < N :
                if arr[x][y] >= arr[nx][ny] :
                    d =  1
                else :
                    d = arr[nx][ny] - arr[x][y] +1
                if visited[nx][ny] > visited[x][y] + d or visited[nx][ny] == 0:
                    visited[nx][ny] = visited[x][y] + d
                    q.append((nx, ny))

    print(f'#{tc}',visited[N-1][N-1]-1)



```

### swea solving club 1251 하나로

```python

import math
def prim(s):
    U = []
    D = [10000000] * (N)

    D[s] = 0
    for _ in range(N):

        minV = 10000000
        for i in range(N):
            if i in U:
                continue
            if D[i] < minV:
                minV = D[i]
                curN = i

        U.append(curN)

        for i in range(N):
            if i in U or arr[curN][i] == 0:
                continue
            if D[i] > arr[curN][i]:
                D[i] = arr[curN][i]
    A = 0
    for i in D :
        A+=i**2
    return A

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    lstx = list(map(int, input().split()))
    lsty = list(map(int, input().split()))
    E = float(input())
    visited = [0]*N
    arr = [[0]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if i != j :
                arr[i][j] = math.sqrt(abs(lstx[i]-lstx[j])**2+abs(lsty[i]-lsty[j])**2)
                arr[j][i] = arr[i][j]
    result = prim(0)
    ans = E * result
    print(f'#{tc} {round(ans)}')


```

### swea solving club 1249 보급로

```python

from collections import deque
 
T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int,input())) for _ in range(N)]
    q = deque()
    visited = [[0] * N for _ in range(N)]
    q.append((0, 0))
    visited[0][0] = 1
    while q:
        x, y = q.popleft()
        for dx, dy in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < N :
                d = arr[nx][ny]
                if visited[nx][ny] > visited[x][y] + d or visited[nx][ny] == 0:
                    visited[nx][ny] = visited[x][y] + d
                    q.append((nx, ny))
 
    print(f'#{tc}',visited[N-1][N-1]-1)

```


## 2023 09 22 friday

### 백준 1182 부분수열의 합

```python

def subset(i,curs):
    global cnt
    if i == N and 1 in bit and curs == S :
        cnt+=1

    if i == N :
        return
    elif arr[i]>=0 and curs > S:
        return
    else:
        bit[i] = 1
        subset(i+1, curs+arr[i])
        bit[i] = 0
        subset(i+1, curs )

N, S = map(int,input().split())
arr = list(map(int, input().split()))
arr.sort()
cnt = 0
bit = [0]*N
lst = []
subset(0,0)
print(cnt)


```

### swea solving club 1486 장훈이의 높은 선반

```python

def p(i,curs):
    global miv
    if i >= N:
        return
    curs += lst[i]
    if curs >= B :
        if curs < miv :
            miv = curs
    p(i+1,curs-lst[i])
    p(i+1,curs)

T = int(input())
for tc in range(1,T+1):
    N,B = map(int,input().split())
    lst = list(map(int,input().split()))
    miv = 10000*21
    p(0,0)
    print(f'#{tc}',miv-B)

```

### swea solving club 7465 창용 마을 무리의 개수

```python


from collections import deque

T = int(input())
for tc in range(1,T+1):
    N,M =map(int, input().split())
    arr = {i:[] for i in range(1,N+1)}
    # print(arr)
    ans = 0
    for _ in range(M):
        a,b = map(int, input().split())
        arr[a].append(b)
        arr[b].append(a)
    visited = [False]*(N+1)
    for i in range(1,N+1):
        if visited[i] is False:
            q = deque()
            q.append(i)
            ans += 1
            visited[i] = True
            while q:
                x = q.popleft()
                if arr.get(x):
                    for y in arr.get(x):
                        if visited[y] is False:
                            visited[y] = True
                            q.append(y)
    print(f'#{tc}',ans)

```

### swea solving club 1952 수영장

```python

def f(mon, cost):
    global ans
    if mon == 12 and cost < ans :
        ans = cost
        return
    if mon >=12 :
        return
    if cost > ans:
        return

    f(mon+1,cost + (D*lst[mon]))

    f(mon+1,cost + M1)

    f(mon+3, cost+M3)

    f(mon+12, cost + Y)


T = int(input())
for tc in range(1,T+1):
    D,M1,M3,Y = map(int,input().split())
    lst = list(map(int, input().split()))

    ans = 10000000
    f(0,0)
    print(f'#{tc}',ans)

```

### swea solving club 1949 등산로 조성

```python

def f(i,j,cnt):
    global ans
    if ans < cnt:
        ans = cnt
    for di,dj in [(1,0),(0,1),(-1,0),(0,-1)] :
        ni,nj = i+di,j+dj
        if 0<= ni<N and 0<=nj<N and visited[ni][nj] == 0 and arr[i][j] > arr[ni][nj]:
            visited[ni][nj] = 1
            f(ni,nj,cnt+1)
            visited[ni][nj] = 0

T = int(input())
for tc in range(1,T+1):
    N,K = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    visited = [[0]*N for _ in range(N)]
    ans = 0
    top = 0
    qq = []
    for i in arr:
        if max(i) > top :
            top = max(i)
    for i in range(N):
        for j in range(N):
            if arr[i][j] == top:
                qq.append((i,j))
    for i in range(N):
        for j in range(N):
            for k in range(K+1):
                arr[i][j] -= k
                if (i, j) in qq:
                    qq.remove((i, j))
                    for x,y in qq:
                        visited[x][y] = 1
                        f(x,y,1)
                        visited[x][y] =0
                    qq.append((i,j))
                else:
                    for x, y in qq:
                        visited[x][y] = 1
                        f(x, y, 1)
                        visited[x][y] = 0
                arr[i][j] += k
    print(f'#{tc}',ans)

```

### swea solving club 1795 인수의 생일파티

```python


def dijk(s,arr):
    U = []
    D = [1000000]*(N+1)
    D[s] = 0
    for _ in range(1,N+1):
        # D에 있는 것중에 최선을 고른다(제일 작은값)
        minV = 1000000
        for i in range(1,N+1):
            if i in U:
                continue
            if D[i] < minV :
                minV = D[i]
                curN = i

        # curN 결정
        U.append(curN)

        # curN 와 연결되어있는 노드들의 값을 최선으로 변경
        for i in range(1,N+1):
            if arr[curN][i] == 0:
                continue
            if D[i] > arr[curN][i] + D[curN] :
                D[i] = arr[curN][i] + D[curN]

    return D


T = int(input())
for tc in range(1,T+1):
    N, M, S = map(int,input().split())
    G = [[0]*(N+1) for _ in range(N+1)]
    B = [[0]*(N+1) for _ in range(N+1)]
    ans = 0
    visited = [0]*(N+1)
    for _ in range(M):
        a,b,c = map(int, input().split())
        G[a][b] = c
        B[b][a] = c
    # print(arr)
    lst1 = dijk(S,G)
    lst2 = dijk(S,B)
    for i in range(1,N+1):
        s = lst1[i]+lst2[i]
        if s> ans:
            ans = s

    print(f'#{tc}',ans)

```


## 2023 09 23 saturday

### 백준 1929 소수 구하기

```python

import sys
input = sys.stdin.readline

M,N =map(int, input().split())
lst = [False,False]+[True]*(N+1)
for i in range(2,N+2):
  if lst[i] == True :
    for j in range(i*2,N+2,i):
      lst[j] = False

for i in range(M,N+1):
  if lst[i] == True:
    print(i)

```

### 백준 1747 소수&팰린드롬

```python

import sys
input = sys.stdin.readline

def ispal(x):

    s = str(x)

    for i in range(len(s)//2):

        if s[i] != s[-1-i]:

            return 0

    else:

      return 1

N =int(input())

lst = [False,False]+[True]*(2000000)

for i in range(2,N+2):

  if lst[i] == True :

    for j in range(i*2,2000002,i):

      lst[j] = False

while True :

  if lst[N] == True and ispal(N) == 1:

    print(N)

    break

  else :

    N+=1

```

### 백준 13241 최소공배수

```python


def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

N,M = map(int,input().split())
print(lcm(N,M))

```

## 2023 09 24 sunday

### 백준 17396 백도어 

```python

import sys, heapq
input = sys.stdin.readline
          
N,M = map(int,input().split())
lst = list(map(int,input().split()))
lst[-1] = 0
arr = [{} for _ in range(N)]
for _ in range(M):
    a,b,t = map(int, input().split())
    if lst[a]  or lst[b] :
        continue
    arr[a][b] = t
    arr[b][a] = t
dis = [float("inf")] * N
dis[0] =0
q = [(0,0)]
while q :
  nowD , now = heapq.heappop(q)
  if dis[now] < nowD :
    continue
  for go in arr[now].keys():
    ndis = arr[now][go]+nowD
    if dis[go]>ndis:
      dis[go]=ndis
      heapq.heappush(q,(ndis,go))
if dis[N-1] == float("inf") :
  print(-1)
else:
  print(dis[N-1])

```

### 백준 1735 분수 합

```python

def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a

a,b = map(int,input().split())
c,d = map(int,input().split())
A,B = a*d+b*c,b*d
e = gcd(A,B)
print(A//e,B//e)

```

## 2023 09 25 monday

### 백준 2206 벽 부수고 이동하기

```python
from collections import deque

N, M = map(int, input().split())
arr = [list(input()) for _ in range(N)]
visited = [[[0]*2 for _ in range(M)] for _ in range(N)]
ans = 10000000
visited[0][0][0] = 1
q = deque()
q.append((0,0,0))
while q:
    x,y,cnt = q.popleft()
    if x == N - 1 and y == M - 1:
        if ans > visited[x][y][cnt] :
            ans = visited[x][y][cnt]
            break
    for di, dj in [(1, 0), (0, 1), (-1, 0), (0, -1)]:
        ni, nj = x + di, y + dj
        if 0 <= ni < N and 0 <= nj < M and visited[ni][nj][cnt] == 0 :
            if arr[ni][nj]  == '0':
                visited[ni][nj][cnt] = visited[x][y][cnt] + 1
                q.append((ni,nj,cnt))
            if cnt == 0 and arr[ni][nj] == '1' :
                visited[ni][nj][1] = visited[x][y][0] + 1
                q.append((ni, nj, 1))

if ans == 10000000:
    print(-1)
else:
    print(ans)

```



## 2023 09 26 tuesday

### 백준

## 2023 09 27 wednesday

### 백준
