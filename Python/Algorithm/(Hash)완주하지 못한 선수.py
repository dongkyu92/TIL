def solution(participant, completion):

    participant.sort()
    completion.sort()
    for i, j in zip(participant, completion):
        print(i, j)
        if(i != j):
            return i
    return participant[-1]

print(solution(["leo", "kiki", "eden"], ["eden", "kiki"]))
print(solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]))
print(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))

# sort() 함수는 리스트 자체를 정렬하기 때문에 변수에 저장할 필요가 없음.
# zip() 함수는 리스트 2개를 묶어서 리스트로 반환 (짧은 리스트 기준으로 자름)
# print i, j는 i와 j가 동시에 증가함




# collections 사용 정답
# import collections

# def solution(participant, completion):
#     answer = collections.Counter(participant) - collections.Counter(completion)
#     return list(answer.keys())[0]


# 해시함수 사용 정답
# def solution(participant, completion):
#     answer = ''
#     temp = 0
#     dic = {}
#     for part in participant:
#         dic[hash(part)] = part
#         temp += int(hash(part))
#     for com in completion:
#         temp -= hash(com)
#     answer = dic[temp]

#     return answer