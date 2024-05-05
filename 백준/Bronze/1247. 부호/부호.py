import sys
input=sys.stdin.readline

for _ in range(3):
    answer = 0
    for i in range(int(input())):
        answer += int(input())
    
    if not answer:
        print(0)
    elif answer < 0:
        print("-")
    else:
        print("+")