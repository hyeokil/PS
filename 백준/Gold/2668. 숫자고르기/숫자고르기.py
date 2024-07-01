import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    lst = [0]
    se = set()
    for i in range(N):
        a = int(input())
        lst.append(a)
        se.add(a)
    while True:
        tmp = set()
        for i in list(se):
            tmp.add(lst[i])
        if len(se)==len(tmp):
            break
        se = tmp
    ans = list(se)
    print(len(ans))
    ans.sort()
    for i in ans:
        print(i)
Main()