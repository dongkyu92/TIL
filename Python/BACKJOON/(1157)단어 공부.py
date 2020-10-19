from collections import defaultdict, Counter
def solution(words):
    answer = ''
    dic = defaultdict(int)
    words = words.upper()
    for word in words:
        if word not in words:
            dic[word] = 1
        else:
            dic[word] += 1
    if len(dic) > 1 and Counter(dic).most_common(2)[0][1] == Counter(dic).most_common(2)[1][1]:
        answer = '?'
    else:
        answer = Counter(dic).most_common(1)[0][0].upper()
    return answer

print(solution('Mississipi'))
print(solution('zZa'))
print(solution('z'))
print(solution('baaa'))


# Python3에서 value(int)값이 가장 큰 key값 가져오기
# max(딕셔너리.item(), key=operator.itemgetter(1))[0]
# most_common


words = input().upper()
dic = defaultdict(int)
for word in words:
    if word not in words:
        dic[word] = 1
    else:
        dic[word] += 1
if len(dic) > 1 and Counter(dic).most_common(2)[0][1] == Counter(dic).most_common(2)[1][1]:
    print('?')
else:
    print(Counter(dic).most_common(1)[0][0].upper())