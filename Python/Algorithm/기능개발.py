from collections import deque
import copy
def solution(progresses, speeds):
    answer = []
    
    zip_progresses = [ [x, y] for x, y in zip(progresses, speeds) ]
    zip_progresses = deque(zip_progresses)
    while True:
        done = 0
        if len(zip_progresses) == len(answer):
            print('break')
            break
        else:
            for i, zip_progress in enumerate(copy.deepcopy(zip_progresses)):
                if zip_progress[0] == 100:
                    zip_progresses.popleft()
                    done += 1
                else:
                    zip_progresses[0][0] += zip_progresses[0][1]
            answer.append(done)
    return answer


print(solution([93, 30, 55], [1, 30, 5]))
print(solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]))