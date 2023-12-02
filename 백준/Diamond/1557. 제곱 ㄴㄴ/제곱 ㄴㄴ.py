def f(n):
    tmp = 0
    for i in range(1,int(n**0.5)+1):
        tmp+=M[i]*(n//i**2)
    return tmp

N = int(input())
s, e = 0, 2000000000
M = [0]*1000001
M[1] = 1
for i in range(1,1000001):
    if M[i]:
        for j in range(i*2,1000001,i):
            M[j] -= M[i]
while s<e-1:
    mid = (s+e)//2
    if f(mid) < N:
        s = mid
    else:
        e = mid
print(e)