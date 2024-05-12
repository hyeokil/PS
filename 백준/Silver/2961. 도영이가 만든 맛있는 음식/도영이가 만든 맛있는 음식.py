import sys
input = sys.stdin.readline

def f(k,curS,curB,flag):
    global ans
    curV = abs(curS-curB)
    if k==N:
        if flag:
            ans = min(ans,curV)
        return
    f(k+1,curS*arr[k][0],curB+arr[k][1],True)
    f(k+1,curS,curB,flag)

N = int(input())
arr = []
for _ in range(N):
    S,B = map(int,input().split())
    arr.append((S,B))
ans = float('inf')
f(0,1,0,False)
print(ans)