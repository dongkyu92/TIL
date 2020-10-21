# 시간 복잡도가 nlogn인 정렬 알고리즘으로 풀 수 있음
# 머지 소트, 힙 소트

N = int(input())
result = []
for i in range(N):
    result.append(int(input()))
    # int를 안붙여주면 str로 인식해서 아스키코드순으로 정렬한다.


def merge_sort(list):

    if len(list) <= 1:
        return list
        
    mid = len(list) // 2
    leftList = list[:mid]
    rightList = list[mid:]
    leftList = merge_sort(leftList)
    rightList = merge_sort(rightList)
    return merge(leftList, rightList)
    
    
    
def merge(left, right):

    result = []
    while len(left) > 0 or len(right) > 0:
        if len(left) > 0 and len(right) > 0:
            if left[0] <= right[0]:
                result.append(left[0])
                left = left[1:]
            else:
                result.append(right[0])
                right = right[1:]
        elif len(left) > 0:
            result.append(left[0])
            left = left[1:]
        elif len(right) > 0:
            result.append(right[0])
            right = right[1:]
    return result

result = merge_sort(result)

for i in result:
    print(i)