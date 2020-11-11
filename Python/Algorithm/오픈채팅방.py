def solution(record):
    answer = []
    uid_dic = {}
    id_dic = {}
    message_dic = {}
    for i, _ in enumerate(record):
        record[i] = record[i].split()
    
    for i, _ in enumerate(record):
        if record[i][0] == 'Enter':
            if record[i][1] in id_dic:
                id_dic[record[i][1]] = record[i][2]
                uid_dic[record[i][1]] = record[i][1]
                message_dic[record[i][1]] = [id_dic[record[i][1]], '님이 들어왔습니다.'] 
                answer.append([uid_dic[record[i][1]], message_dic[record[i][1]]])
                # id_dic이 필요?
                # answer에 넣어서 for 문으로 찾지말고 딕셔너리에 리스트를 넣어서
                # 최악이 N2이 아니라 선형이 되도록 변경
                
                for index, ans in enumerate(answer):
                    if ans[0] == uid_dic[record[i][1]]: 
                        answer[index][0] = uid_dic[record[i][1]]
                        answer[index][1][0] = message_dic[record[i][1]][0]

            else:
                id_dic[record[i][1]] = record[i][2]
                uid_dic[record[i][1]] = record[i][1]
                message_dic[record[i][1]] = [id_dic[record[i][1]], '님이 들어왔습니다.'] 
                answer.append( [uid_dic[record[i][1]], message_dic[record[i][1]]])
        
        elif record[i][0] == 'Leave':
            message_dic[record[i][1]] = [id_dic[record[i][1]], '님이 나갔습니다.']
            answer.append( [uid_dic[record[i][1]], message_dic[record[i][1]]])

            
        elif record[i][0] == 'Change':
            for index, ans in enumerate(answer):
                if ans[0] == uid_dic[record[i][1]]:
                    id_dic[record[i][1]] = record[i][2]
                    uid_dic[record[i][1]] = record[i][1]
                    answer[index][0] = uid_dic[record[i][1]]
                    answer[index][1][0] = record[i][2]
    result = []
    for i in answer:
        result.append(''.join(i[1]))       
    return result


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))
# ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]