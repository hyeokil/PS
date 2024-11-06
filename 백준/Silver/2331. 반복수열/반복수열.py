import sys
input = sys.stdin.readline

def Main():
    dic = {}
    N, M = map(int,input().split())
    dic[N]= 0
    idx = 1
    ans = 0
    while True:
        res = 0
        for n in str(N):
            res +=int(n)**M
        if res in dic:
            ans = dic[res]
            break
        else:
            dic[res]= idx
            idx+=1
            N = res
    print(ans)            
Main()