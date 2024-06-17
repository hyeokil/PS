import sys
input = sys.stdin.readline

def f(lst):
    res = 0
    tmp = 0
    for i in lst:
        if i%2:tmp+=1
        else:res+=tmp
    return res


N = int(input())
lst = list(map(int,input().split()))
ans1 = f(lst)
lst.reverse()
ans2 = f(lst)
print(min(ans1,ans2))