import sys
input = sys.stdin.readline

for tc in range(int(input())):
    N = int(input())
    sum_n = N * (N + 1) * (N + 2) // 6
    total_area = sum_n ** 2
    print(total_area)
