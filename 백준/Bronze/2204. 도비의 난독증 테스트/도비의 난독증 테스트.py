while True:
    N= int(input())
    if N==0:
        break
    ans = input()
    for _ in range(N-1):
        s=input()
        if ans.upper() > s.upper():
            ans = s
    print(ans)
