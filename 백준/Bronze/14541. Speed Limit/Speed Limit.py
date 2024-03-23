import sys
input = sys.stdin.readline

while True:
    N = int(input())
    if N == -1 :break
    ans = 0
    tmp = 0
    for i in range(N):
        a,b = map(int,input().split())
        ans+=a*(b-tmp)
        tmp=b
    print(f"{ans} miles")