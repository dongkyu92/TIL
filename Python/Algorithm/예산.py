def solution(d, budget):
    d.sort()
    for idx, value in enumerate(d):
        if value <= budget:
            budget -= value
        else:
            idx -= 1
            break

    return idx+1

    

# print(solution([1, 3, 2, 5, 4], 9))
print(solution([2, 2, 3, 3], 10))