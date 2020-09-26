import sys
a = []
while(True):
    A, B = map(int, input().split())
    a.append(A + B)
for i in a:
    print(i)