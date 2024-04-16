import sys
input = sys.stdin.readline

def Main():
    buildings = [int(input()) for _ in range(int(input()))]
    st = []
    ans = 0
    for building in buildings:
      while st and st[-1]<=building:st.pop()
      st.append(building)
      ans += len(st)-1
    print(ans)
Main()