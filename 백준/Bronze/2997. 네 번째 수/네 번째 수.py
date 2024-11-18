import sys
input = sys.stdin.readline

def Main():
    lst = list(map(int,input().split()))
    lst.sort()
    ans = 0
    if lst[2]-lst[1] == lst[1]-lst[0]:
        ans=lst[2]+lst[2]-lst[1]
    elif lst[2]-lst[1] > lst[1]-lst[0]:
        ans = lst[1]+lst[1]-lst[0]
    else:
        ans = lst[0]+lst[2]-lst[1]
    print(ans)
Main()