# import heapq
# def solution(priorities, location):
#     answer = 0
#     h = []
#     for priority in priorities:
#         heapq.heappush(h, (100 - priority, priority))
#     print(heapq.heappop(h))
#     return answer

# deque를 활용하면 더 빨라짐.
# deque.rotate(n) 활용.
# 양수면 오른쪽으로 회전, 음수면 왼쪽으로 회전.

from collections import deque
def solution(priorities, location):
    answer = 0
    d = deque([(v, i) for i, v in enumerate(priorities)])
    # max값을 쉽게 찾기 위해 i, v의 위치를 바꾼다. (v, i) 소괄호 필수

    while len(d):
        temp = d.popleft()
        if max(d)[0] > temp[0] and d:
            d.append(temp)

        else:
            answer += 1
            if temp[1] == location:
                break
    return answer

solution([2, 1, 3, 2], 2)
solution([1, 1, 9, 1, 1, 1], 0)
