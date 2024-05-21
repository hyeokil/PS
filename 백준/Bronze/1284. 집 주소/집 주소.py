import sys
input = sys.stdin.readline

while True:
    N = input().rstrip()
    if N == "0":
        break
    ans = 1
    for n in N:
        if n=="1":ans+=3
        elif n=="0":ans+=5
        else:ans+=4
    print(ans)