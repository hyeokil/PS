import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    stat = [list(map(int,input().split())) for _ in range(N)]
    stat.sort()
    ans = float('inf')
    for i in range(N):
        for j in range(N):
            cnt = 0
            for k in range(N):
                a,b = stat[i][1],stat[j][2]
                if stat[k][1] <= a and stat[k][2] <= b:
                    cnt+=1
                    c = stat[k][0]
                    if cnt ==K:
                        ans = min(ans,a+b+c)
                        break
    print(ans)
Main()