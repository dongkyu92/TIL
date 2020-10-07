    def solution(phone_book):
        answer = True
        dic = {}
        for pNumber in phone_book:
            dic[pNumber] = 1
        for pNumber in phone_book:
            temp = ""
            for num in pNumber:
                temp += num
                if temp in dic and temp!=pNumber:
                    answer = False
        return answer



# 효율성 떨어지는 풀이

# def solution(phone_book):
#     answer = True

#     phone_book = list(map(int, phone_book))
#     phone_book.sort()
#     phone_book = list(map(str, phone_book))
#     # 오름차순으로 정렬했기 때문에 길이가 긴놈은 짧은놈의 접두사가 될 수 없다.
    
#     phone_book_len = len(phone_book)
#     phone_book_index = range(0, phone_book_len)

#     for i, j in zip(phone_book_index, phone_book[:-1]):
#         for k in phone_book[i+1 : phone_book_len]:
#             if k.startswith(j):
#                 answer = False
    
#     print(answer)
#     return answer

# solution(['119', '97674223', '1195524421'])

# # 파이썬의 내장 함수인 map()는 여러 개의 데이터를 한 번에 다른 형태로 변환하기 위해서 사용. 
# # 따라서, 여러 개의 데이터를 담고 있는 list나 tuple을 대상으로 주로 사용하는 함수.
# # map(변환 함수, 순회 가능한 데이터)