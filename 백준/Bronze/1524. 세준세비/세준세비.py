T = int(input())
for _ in range(T):
    input()
    N,M = map(int,input().split())
    lstN = list(map(int,input().split()))
    lstM = list(map(int, input().split()))
    if max(lstN)>=max(lstM):
        print("S")
    else:
        print("B")