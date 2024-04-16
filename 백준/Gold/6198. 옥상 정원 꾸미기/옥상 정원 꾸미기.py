import sys
input = sys.stdin.readline

buildings = [int(input()) for _ in range(int(input()))]
st = []
res = 0

for building in buildings:
  while st and st[-1]<=building:
    st.pop()
  st.append(building)
  res += len(st)-1
print(res)