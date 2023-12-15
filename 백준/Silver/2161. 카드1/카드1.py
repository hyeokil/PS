from collections import deque
def Main():
    N = int(input())
    q = deque([i for i in range(1,N+1)])
    ans = []
    while len(q) > 1:
        a = q.popleft()
        ans.append(a)
        b = q.popleft()
        q.append(b)
    if ans :
        print(*ans,end=' ')
    print(*q)
Main()