N = int(input())

i = 10
result = []
temp = N

while(True):
    if temp < i:
        result.append(temp)
        break
    result.append(temp % i)
    temp = temp // i
    

result.sort(reverse=True)
result = list(map(str, result))
print(''.join(result))