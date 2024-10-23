import sys
input = sys.stdin.readline
def Main():
    prefix = [0]*5001
    for i in range(1, 5001):
        visited = [False]*10
        flag = True
        for c in str(i):
            if visited[int(c)]:
                flag = False
                break
            visited[int(c)] = True
        prefix[i] = prefix[i-1]
        if flag:
            prefix[i]+=1
    while True:
        try:
            N,M = map(int,input().split())
            print(prefix[M]-prefix[N-1])
        except:
            break
Main()