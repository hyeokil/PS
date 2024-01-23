import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N,M = map(int,input().split())
        lstA = list(map(int,input().split()))
        lstB = list(map(int,input().split()))
        lstB.sort()
        ans = 0
        for a in lstA:
            s,e = 0,M
            while s<e:
                mid = (s+e)//2
                if lstB[mid]>=a:
                    e=mid
                else:
                    s=mid+1
            ans+=s
        print(ans)
Main()