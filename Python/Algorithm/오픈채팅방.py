from collections import defaultdict
def solution(record):
    answer = []
    id_dic = defaultdict(str)
    message_dic = defaultdict(str)
    for i in record:
        if i.split()[0] == 'Enter':
            if i.split()[1] in id_dic:
                
                id_dic[i.split()[1]] = i.split()[2]
                message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 들어왔습니다.'] 
                answer.append( [id_dic[i.split()[1]], message_dic[i.split()[1]]])

                for index, m in enumerate(answer):
                    if m[0] == id_dic[i.split()[1]]:
                        answer[index][0] = i.split()[2]
                        answer[index][1][0] = i.split()[2]
            else:
                id_dic[i.split()[1]] = i.split()[2]
                message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 들어왔습니다.'] 
                answer.append( [id_dic[i.split()[1]], message_dic[i.split()[1]]])
        
        elif i.split()[0] == 'Leave':
            message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 나갔습니다.']
            answer.append( [id_dic[i.split()[1]], message_dic[i.split()[1]]])

            
        elif i.split()[0] == 'Change':
            for index, m in enumerate(answer):
                if m[0] == id_dic[i.split()[1]]:
                    answer[index][0] = i.split()[2]
                    answer[index][1][0] = i.split()[2]

    for i in answer:
        print(''.join(i[1]))       
    return answer


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))
# ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]