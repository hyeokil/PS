import sys
input = sys.stdin.readline

N,M = map(int,input().split())
L = [(0,0)]
for i in range(1,M+1):
    a,b=map(int,input().split())
    L.append((a,i))
    L.append((b, i))
L.sort()
L[0]=L[-1]
print(L[N%(M*2)][1])