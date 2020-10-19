
def solution(words):
    answer = 0
    words = set(words.upper())
    count = []

    for i in words:
        print(i)
    return answer

print(solution('Mississipi'))
# print(solution('zZa'))
# print(solution('z'))
# print(solution('baaa'))


# Python3에서 value(int)값이 가장 큰 key값 가져오기
# max(딕셔너리.item(), key=operator.itemgetter(1))[0]