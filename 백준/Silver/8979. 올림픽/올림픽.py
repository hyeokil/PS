def Main():
    N,M = map(int,input().split())
    arr = []
    arr.append((float('inf'),float('inf'),float('inf'),0))
    for i in range(N):
        a,b,c,d = map(int,input().split())
        arr.append((b,c,d,a))
    arr.sort(reverse=True)
    idx = 0
    res = 0
    for i in range(1,N+1):
        if arr[i][:3] != arr[i-1][:3]:
            idx+=1
            idx+=res
            res = 0
        else:res+=1
        if arr[i][3] == M:
            print(idx)
            break
Main()