import sys
input = sys.stdin.readline

def Main():
    N,H = map(int,input().split())
    lstA = []
    lstB = []
    for i in range(N):
        a = int(input())
        if i%2 == 0:
            lstA.append(a)
        else:
            lstB.append(H-a)
    lstA.sort()
    lstB.sort(reverse=True)
    ans = [float('inf'),0]
    for i in range(1,H+1):
        res = 0
        s,e=0,N//2
        while s<e:
            mid = (s+e)//2
            if lstA[mid] < i:
                s = mid+1
            else:
                e=mid
        res+=N//2-e
        s, e = 0, N // 2
        while s < e:
            mid = (s + e) // 2
            if lstB[mid] >= i:
                s = mid + 1
            else:
                e = mid
        res+=N//2-e
        if ans[0] > res:
            ans[0] = res
            ans[1]= 1
        elif ans[0] == res:
            ans[1]+=1
    print(*ans)

Main()