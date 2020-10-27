def solution(priorities, location):
    answer = 0
    for i, priority in enumerate(priorities):
        if Location == i:
            for j in priorities[i:len(priorities - 1)]:
                if j > priority:
                    priorities.pop(0)
                    answer += 1
        else:
            priorities.pop(0)
            answer += 1

        
    return answer


solution([2, 1, 3, 2], 2)
solution([1, 1, 9, 1, 1, 1], 0)