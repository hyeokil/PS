import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    W,K = map(int,input().split())
    print((W*K)//2)