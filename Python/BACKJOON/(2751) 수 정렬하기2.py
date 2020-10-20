# 시간 복잡도가 nlogn인 정렬 알고리즘으로 풀 수 있음
# 머지 소트, 힙 소트
# 내일 풀자

N = int(input())
result = []
for i in range(N):
    result.append(int(input()))
    # int를 안붙여주면 str로 인식해서 아스키코드순으로 정렬한다.
     

for i in result:
    print(i)