# def solution(board, moves):
#     answer = 0
#     newBoard = []
#     cart = []
    
#     for i in range(0, len(board)):
#         boardList = []
#         for k in board:
#             boardList.append(k[i])
#         newBoard.append(boardList)
#         boardList = []
    
#     for i in moves:
#         for index, j in enumerate(newBoard[i - 1]):
#             if j != 0:
#                 cart.append(j)
#                 newBoard[i - 1][index] = 0
#                 break

#     flag = True
#     while flag == True:
#         for i, c in enumerate(cart):
#             if cart[i] == cart[i - 1]:
#                 answer += 2
#                 cart.remove(c)
#                 cart.remove(cart[i - 1])
#                 if i == len(cart) - 1:
#                   flag = False           

#     return answer
# ---------------------------------------------------------------------------------------------------------
def solution(board, moves):
    answer = 0
    cart = [0] # 인덱스 에러 방지
    for move in moves:
        for i, b in enumerate(board):
            if b[move - 1] != 0:
                cart.append(b[move - 1])
                # 다른 사람 풀이는 cart에 넣어주면서 비교를 하기 때문에 실행속도가 훨씬 줄어듦.
                if cart[-1] == cart[-2]:
                    answer += 2
                    cart.pop(-1) # 2개 인형 같으면 인형 삭제.
                    cart.pop(-1) # 위의 인덱스 에러 방지로 첫 루프에도 인덱스 에러 안남.
                board[i][move - 1] = 0
                break
    return answer


board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves = [1,5,3,5,1,2,1,4]
solution(board, moves)