import sys
input = sys.stdin.readline
def Main():
    S = input().rstrip()
    se = set(list(S))
    Q = int(input())
    L =len(S)
    seL = len(se)
    dic = {}
    for i in se:
        dic[i] = [0]*(L+1)
    for i in range(1,L+1):
        for j in se:
            dic[j][i] = dic[j][i-1]
        dic[S[i-1]][i]+=1
    for q in range(Q):
        X,s,e = input().rstrip().split()
        if X in dic :
            print(dic[X][int(e)+1]-dic[X][int(s)])
        else:
            print(0)

Main()