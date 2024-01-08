from collections import deque
def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    lst.reverse()
    ans = deque()
    n = 1
    for i in range(N):
        if lst[i] == 1 :
            ans.appendleft(n)
        elif lst[i] == 2 :
            x = ans.popleft()
            ans.appendleft(n)
            ans.appendleft(x)
        else:
            ans.append(n)
        n+=1
    print(*ans)
Main()