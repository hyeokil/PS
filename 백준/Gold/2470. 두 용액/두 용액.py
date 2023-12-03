import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    res = [0,0]
    G = float('inf')
    s,e = 0,N-1
    while s<e:
        V = lst[s]+lst[e]
        if abs(V) < G:
            G = abs(V)
            res[0] = lst[s]
            res[1] = lst[e]
        if V == 0 :
            break
        elif V > 0 :
            e -= 1
        else:
            s += 1
    res.sort()
    print(*res)
Main()