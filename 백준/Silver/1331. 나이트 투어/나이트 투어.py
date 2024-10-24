import sys
input = sys.stdin.readline
def Main():
    d = set([(-1,-2),(1,-2),(-2,-1),(2,-1),(-2,1),(2,1),(1,2),(-1,2)])
    visited = [[False]*6 for _ in range(6)]
    flag = True
    location = input().rstrip()
    x= ord(location[0])-ord('A')
    y = int(location[1])-1
    s= x
    e = y
    visited[x][y] = True
    for _ in range(35):
        location = input().rstrip()
        nx= ord(location[0])-ord('A')
        ny = int(location[1])-1
        if (x-nx,y-ny) not in d:
            flag = False
        if visited[nx][ny]:
            flag = False
        visited[nx][ny] = True
        x = nx
        y = ny

    if (x-s,y-e) not in d:
        flag = False
    ans = "Valid"
    if not flag:
        ans = "Invalid"
    print(ans)    
Main()
