N = int(input())
cnt = 1
if N == 0:
    print(1)
else:
    for i in range(1,N+1):
        cnt = cnt*i
    print(cnt)
    