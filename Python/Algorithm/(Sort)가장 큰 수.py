def solution(numbers):
    answer = ''

    numbers = list(map(str, numbers))
    numbers.sort(key = lambda x:x*3, reverse = True)
    if sum(map(int,numbers)) == 0:
        numbers = list(set(numbers))
    return str(''.join(numbers))


print(solution([0,0,0]))
print(solution([6, 10, 2]))
solution([3, 30, 34, 5, 9])