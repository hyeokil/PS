import sys
input = sys.stdin.readline

def Main():
    N, M = map(int,input().split())
    list_ = [i for i in range(1,N+1)]
    for _ in range(M):
        a,b,c = map(int,input().split())
        a-=1
        c-=1
        list_ =list_[:a]+list_[c:b]+list_[a:c]+list_[b::]
    print(*list_)
Main()