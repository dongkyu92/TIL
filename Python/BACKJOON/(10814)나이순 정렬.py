
member_num = int(input())
member_list = []

for _ in range(member_num):
    member_age, member_name = map(str, input().split())
    member_age = int(member_age)
    member_list.append((member_age, member_name))
# _는 아무 값이나 상관 없다는 뜻.
# 반복만 member_num 만큼 해준다.
member_list.sort(key = lambda member: (member[0]))

for member in member_list:
    print(member[0], member[1])