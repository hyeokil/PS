import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = [int(input()) for _ in range(N)]
    lst.sort(reverse=True)
    ans = sum(lst)
    for i in range(2,N,3):ans-=lst[i]
    print(ans)
Main()