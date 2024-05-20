from collections import deque

def Main():
    N,K = map(int,input().split())
    q = deque([i for i in range(1,N+1)])
    size = N
    while size>1:
        if size < K:
            break
        else:
            a = q.popleft()
            q.append(a)
            for _ in range(K-1):
                q.popleft()
            size-=(K-1)
    print(q[0])
Main()