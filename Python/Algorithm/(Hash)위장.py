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


# TestCase
solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]])
#solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]])