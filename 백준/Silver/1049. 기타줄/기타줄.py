def Main():
    N,M = map(int,input().split())
    pack = float('inf')
    cnt = float('inf')
    for i in range(M):
        a,b = map(int,input().split())
        pack = min(pack,a)
        cnt = min(cnt,b)
    print(min((N//6+1)*pack,(N//6)*pack+(N%6)*cnt,cnt*N))
Main()