a = []
while(True):
    A, B = map(int, input().split())
    if A == 0 & B == 0:
        break
    else:
        a.append(A + B)
for i in a:
    print(i)