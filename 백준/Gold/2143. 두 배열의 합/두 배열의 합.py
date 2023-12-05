import sys
input = sys.stdin.readline
from collections import defaultdict
def Main():
    T = int(input())
    N = int(input())
    lstA = list(map(int,input().split()))
    M = int(input())
    lstB = list(map(int, input().split()))
    dic = defaultdict(int)
    ans = 0
    for i in range(N):
        V= 0
        for j in range(i,N):
            V += lstA[j]
            dic[V] += 1
    for i in range(M):
        V = 0
        for j in range(i,M):
            V += lstB[j]
            ans += dic[T-V]
    print(ans)
Main()