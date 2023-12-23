from collections import deque
def Main():
    N,W,L = map(int,input().split())
    q = deque(list(map(int, input().split())))
    road = deque([0]*W)
    ans = 0
    while q or sum(road) !=0 :
        ans += 1
        road.popleft()
        if q and sum(road) + q[0] <= L:
            x = q.popleft()
            road.append(x)
        else:
            road.append(0)
    print(ans)
Main()