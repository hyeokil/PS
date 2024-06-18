import sys
input = sys.stdin.readline

def sumN(lst):
    res = 0
    for i in lst:
        if i.isdigit():
            res+=int(i)
    return res


N = int(input())
arr = [input().rstrip() for _ in range(N)]
arr.sort(key=lambda x:(len(x), sumN(x),x))
for i in arr:
    print(i)

