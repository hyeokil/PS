import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = [int(input()) for _ in range(N)]
    lst.sort(reverse=True)
    ans =0
    for i in range(N):
        ans += max(lst[i]-i,0)
    print(ans)
Main()
