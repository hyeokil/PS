import sys
input = sys.stdin.readline

def Main():
    fibo = [0]*41
    N = int(input())
    fibo[0] = fibo[1] = 1
    for i in range(2,41):fibo[i] = fibo[i-1]+fibo[i-2]
    print(fibo[N])
Main()

