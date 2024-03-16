import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N,M=map(int,input().split())
        ans = 0
        for i in range(1,N-1):
            for j in range(i+1,N):
                if (i*i+j*j+M)%(i*j) == 0:
                    ans +=1
        print(ans)
Main()