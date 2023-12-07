def bf(arr , sArr, i, v):
    if v > C :
        return
    if i >=len(arr):
        sArr.append(v)
        return
    bf(arr, sArr, i+1, v)
    bf(arr, sArr, i + 1, v+arr[i])

def bs(n):
    s,e = 0,len(parR)
    while s<e:
        mid = (s+e)//2
        if parR[mid] <= n:
            s=mid+1
        else:
            e = mid
    return e

N,C = map(int, input().split())
lst = list(map(int, input().split()))
M = N >> 1
L = lst[:M]
R = lst[M:]
parL = []
parR = []
bf(L,parL,0,0)
bf(R,parR,0,0)
parR.sort()
ans = 0
for i in parL :
    ans += bs(C-i)
print(ans)
