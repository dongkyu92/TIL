def solution(phone_book):
    phone_book = list(map(int, phone_book))
    phone_book.sort()
    phone_book = list(map(str, phone_book))
    plist = range(1,len(phone_book)+1)
    phone_book = zip(plist, phone_book)

    for i, j in phone_book:
        print(i,j)
        print(j.startswith(phone_book[1]))
    answer = True
    return answer


solution(['119', '97674223', '1195524421'])

# 파이썬의 내장 함수인 map()는 여러 개의 데이터를 한 번에 다른 형태로 변환하기 위해서 사용. 
# 따라서, 여러 개의 데이터를 담고 있는 list나 tuple을 대상으로 주로 사용하는 함수.
# map(변환 함수, 순회 가능한 데이터)