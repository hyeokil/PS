import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = []
    sm = 0
    for _ in range(N):
        X,V = map(int,input().split())
        arr.append((X,V))
        sm += V
    arr.sort()
    cnt = 0
    for x,v in arr:
        cnt+=v
        if cnt>=sm/2:
            print(x)
            break
Main()