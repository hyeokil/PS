def partial(arr, sArr, i, v):
    if i >= len(arr) :
        if v in sArr :
            sArr[v]+=1
        else:
            sArr[v] = 1
        return
    partial(arr,sArr,i+1,v)
    partial(arr,sArr,i+1,v+arr[i])


N, S = map(int, input().split())
lst = list(map(int, input().split()))
M = N >> 1
L= lst[:M]
R = lst[M:]
parL = {}
parR = {}
partial(L,parL,0,0)
partial(R,parR,0,0)
ans = 0
for i in parL:
    V = S-i
    if V in parR :
        ans += parL[i]*parR[V]
if S == 0:
    print(ans-1)
else:
    print(ans)