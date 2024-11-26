import sys
input = sys.stdin.readline

def Main():
    A, B = map(int,input().split())
    M = int(input())
    list_= list(map(int,input().split()))[::-1]
    n = 0
    for i in range(M):n+=list_[i]*(A**i)
    ans = []
    while n:
        ans.append(n%B)
        n//=B
    print(*ans[::-1])    
Main()
