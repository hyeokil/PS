import sys
input = sys.stdin.readline

T = int(input())
for tc in range(T):
    J,N = map(int,input().split())
    boxes = []
    for j in range(N):
        r,c = map(int,input().split())
        boxes.append(r*c)
    boxes.sort(reverse=True)
    for i in range(N):
        J-=boxes[i]
        if J<=0:
            print(i+1)
            break