def solution(record):
    answer = []
    uid_dic = {}
    id_dic = {}
    message_dic = {}
    for i in record:
        if i.split()[0] == 'Enter':
            if i.split()[1] in id_dic:
                id_dic[i.split()[1]] = i.split()[2]
                uid_dic[i.split()[1]] = i.split()[1]
                message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 들어왔습니다.'] 
                answer.append( [uid_dic[i.split()[1]], message_dic[i.split()[1]]])

                for index, ans in enumerate(answer):
                    if ans[0] == uid_dic[i.split()[1]]: 
                        answer[index][0] = uid_dic[i.split()[1]]
                        answer[index][1][0] = message_dic[i.split()[1]][0]

            else:
                id_dic[i.split()[1]] = i.split()[2]
                uid_dic[i.split()[1]] = i.split()[1]
                message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 들어왔습니다.'] 
                answer.append( [uid_dic[i.split()[1]], message_dic[i.split()[1]]])
        
        elif i.split()[0] == 'Leave':
            message_dic[i.split()[1]] = [id_dic[i.split()[1]], '님이 나갔습니다.']
            answer.append( [uid_dic[i.split()[1]], message_dic[i.split()[1]]])

            
        elif i.split()[0] == 'Change':
            for index, ans in enumerate(answer):
                if ans[0] == uid_dic[i.split()[1]]:
                    id_dic[i.split()[1]] = i.split()[2]
                    uid_dic[i.split()[1]] = i.split()[1]
                    answer[index][0] = uid_dic[i.split()[1]]
                    answer[index][1][0] = i.split()[2]
    result = []
    for i in answer:
        result.append(''.join(i[1]))       
    return result


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))
# ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]