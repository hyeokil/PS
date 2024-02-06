import sys
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N = int(input())
        lst = [0]*(N+1)
        visited = [True]*(N+1)
        for i in range(N-1):
            a,b = map(int, input().split())
            lst[b]=a
        a,b = map(int,input().split())
        while True:
            if not visited[a]:
                break
            visited[a]=False
            a = lst[a]
        while True:
            if not visited[b]:
                print(b)
                break
            b=lst[b]
Main()