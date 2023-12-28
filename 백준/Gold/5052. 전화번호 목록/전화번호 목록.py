import sys
input = sys.stdin.readline
def Main():
    for tc in range(int(input())):
        N = int(input())
        nums = [input().rstrip() for _ in range(N)]
        nums.sort()
        toggle = True
        for i in range(N-1):
            if nums[i] == nums[i+1][:len(nums[i])]:
                toggle = False
                break
        if toggle :
            print('YES')
        else:
            print('NO')
Main()