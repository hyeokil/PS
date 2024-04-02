import sys
input = sys.stdin.readline

def Main():
    T = int(input())
    for _ in range(T):
        x, y = map(int, input().split())
        print(int(2 * (y - x) ** 0.5 - 1e-9))
Main() 