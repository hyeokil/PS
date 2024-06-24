from functools import cmp_to_key
import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = input().split()
    lst.sort(key=cmp_to_key(lambda x,y:-1 if int(x+y)>int(y+x) else 1))
    print("".join(lst) if sum(map(int,lst)) else 0 )
Main()