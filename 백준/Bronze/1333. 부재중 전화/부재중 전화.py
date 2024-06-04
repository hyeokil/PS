N,L,D = map(int,input().split())
V = L
tmp = D
for i in range(N-1):
    if V > tmp:
        while V > tmp:
            tmp += D
    if V<=tmp<V+5:
        print(tmp)
        break
    V+=(5+L)
else:
    if V > tmp:
        while V > tmp:
            tmp += D
    print(tmp)
