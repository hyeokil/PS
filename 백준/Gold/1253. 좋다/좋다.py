def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    ans = 0
    for i in range(N):
        G = lst[i]
        s = 0
        e = N-1
        while s < e:
            V = lst[s] + lst[e]
            if V == G:
                if s == i:
                    s += 1
                elif e == i:
                    e -= 1
                else:
                    ans += 1
                    break
            elif V > G:
                e -= 1
            else:
                s += 1
    print(ans)
Main()