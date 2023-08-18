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