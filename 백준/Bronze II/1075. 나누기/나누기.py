N=int(input())
F=int(input())
N-=N%100
idx=1
while True:
    if N%F == 0:
        break
    N+=idx
print(str(N)[-2:])