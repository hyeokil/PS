import sys
input = sys.stdin.readline
from collections import defaultdict
def Main():
    T = int(input())
    N = int(input())
    lstA = list(map(int,input().split()))
    M = int(input())
    lstB = list(map(int, input().split()))
    prefixA = [0]
    prefixB = [0]
    for i in lstA:
        prefixA.append(prefixA[-1]+i)
    for i in lstB:
        prefixB.append(prefixB[-1]+i)
    dic = defaultdict(int)
    ans = 0
    for i in range(1,N+1):
        for j in range(i):
            V = prefixA[i] - prefixA[j]
            dic[V] += 1
    for i in range(1,M+1):
        for j in range(i):
            V = prefixB[i] - prefixB[j]
            ans += dic[T-V]
    print(ans)
Main()