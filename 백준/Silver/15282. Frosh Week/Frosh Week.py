import sys
input = sys.stdin.readline

N,M = map(int,input().split())
task = list(map(int,input().split()))
interval = list(map(int,input().split()))
task.sort()
interval.sort()
ans = 0
i,j=0,0
while i<N and j<M:
    if task[i]<= interval[j]:
        ans+=1
        i+=1
        j+=1
    else:
        j+=1
print(ans)
