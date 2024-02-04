import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    maxA,maxB,maxC = 0,0,0
    minA,minB,minC = 0,0,0
    for _ in range(N):
        a,b,c = map(int,input().split())
        A = a+max(maxA,maxB)
        B = b+max(maxA,maxB,maxC)
        C = c+max(maxB,maxC)
        maxA,maxB,maxC =A,B,C
        A = a+min(minA,minB)
        B = b+min(minA,minB,minC)
        C = c+min(minB,minC)
        minA,minB,minC = A,B,C
    print(max(maxA,maxB,maxC),min(minA,minB,minC))
Main()