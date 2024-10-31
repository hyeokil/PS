import sys
input = sys.stdin.readline

def gcd(a,b):
    if b==0:
        return a
    return gcd(b,a%b)

def Main():
    for tc in range(int(input())):
        lst = list(map(int,input().split()))
        n = lst[0]
        ans = 0
        for i in range(1,n):
            for j in range(i+1,n+1):
                ans += gcd(lst[i],lst[j])
        print(ans)
Main()