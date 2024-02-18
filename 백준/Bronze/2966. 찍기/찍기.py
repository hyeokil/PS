N = int(input())
S = input()

Adrian = "ABC"
Bruno = "BABC"
Goran = "CCAABB"
A,B,C=0,0,0
for i in range(N):
    if S[i] == Adrian[i%3]:A+=1
    if S[i] == Bruno[i%4]:B+=1
    if S[i] == Goran[i%6]:C+=1
ans = max(A,B,C)
print(ans)
if ans == A :print("Adrian")
if ans == B :print("Bruno")
if ans == C :print("Goran")
