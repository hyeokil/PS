def Main():
    N,K = map(int,input().split())
    S = input()
    visited = [False]*N
    ans = 0
    for i in range(N):
        if S[i] == "P":
            for j in range(i-K,i+K+1):
                if 0<=j<N and S[j]=="H" and not visited[j]:
                    visited[j] = True
                    break
    print(sum(visited))
Main()