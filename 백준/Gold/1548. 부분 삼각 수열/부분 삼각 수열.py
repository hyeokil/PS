import sys
input = sys.stdin.readline

N = int(input())
lst= list(map(int,input().split()))
lst.sort()
ans = 0
if N>2 :
    for i in range(N-2):
        for j in range(i+2,N):
            if lst[i]+lst[i+1] <=lst[j]:
                ans = max(ans,j-i)
                break
        else:
            ans = max(ans,N-i)
            break
else:
    ans=N
print(ans)
