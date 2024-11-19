import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**9)

def f(curV, k):
    if k==K:
        nums.add(curV)
        return
    for i in range(N):
        if not visited[i]:
            visited[i] = True
            f(int(str(curV)+str(lst[i])),k+1)
            visited[i] = False

def Main():
    global N,nums,K,visited,lst
    nums = set()
    N = int(input())
    K = int(input())
    visited = [False]*N
    lst = [int(input()) for _ in range(N)]
    for j in range(N):
        visited[j] = True
        f(lst[j],1)
        visited[j] = False
    print(len(nums))
Main()