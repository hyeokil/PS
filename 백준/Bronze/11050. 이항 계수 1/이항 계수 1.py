N,K = map(int, input().split())
s = 1
ss = 1
for i in range(1,N+1):
    s *= i
for i in range(1,N-K+1):
    ss *= i
for i in range(1,K+1):
    ss *= i
print(s//ss)