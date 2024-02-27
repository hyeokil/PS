import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    dic = {}
    cnt = 0
    ans = 0
    for i in range(N):
        a = int(input())
        if a in dic:
            dic[a]+=1
        else:
            dic[a]=1
    for d in dic:
        if dic[d] > cnt:
            cnt =dic[d]
            ans = d
        elif dic[d] == cnt and ans > d:
            ans =d
    print(ans)
Main()