import sys
input = sys.stdin.readline
def Main():
    N,S = input().rstrip().split()
    N = int(N)
    ans = 0
    for i in range(N):
        A,cnt = input().rstrip().split()
        A = set(A.split("_"))
        if S in A:
           ans += int(cnt)
    print(ans)
Main()