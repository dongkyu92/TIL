def solution(str1, str2):
    answer = 0
    # 자카드 유사도: 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
    # A, B 둘다 공집합인 경우 J(A, B) = 1로 정의한다.
    str1 = str1.lower()
    str2 = str2.lower()
    temp1 = []
    temp2 = []

    for i, _ in enumerate(str1[:-1]):
        if str1[i].isalpha() and str1[i + 1].isalpha():
            temp1.append(''.join([str1[i], str1[i + 1]]))
        else:
            continue

    for i, _ in enumerate(str2[:-1]):
        if str2[i].isalpha() and str2[i + 1].isalpha():
            temp2.append(''.join([str2[i], str2[i + 1]]))
        else:
            continue
    
    if len(temp1) == 0 and len(temp2) == 0 :
        return 65536

    else:
        intersection = set(temp1) & set(temp2)
        union = set(temp1) | set(temp2)
        answer = len(intersection) / len(union)
        
        
    return int(answer * 65536)

# print(solution("aa1+aa2", "AAAA12"))
# print(solution("FRANCE", "french"))
# print(solution("handshake", "shake hands"))
# print(solution("E=M*C^2", "e=m*c^2"))