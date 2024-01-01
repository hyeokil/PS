import sys
input = sys.stdin.readline

def p(n):
    if n == 0 or n == 1:
        return False
    for i in range(2,int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

for tc in range(int(input())):
    N = int(input())
    while True :
        if p(N):
            print(N)
            break
        else:
            N+=1