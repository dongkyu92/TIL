from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    time = 0
    q = [0] * bridge_length

    while q:
        time += 1
        q.pop(0)
        
    return answer


solution(2, 10, [7, 4, 5, 6])
solution(100, 100, [10])
solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10])