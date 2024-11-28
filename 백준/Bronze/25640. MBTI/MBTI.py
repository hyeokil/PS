import sys
input = sys.stdin.readline

def Main():
    mbti = input().rstrip()
    ans = 0
    for i in range(int(input())):ans += 1 if mbti == input().rstrip() else 0
    print(ans)

Main()

