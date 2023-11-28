import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    M = int(input())
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a,b = map(int, input().split())
        arr[a].append(b)
        arr[b].append(a)
    lst = set()
    ans = set()
    for i in arr[1]:
        lst.add(i)
        ans.add(i)
    for i in lst:
        for j in arr[i]:
            if j != 1 :
                ans.add(j)
    print(len(ans))
Main()