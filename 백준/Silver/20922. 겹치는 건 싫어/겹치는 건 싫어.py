import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    lst = list(map(int,input().split()))
    se = set(lst)
    dic = {}
    for s in se:
        dic[s] = 0
    s,e=0,0
    ans = 0
    while e<N:
        dic[lst[e]]+=1
        if dic[lst[e]]>K:
            while True:
                dic[lst[s]]-=1
                s+=1
                if dic[lst[e]] <= K:
                    break
        e+=1
        ans = max(ans,e-s)
    print(ans)
Main()