import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    drink = [int(input()) for _ in range(N)]
    s = 1
    e= max(drink)
    if K==1:
        print(e)
    else:
        while s<e:
            mid = (s+e)//2
            cnt = 0
            for dr in drink:
                cnt +=dr//mid
            if cnt >= K:
                s = mid+1
            else:
                e = mid
        print(s-1)
Main()