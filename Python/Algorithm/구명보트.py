def solution(people, limit):
    answer = 0
    people_number = 0
    people_weight = 0
    peoples = sorted(people)
    
    flag = True
    while flag:
        if people
        for i in people:
            if people_number < 2 and people_weight + i <= limit:
                people_weight += i
                people_number += 1

            if people_number == 2 or people_weight == 100 :
                people_weight = 0
                people_number = 0
                answer += 1
            
        else:
            people_weight = 0
            people_number = 0
            answer += 1
            
            

    
    print(i, people_number, people_weight)
    
            


    return answer


print(solution([70, 50, 80, 50], 100))
# print(solution([70, 80, 50], 100))