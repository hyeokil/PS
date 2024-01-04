import sys
input = sys.stdin.readline
N = int(input())
lst = []
for _ in range(N):
    a,b = map(int, input().split())
    lst.append((b,a))
lst.sort(reverse=True)
y,x = lst.pop()
cnt = 1
while lst :
    j, i = lst.pop()
    if i >= y :
        cnt += 1
        x,y = i,j
print(cnt)