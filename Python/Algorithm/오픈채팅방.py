from collections import defaultdict
def solution(record):
    answer = []
    dic = defaultdict(str)
    for i in record:
        if i.split()[0] == 'Enter':
            
            if dic[i.split[1]] not in dic:
                dic[i.split[1]] == i.split[2] + '님이 들어왔습니다.'

            

        elif i.split()[0] == 'Leave':
            dic[i.split[1]] == i.split[2] + '님이 나갔습니다.'
            
        elif i.split()[0] == 'Change':
        

    return answer


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))