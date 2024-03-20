N=int(input())
ans =0
if N >30:
    ans+=15
    ans+=(N-30)*1.5
else:ans+=N/2
print(ans)