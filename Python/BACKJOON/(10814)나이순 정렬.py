N = int(input())
members = []
for i in range(N):
    age, name = input().split()
    members.append([age, name])
members.sort(key=lambda x: (x[0],x[1]), reverse=True)

for member in members:
    print(member[0]+ ' ' + member[1])