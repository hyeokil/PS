D,H,W = map(int,input().split())
print(int((D/(H**2+W**2)**0.5)*H),int((D/(H**2+W**2)**0.5)*W))