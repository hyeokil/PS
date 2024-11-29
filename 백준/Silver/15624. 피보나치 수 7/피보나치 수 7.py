N = int(input())
fibo = [0,1]
for i in range(2,N+1):
    fibo.append((fibo[i-1]+fibo[i-2])%1000000007)
print(fibo[N])
