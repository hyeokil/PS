import sys
input = sys.stdin.readline

def isPal(s):
    for i in range(len(s)//2):
        if s[i] != s[-i-1]:
            return False
    return True

for i in range(int(input())):
    S1 = input().rstrip()
    S2 = S1[::-1]
    res = str(int(S1)+int(S2))
    if isPal(res) :
        print('YES')
    else:
        print("NO")
