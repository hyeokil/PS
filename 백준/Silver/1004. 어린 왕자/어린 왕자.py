def Main():
    for tc in range(int(input())):
        x1,y1,x2,y2 = map(int,input().split())
        N = int(input())
        ans = 0
        for _ in range(N):
            xc,yc,r = map(int,input().split())
            S = (xc - x1) ** 2 + (yc - y1) ** 2
            E = (xc-x2)**2+(yc-y2)**2
            if S < r**2 and E > r**2 :
                ans += 1
            elif S > r**2 and E < r**2 :
                ans += 1
        print(ans)
Main()