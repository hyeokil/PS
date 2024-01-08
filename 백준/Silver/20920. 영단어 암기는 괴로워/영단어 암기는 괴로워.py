import sys
input = sys.stdin.readline
def Main():
    N,M = map(int,input().split())
    dic = {}
    for _ in range(N):
        S = input().rstrip()
        if len(S) < M :
            continue
        if S in dic :
            dic[S] += 1
        else:
            dic[S] = 1
    lst = list(dic.items())
    lst.sort()
    lst.sort(key=lambda x:len(x[0]),reverse=True)
    lst.sort(key=lambda x:x[1],reverse=True)
    for a,b in lst:
        print(a)
Main()