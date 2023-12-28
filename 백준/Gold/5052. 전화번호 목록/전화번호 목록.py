import sys
input = sys.stdin.readline
def Main():
    for tc in range(int(input())):
        N = int(input())
        nums = [input().rstrip() for _ in range(N)]
        nums.sort()
        for i in range(N-1):
            if nums[i] == nums[i+1][:len(nums[i])]:
                print('NO')
                break
        else:
            print('YES')
Main()