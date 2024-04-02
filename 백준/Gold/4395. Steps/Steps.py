import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        A,B = map(int,input().split())
        C = B-A
        n = int(((-1)+(1+4*C)**(1/2))/2)
        tmp = C - n * (n + 1)
        ans = 2 * n
        if 0 < tmp <= n + 1:
            ans += 1
        elif tmp > n + 1:
            ans += 2
        print(ans)
Main()
