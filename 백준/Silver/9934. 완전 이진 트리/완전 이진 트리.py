N = int(input())
lst = list(map(int,input().split()))
L = len(lst)
for i in range(N):
    L//=2
    tmp = L
    for j in range(2**i):
        print(lst[tmp],end=" ")
        tmp = tmp+L*2+2
    print()


