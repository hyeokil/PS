import sys
input = sys.stdin.readline

N = int(input())
unwashed = list(range(N,0,-1))
not_dried = []
cleaned = []
while N>0 :
    c,d = map(int,input().split())
    if c==1:
        for i in range(d):
            not_dried.append(unwashed.pop())
    elif c==2:
        N-=d
        for i in range(d):
            cleaned.append(not_dried.pop())

for i in cleaned[::-1]:
    print(i)