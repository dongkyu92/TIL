from collections import defaultdict, Counter

def solution(clothes):
    answer = 1
    dic = defaultdict(int)

    for clothe in clothes:
        if clothe[1] not in dic:
            dic[clothe[1]] = 1
        else:
            dic[clothe[1]] += 1
    
    for i in dic.values():
        answer *= (i + 1)

    return answer - 1
# defaultdict를 썼으니 if else 비교는 필요 없다.

# TestCase
solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]])
#solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]])


# 깔끔한 풀이
# def solution(clothes):
#     from collections import Counter
#     from functools import reduce
#     cnt = Counter([kind for name, kind in clothes])
#     answer = reduce(lambda x, y: x*(y+1), cnt.values(), 1) - 1
#     return answer