H, M = map(int, input().split())

if M - 45 < 0:
    if H == 0:
        H = 23
    else:
        H = H - 1
    M = 60 + (M - 45)
else:
    M = M - 45

print(H, M)