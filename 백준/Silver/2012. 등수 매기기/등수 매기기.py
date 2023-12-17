import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    lst = [int(input()) for _ in range(N)]
    lst.sort()
    ans = 0
    for i in range(1,N+1):
        ans += abs(lst[i-1]-i)
    print(ans)
Main()