import sys
input = sys.stdin.readline
N,K= map(int, input().split())
coin = []
for i in range(N):
    coin.append(int(input()))
cnt = 0
while K >0:
    for i in range(N-1,0,-1):
        if K >= coin[i] :
            cnt += K // coin[i]
            K = K%coin[i]
            break
    else:
        cnt += K
        break
print(cnt)