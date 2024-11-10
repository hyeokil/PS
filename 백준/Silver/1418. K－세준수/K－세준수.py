import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    K = int(input())
    lst = [0]*(N+1)
    ans = 1
    for i in range(2,N+1):
        if lst[i]==0:
            for j in range(i,N+1,i):
                lst[j] = i
        if lst[i] <= K:ans+=1
    print(ans)
Main()

