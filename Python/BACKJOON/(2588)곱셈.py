a = int(input())
b = int(input())
resultB = [b%10, (b%100)//10, b//100]
result = []
for i, j in zip(resultB, [1, 10, 100]):
    print(a * i)
    result.append(a * i * j)
print(sum(result))

 # resultB 리스트를 아예 역순으로 바꿈