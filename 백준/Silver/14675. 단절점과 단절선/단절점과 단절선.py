import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    node = [0]*(N+1)
    for i in range(N-1):
        a,b = map(int,input().split())
        node[a]+=1
        node[b] += 1
    M = int(input())
    for i in range(M):
        t,k = map(int,input().split())
        if t==1:
            if node[k]>1:
                print("yes")
            else:
                print("no")
        else:
            print("yes")
Main()