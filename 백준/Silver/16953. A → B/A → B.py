from collections import deque

def Main():
    A,B = map(int,input().split())
    q = deque()
    q.append((A,1))
    se = set()
    ans = -1
    while q :
        x,cnt = q.popleft()
        if x == B:
            ans = cnt
            break
        if x*2 not in se and x*2 <= B:
            se.add(x*2)
            q.append((x*2,cnt+1))
        if int(str(x)+'1') not in se and int(str(x)+'1') <= B:
            se.add(int(str(x)+'1'))
            q.append((int(str(x)+'1'), cnt + 1))
    print(ans)
Main()