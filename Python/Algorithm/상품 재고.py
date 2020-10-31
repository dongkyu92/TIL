from collections import defaultdict
def solution(n, delivery):
    answer = []
    # n개의 상품 재고 유무 딕셔너리 초기화
    dic = defaultdict(int)
    
    for _ in delivery:
        for i in delivery:
            # 상품 주문 리스트의 배송이 성공이라면 두 상품 다 재고가 있는 것.
            if i[2] == 1:
                if dic[i[0]] not in dic and dic[i[1]] not in dic:
                    dic[i[0]] = 1
                    dic[i[1]] = 1
                    
                elif dic[i[0]] in dic and dic[i[1]] not in dic:
                    dic[i[1]] = 1

                elif dic[i[0]] not in dic and dic[i[1]] in dic:
                    dic[i[0]] = 1
            else:
            # 배송에 실패 했다면 두 개의 상품 각각 딕셔너리에 있는지 확인
            # 둘 중 하나의 상품이 재고가 있는지 확인
                if dic[i[0]] in dic:
                    dic[i[1]] = -1
                elif dic[i[1]] in dic:
                    dic[i[0]] = -1
                # 둘다 없을 경우
                elif dic[i[0]] not in dic and dic[i[1]] not in dic:
                    continue

    print('dic[5]:',dic[9])
    # 상품 재고 여부 다 확인했음. 상품 n 대상으로 포문을 돌아서 0이면 X 1 이상이면 O, not in dic이면 (?)
    for j in range(1, n + 1):
        print('dic[',j,']:',dic[j])
        if dic[j] == 0 :
            answer.append('?')
        elif dic[j] == 1:
            answer.append('O')
        elif dic[j] == -1:
            answer.append('X')

    return ''.join(answer) 

print(solution(6, [[1, 3, 1], [3, 5, 0], [5, 4, 0], [2, 5, 0]]))
print(solution(7, [[5, 6, 0], [1, 3, 1], [1, 5, 0], [7, 6, 0], [3, 7, 1], [2, 5, 0]]))