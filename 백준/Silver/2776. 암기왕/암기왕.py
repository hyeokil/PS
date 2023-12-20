import sys
input = sys.stdin.readline
def Main():
    for tc in range(int(input())):
        N = int(input())
        lstN = set(map(int,input().split()))
        M = int(input())
        lstM = list(map(int, input().split()))
        for m in lstM :
            if m in lstN:
                print(1)
            else:
                print(0)
Main()