def solution(array, commands):
    answer = []
    sortedArray = []
    for i in range(0, len(commands)):
        sortedArray = sorted(array[commands[i][0] - 1 : commands[i][1]])
        answer.append(sortedArray[commands[i][2] - 1])
    return answer

solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]])





# def solution(array, commands):
#     answer = []
#     for command in commands:
#         i,j,k = command
#         answer.append(list(sorted(array[i-1:j]))[k-1])
#     return answer