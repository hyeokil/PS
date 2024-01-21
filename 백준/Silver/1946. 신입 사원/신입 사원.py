import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N = int(input())
        lst = []
        ans = 1
        idx = 0
        for i in range(N):
            a,b = map(int,input().split())
            lst.append((a,b))
        lst.sort()
        for i in range(1,N):
            if lst[i][1] < lst[idx][1] :
                ans+=1
                idx=i
        print(ans)
Main()