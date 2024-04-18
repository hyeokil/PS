import sys
input = sys.stdin.readline

def f(L,R):
    A = L[:]
    res =0
    for i in range(1,N):
        if A[i-1]==R[i-1]:continue
        res+=1
        for j in range(i-1,i+2):
            if j<N:
                A[j]=1-A[j]
    return res if A==R else float('inf')

N = int(input())
NOW = list(map(int, input().rstrip()))
END = list(map(int, input().rstrip()))
ans = f(NOW,END)
NOW[0] = 1-NOW[0]
NOW[1] = 1-NOW[1]
ans = min(ans,f(NOW,END)+1)
print(ans if ans != float('inf') else -1)