import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    fibo = [0]*46
    fibo[0] = fibo[1] = 1
    for i in range(2,46):fibo[i] = fibo[i-1]+fibo[i-2]
    for i in range(N):
        print(fibo[int(input())])
Main()

