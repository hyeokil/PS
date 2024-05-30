from collections import deque
N = int(input())
q = deque([input() for _ in range(N+N-1)])
lst1 = deque()
while q:
    a = q.popleft()
    if a not in "*/+-":
        lst1.append(int(a))
    else:
        if a == "*":
            b = lst1.pop()
            c = int(q.popleft())
            lst1.append(b*c)
        elif a == "/":
            b = lst1.pop()
            c = int(q.popleft())
            lst1.append(b // c)
        else:
            lst1.append(a)
ans = []
while lst1:
    a = lst1.popleft()
    if a != "+" and a != "-":
        ans.append(a)
    else:
        if a == "+":
            b = ans.pop()
            c = lst1.popleft()
            ans.append(b+c)
        else:
            b = ans.pop()
            c = lst1.popleft()
            ans.append(b - c)
print(ans[0])