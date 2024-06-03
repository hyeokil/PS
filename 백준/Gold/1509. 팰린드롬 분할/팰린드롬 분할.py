import sys
input= sys.stdin.readline

def hyeokil():
    s = '@'+ input()
    L = len(s)
    dp = [2500]*L
    dp[0] = 0
    for i in range(2, L*2-1):
        x,y = i//2, (i+1)//2
        while x>0 and y<L and s[x] == s[y]:
            if dp[x-1]+1 < dp[y]:
                dp[y] = dp[x-1]+1
            x -= 1
            y += 1
    print(dp[-1]-1)
hyeokil()