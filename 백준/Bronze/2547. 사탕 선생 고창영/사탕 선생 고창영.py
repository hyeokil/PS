import sys
input = sys.stdin.readline


T = int(input())
for _ in range(T):
    __ = input()
    N = int(input())
    res = 0
    for i in range(N):
        res += int(input())
    if res%N == 0:print("YES")
    else:print("NO")