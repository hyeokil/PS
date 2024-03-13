import sys
input = sys.stdin.readline
N =int(input())
arr = [int(input()) for i in range(N)]
print("NS"[max(arr)==arr[0]])