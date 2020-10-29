def solution(m, n, board):
    # m: 판의 높이
    # n: 판의 폭
    # board: 판의 배치 정보
    board = [ list(x) for x in board ]
    matched = True
    while matched:
        # 1) 일치 여부 판별
        matched = []
        for i in range(m - 1):
            for j in range(n - 1):
                if board[i][j] == \
                    board[i][j + 1] == \
                    board[i + 1][j] == \
                    board[i + 1][j + 1] != '#': # 이미 처리한 놈 제외.
                        matched.append([i, j])
        
        # 2) 일치한 위치 삭제
        for i, j in matched:
            i = int(i)
            j = int(j)
            board[i][j] = board[i][j + 1] = board[i + 1][j + 1] = board[i + 1][j] = '#'
            # TypeError: 'str' object does not support item assignment : 인덱스를 통한 접근 권한이 없다는 뜻.
            # 따라서 맨 위에 board를 따로 초기화 해줘야 함.

        # 3) 빈공간 블럭 처리
        for _ in range(m): # 판의 높이 만큼 반복
            for i in range(m - 1): # 판의 x인덱스 [i + 1] 부터 조사하므로, m - 1
                for j in range(n): # 판의 y인덱스
                    if board[i + 1][j] == '#':
                        board[i + 1][j], board[i][j] = board[i][j], '#' # 아래는 위 인덱스로 채우고 위 인덱스는 #으로 바꿈
    return sum(x.count('#') for x in board) # 보드 전체에서 x의 개수 count

print(solution(4, 5, ["CCBDE", "AAADE", "AAABF", "CCBBF"]))
print(solution(6, 6, ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]))