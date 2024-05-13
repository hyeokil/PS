T = int(input())
for _ in range(T):
    input()
    N,M = map(int,input().split())
    lstN = list(map(int,input().split()))
    lstM = list(map(int, input().split()))
    lstN.sort(reverse=True)
    lstM.sort(reverse=True)
    while len(lstN)>0 and len(lstM)>0:
        if lstN[-1] >= lstM[-1]:
            lstM.pop()
        else:
            lstN.pop()
    if len(lstN)>0:
        print("S")
    else:
        print("B")