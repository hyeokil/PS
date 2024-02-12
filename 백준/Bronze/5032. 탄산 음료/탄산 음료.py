A,B,C = map(int, input().split())
S = A+B
ans = 0
while C <=S:
    ans += S//C
    S =S//C+S%C
print(ans)