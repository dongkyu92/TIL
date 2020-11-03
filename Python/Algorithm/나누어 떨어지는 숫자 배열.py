def solution(arr, divisor):
    answer = [ x for x in arr if x % divisor == 0]
    if len(answer) == 0:
        answer = [-1]
    return sorted(answer)

# def solution(arr, divisor): return sorted([n for n in arr if n%divisor == 0]) or [-1]
# 파이썬은 or 앞이 참일 경우 해당 값까지만, 거짓일 경우 뒤에 것까지 호출

print(solution([5, 9, 7, 10], 5))
print(solution([2, 36, 1, 3], 1))
print(solution([3, 2, 6], 10))