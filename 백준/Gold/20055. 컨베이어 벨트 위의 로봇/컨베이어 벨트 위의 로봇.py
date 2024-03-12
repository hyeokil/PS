from collections import deque

N,K = map(int,input().split())
con = deque(list(map(int,input().split())))
lst = [False]*(2*N)
robot = deque(lst)
cnt = 0
ans = 0
while cnt < K:
    ans+=1
    tmp1 = con.pop()
    con.appendleft(tmp1)
    tmp2 = robot.pop()
    robot.appendleft(tmp2)
    robot[N-1] = False
    for i in range(N-2,-1,-1):
        if robot[i]:
            if not robot[i+1] and con[i+1]>0:
                if i+1 != N-1:robot[i+1]=True
                robot[i]=False
                con[i+1]-=1
                if con[i+1]==0:
                    cnt+=1
    if con[0] >0 and not robot[0]:
        con[0] -= 1
        if con[0]==0:cnt+=1
        robot[0] = True
print(ans)