import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    crane = list(map(int,input().split()))
    M = int(input())
    box = list(map(int,input().split()))
    crane.sort()
    box.sort()
    if crane[-1]<box[-1]:
        print(-1)
    else:
        lst = [0]*N
        idx = 0
        for i in range(N):
            if idx ==M:break
            while idx<M and crane[i] >= box[idx] :
                lst[i]+=1
                idx+=1
        ans = [0]*N
        S = 0
        for i in range(N-1,-1,-1):
            S += lst[i]
            ans[i] = S//(N-i)+(S%(N-i)!=0)
        print(max(ans))
Main()