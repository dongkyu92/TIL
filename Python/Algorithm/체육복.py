def solution(n, lost, reserve):
    answer = 0
    number = []
    pop_list = []

    # 빌려줄 수 있는 학생의 수
    for r in reserve:
        number.append([r, r - 1, r + 1, True])
        # 옷을 빌려줄 수 있는 학생을 튜플 리스트에 추가
        # 학생 번호, 빌려줄 수 있는 앞의 학생 번호, 빌려줄 수 있는 뒤의 학생 번호, 빌려주는 것 가능 여부
    
    # 체육복 안 가져온 학생 옷 빌리기
    for l in lost:
        for i, num in enumerate(number):
            if l == num[1] or l == num[2] and num[3] != False:
                number[i][3] = False
                pop_list.append(l)
                break

    # 찾고나서 pop하면 포문이 안 돌아서 리스트에 저장 후 나중에 pop
    for i in pop_list:
        lost.pop(lost.index(i))        
    
    answer = n - len(lost)
    return answer

print('answer = ', solution(5, [2, 4], [1, 3, 5]))
# print(solution(5, [2, 4], [3]))