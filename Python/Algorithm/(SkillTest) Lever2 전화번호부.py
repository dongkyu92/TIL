def solution(phone_book):
    answer = True
    dic = {}
    for phone in phone_book:
        dic[phone] = 1

    for phone in phone_book:
        temp = ""
        for num in phone:
            temp += num
            if temp in dic and temp != phone:
                answer = False
                
    return answer