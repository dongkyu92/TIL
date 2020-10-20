# 버블소트
N = int(input())
result = []
for i in range(N):
    result.append(int(input()))
    # int를 안붙여주면 str로 인식해서 아스키코드순으로 정렬한다.

for i in range(1, len(result)):
    for j in range(0, len(result) - 1):
        print('j와 result의 값 : ',j ,result)
        if result[j] > result[j + 1]:
            result[j], result[j + 1] = result[j + 1], result[j]
            

for i in result:
    print(i)