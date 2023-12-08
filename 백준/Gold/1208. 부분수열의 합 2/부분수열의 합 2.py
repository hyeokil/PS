def partial(arr, sArr, i, v):
    if i >= len(arr) :
        if v in sArr :
            sArr[v]+=1
        else:
            sArr[v] = 1
        return
    partial(arr,sArr,i+1,v)
    partial(arr,sArr,i+1,v+arr[i])

def binarySearch(n):
    cnt = 0
    s= 0
    e = lenR
    while s<e :
        mid = (s+e)//2
        if lstR[mid] == n :
            cnt = parR[lstR[mid]]
            return cnt
        elif lstR[mid] < n:
            s = mid +1
        else:
            e = mid
    return cnt


N, S = map(int, input().split())
lst = list(map(int, input().split()))
M = N >> 1
L= lst[:M]
R = lst[M:]
parL = {}
parR = {}
partial(L,parL,0,0)
partial(R,parR,0,0)
lstR = sorted(parR.keys())
lenR = len(parR)
ans = 0
for i in parL:
    ans += parL[i]*binarySearch(S-i)
if S == 0:
    print(ans-1)
else:
    print(ans)