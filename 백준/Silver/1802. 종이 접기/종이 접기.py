import sys
input = sys.stdin.readline

for tc in range(int(input())):
    S = input().rstrip()
    L = len(S)
    flag = True
    for i in range(L//2):
        if S[i] == S[-i-1]:
            flag = False
            break
    if not flag:
        print("NO")
        continue
    for i in range(2,L,2):
        if S[i-2] == S[i]:
            flag = False
            break
    if flag:
        print("YES")
    else:
        print("NO")

