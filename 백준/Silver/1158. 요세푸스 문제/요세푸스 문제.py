from collections import deque
def Main():
    N, K = map(int,input().split())
    q = deque(i for i in range(1,N+1))
    res = []
    ans ='<'
    while q:
        for i in range(K-1):
            x = q.popleft()
            q.append(x)
        y =q.popleft()
        res.append(y)
    ans += str(res[0])
    for i in range(1,N):
        ans += f', {res[i]}'
    ans += '>'
    print(ans)
Main()