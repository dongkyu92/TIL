def solution(arr):
    answer = []
    if len(arr) == 1:
        answer = [-1]
    else:
        arr.sort(reverse=True)
        arr.pop()
        answer = arr
    return answer

print(solution([7, 4, 5, 2]))