# 데이터를 저장된 상태로 저장하는 heapq 사용.
import heapq

def solution(scoville, K):
    answer = 0
    heap = []
    for i in scoville:
        heapq.heappush(heap, i)

    flag = True
    while flag:
        if heap[0] > K:
            flag = False
        else:
            temp1 = heapq.heappop(heap)
            temp2 = heapq.heappop(heap)
            temp = temp1 + (temp2 * 2)
            heapq.heappush(heap, temp)
            answer += 1
    return answer
# 가장 작은 원소 찾기
# heap[0] --> 최소값
# heap[1] --> 두번째 최소값 아님.. 주의
# heappop을 통해 원소를 삭제해야 이진 트리가 재배치되어
# 새로운 최소값을 인덱스 0에 놓음


print(solution([1, 2, 3, 9, 10, 12], 7))
