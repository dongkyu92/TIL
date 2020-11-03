# heapq 힙큐 알고리즘
# 힙은 모든 부모 노드가 자식보다 작거나 같은 값을 갖은 이진 트리.
# 모든 k에 대해 heap[k] <= heap[2*k+1]과 heap <= heap[2*k+2]인 배열을 사용
# 요소는 0 부터 카운트

# 데이터를 저장된 상태로 저장하는 heapq 사용.
import heapq

def solution(scoville, K):
    answer = 0

    heapq.heapify(scoville)
    # heapq.heapify(x)
    # 리스트 x를 선형 시간으로 제자리에서 힙으로 변환합니다.
    

    while scoville[0] < K:
        # 이 코드를 안넣으면 런타임 에러 4개 뜬다.
        # while문 break 조건이 힙큐의 최소값이 K보다 작은 동안 계속 돈다.
        # 즉, 원소가 하나일때도  K보다 작기만하면 while문으로 들어오는데
        # 원소가 하나일때는 -1을 리턴해줘야 heapq가 재정렬을 안함.
        if len(scoville) <= 1:
            return -1
        
        heapq.heappush(scoville, heapq.heappop(scoville) + (heapq.heappop(scoville) * 2))
        answer += 1
    return answer
# 가장 작은 원소 찾기
# heap[0] --> 최소값
# heap[1] --> 두번째 최소값 아님.. 주의
# heappop을 통해 원소를 삭제해야 이진 트리가 재배치되어
# 새로운 최소값을 인덱스 0에 놓음


print(solution([1, 2, 3, 9, 10, 12], 7))
