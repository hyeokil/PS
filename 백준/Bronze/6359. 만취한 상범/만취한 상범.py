import sys
input = sys.stdin.readline

def Main():
    for _ in range(int(input())):
        n = int(input())
        ans = 0 
        for i in range(1, n):
            if i**2 <= n:
                ans += 1
            if i**2 > n:
                break
        print(ans)  
Main()