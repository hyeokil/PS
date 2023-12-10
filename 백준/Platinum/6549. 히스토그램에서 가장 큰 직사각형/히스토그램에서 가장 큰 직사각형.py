import sys
input = sys.stdin.readline

def Main():
    while True:
        N,*lst = list(map(int, input().split()))
        if N == 0 :
            break
        q = []
        ans = 0
        for i in range(N):
            while q and lst[q[-1]] > lst[i] :
                x = q.pop()
                if q :
                    L = i-q[-1]-1
                else:
                    L = i
                ans = max(ans,L*lst[x])
            q.append(i)

        while q:
            x = q.pop()

            if q:
                L = N-q[-1]-1
            else:
                L = N
            ans = max(ans, L*lst[x])
        print(ans)
Main()