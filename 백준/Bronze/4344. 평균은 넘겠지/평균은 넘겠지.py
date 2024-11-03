import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N,*lst = map(int,input().split())
        lst.sort()
        avg = sum(lst)/N
        cnt = N
        for i in range(N):
            if lst[i] > avg:
                cnt = i
                break
        print(f"{(N-cnt)/N*100+0.0001:.3f}%")
Main()

