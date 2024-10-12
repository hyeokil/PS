import sys
from collections import deque
input = sys.stdin.readline


def Main():
    check = [True]*10000
    check[0]=check[1] = False
    for i in range(2,101):
        if check[i]:
            for j in range(i+i,10000,i):
                check[j] = False
    N = int(input())
    for _ in range(N):
        A, B = map(int, input().split())
        ans =-1
        visited = [False]*10000
        q= deque()
        q.append((A,0))
        visited[A] = True
        while q:
            num,cnt = q.popleft()
            if num==B:
                ans = cnt
                break
            for i in range(4):
                for j in range(10):
                    next_num = (10**(3-i)*j)+(num-10**(3-i)*int(str(num)[i]))
                    if next_num >=1000 and check[next_num] and not visited[next_num]:
                        visited[next_num] = True
                        q.append((next_num,cnt+1))
        if ans != -1:
            print(ans)
        else:
            print("Impossible")
Main()