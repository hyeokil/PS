import sys
input = sys.stdin.readline
def cantor(s,n):
    if n == 1:
        return
    for i in range(s+n//3,s+n//3*2):
        ans[i] = ' '
    cantor(s,n//3)
    cantor(s+n//3*2,n//3)


while True :
    try:
        N = int(input())
    except:
        break
    ans = ['-']*(3**N)
    cantor(0,3**N)
    print(''.join(ans))