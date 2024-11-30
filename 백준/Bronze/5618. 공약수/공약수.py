import sys
input = sys.stdin.readline

def gcd(a,b):
    if b==0:
        return a
    return gcd(b,a%b)
def Main():
    N = int(input())
    list_ = list(map(int, input().split()))
    gcd_ = gcd(list_[0],gcd(list_[1],list_[-1]))
    for i in range(1,gcd_//2+1):
        if gcd_%i==0:print(i)
    print(gcd_)
Main()

