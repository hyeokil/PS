import sys
input = sys.stdin.readline
def Main():
    N=int(input())
    lst = list(map(int,input().split()))
    lst.sort(reverse=True)
    ans = 0
    for i in range(N):
        ans = max(ans,lst[i]+i+2)
    print(ans)
Main()