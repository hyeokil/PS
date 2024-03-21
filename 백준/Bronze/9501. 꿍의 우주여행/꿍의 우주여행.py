T=int(input())
for tc in range(T):
    N,D = map(int,input().split())
    ans = 0
    for i in range(N):
        a,b,c = map(int,input().split())
        if a*(b/c) >= D:ans+=1
    print(ans)
