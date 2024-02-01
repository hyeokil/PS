import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = list(map(int,input().split()))
    preLst = [0]
    for i in lst:
        preLst.append(preLst[-1]+i)
    M =int(input())
    for _ in range(M):
        a,b = map(int,input().split())
        print(preLst[b]-preLst[a-1])
Main()