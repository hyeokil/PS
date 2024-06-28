N,K = map(int, input().split())
V = K*(K+1)//2
if N < V:print(-1)
elif (N - V) % K == 0:print(K-1)
else:print(K)