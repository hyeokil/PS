import sys
input = sys.stdin.readline

while True:
    N = int(input())
    if N < 0:break
    ans = [1]
    for i in range(2,N//2+1):
        if N%i == 0: ans.append(i)
    if sum(ans) == N: print(f"{N} ="," + ".join(map(str,ans)))
    else:print(f"{N} is NOT perfect.")


