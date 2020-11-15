def solution(answers):
    answer = [0, 0, 0]
    s1 = [1, 2, 3, 4, 5]
    s2 = [2, 1, 2, 3, 2 ,4 ,2 ,5]
    s3 = [3, 3, 1, 1, 2, 2, 4, 4 ,5, 5]
    result = []

    for i, _ in enumerate(answers):

        if s1[i % 5] == answers[i]: # len(s1) 하면 런타임에러
            # len의 시간복잡도 O(1) 
            answer[0] += 1

        if s2[i % 8] == answers[i]:
            answer[1] += 1

        if s3[i % 10] == answers[i]:
            answer[2] += 1
        
        # elif 하면 하나만 들어감..
    for i in range(3):
        if answer[i] == max(answer):
            result.append(i + 1)
    # return [ i + 1 for i, s in enumerate(answer) if s == max(answer) ]
    return result

print(solution([1, 2, 3, 4, 5]))
print(solution([1, 3, 2, 4, 2]))