def Main():
    X,Y,W,S = map(int, input().split())
    A = max(X,Y)
    B = min(X,Y)
    if (A-B)%2 == 0:
        print(min((X+Y)*W,B*S+(A-B)*W,B*S+(A-B)*S))
    else:
        print(min((X + Y) * W, B * S + (A - B) * W, B * S + (A - B-1) * S+W))
Main()