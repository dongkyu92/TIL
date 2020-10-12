# BFS(너비 우선 탐색, Breath First Search)

<img src="/Users/dkmac/Library/Application Support/typora-user-images/스크린샷 2020-10-12 오전 10.44.38.png" alt="스크린샷 2020-10-12 오전 10.44.38" style="zoom:25%;" />

1. BFS는 한 단계씩 나아가면서 해당 노드와 같은 레벨에 있는 노드들(즉, 형제 노드들)을 먼저 순회하는 방식이다. 이러한 방식을 너비 우선 탐색이라고 한다.
2. A - B - C - H - D - I - J - M - E - G - K - F - L

# DFS(깊이 우선 탐색, Depth First Search)

1. DFS는 한 노드의 자식을 타고 끝까지 순회한 다음에, 다시 돌아와서 다른 형제의 자식을 타고 내려가며 순회하는 방식이다.
2. A - B- C - D - E - F - G - H - I - J - K - L - M



# 파이썬에서 구현 방법(딕셔너리)

```python
graph = {
    'A': ['B'],
    'B': ['A', 'C', 'H'],
    'C': ['B', 'D'],
    'D': ['C', 'E', 'G'],
    'E': ['D', 'F'],
    'F': ['E'],
    'G': ['D'],
    'H': ['B', 'I', 'J', 'M'],
    'I': ['H'],
    'J': ['H', 'K'],
    'K': ['J', 'L'],
    'L': ['K'],
    'M': ['H']
}
```

## BFS

```python
def bfs(graph, start_node):
     visit = list()
     queue = list()
      # 방문했던 노드 목록을 차례대로 저장할 리스트와, 다음으로 방문할 노드의 목록을
      # 차례대로 저장할 리스트(큐)를 만듬.
      
     queue.append(start_node)
			# 시작 노드를 큐에 넣음.
  
     while queue:
     # 큐의 목록이 바닥날때까지(더 이상 방문할 노드가 없을 때까지) loop를 돌린다.
    
         node = queue.pop(0)
      	 # 큐의 맨 앞에 있는 노드를 꺼내온다.
        
         if node not in visit:
         # 해당 노드가 아직 방문 리스트에 없다면,
             visit.append(node)
          	 # 방문 리스트에 추가
             queue.extend(graph[node])
             # 해당 노드의 자식 노드들을 큐에 추가해준다.

     return visit
```

## DFS

```python
 def dfs(graph, start_node):
     visit = list()
     stack = list()

     stack.append(start_node)

     while stack:
         node = stack.pop()
         if node not in visit:
             visit.append(node)
             stack.extend(graph[node])

     return visit
```

- ###### Queue 변수명이 stack으로 바뀌었고, `node = stack.pop()` 부분에서 `pop(0)` 부분이 pop()으로 바뀌었다.

- ###### 리스트에서 pop()을 하게되면 맨 마지막에 넣었던 아이템을 가져오게 되므로 stack과 동일하게 동작하게 된다.

- ###### 반대로 pop(0)을 하게되면 맨 앞에 있는 요소를 가져오므로 queue와 동일하게 동작했던 것.

