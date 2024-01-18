import sys
input = sys.stdin.readline

def f(i,curV):
    global big,small
    if i==N:
        big = max(big,curV)
        small = min(small,curV)
        return
    for j in range(4):
        if lstC[j] > 0 :
            lstC[j]-=1
            if j == 0:
                f(i+1,curV+lst[i])
            elif j == 1:
                f(i+1,curV-lst[i])
            elif j==2 :
                f(i+1,curV*lst[i])
            else:
                if curV < 0 : f(i+1,-(abs(curV)//lst[i]))
                else:f(i+1,curV//lst[i])
            lstC[j]+=1

N = int(input())
lst = list(map(int,input().split()))
lstC = list(map(int,input().split()))
big = -float('inf')
small = float('inf')
f(1,lst[0])
print(big)
print(small)

