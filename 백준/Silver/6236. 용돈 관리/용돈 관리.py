import sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    lst = [int(input()) for _ in range(N)]
    S = sum(lst)
    s,e = 0,S
    while s<e:
        mid = (s+e)//2
        cnt = 1
        now = mid
        flag = True
        for i in range(N):
            if lst[i]<=now:
                now-=lst[i]
            else:
                cnt+=1
                now = (mid-lst[i])
                if now<0:
                    flag = False
                    break
            if cnt>M:
                flag = False
                break
        if flag:
            e = mid
        else:
            s = mid+1
    print(s)

Main()