import sys
input = sys.stdin.readline

S, B = map(int, input().split())
check = [1]* (B-S+1)
for i in range(2,int(B**0.5)+1):
    p = i**2
    start_idx = S//p
    if S%p != 0 :
        start_idx+=1
    for j in range(start_idx,B//p + 1):
        check[int(j*p)-S] = 0
print(sum(check))