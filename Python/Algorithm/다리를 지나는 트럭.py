from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    truck_in_bridge = []
    truck_in_bridge = deque(truck_in_bridge)
    truck_weight_in_bridge = 0
    time = 0
    passd_truck = 0

    while True:
        time += 1
        if truck_weights:
            if weight >= truck_weights[0] + truck_weight_in_bridge and bridge_length > len(truck_in_bridge):
                # 다리의 허용 무게 >= 대기중인 트럭 무게 + 다리위에 있는 트럭 무게
                # and 다리 길이 > 트럭(길이 1) 개수
                truck_in_bridge.append([truck_weights[0], time]) # 트럭 개수 + 1
                truck_weight_in_bridge += int(truck_weights.pop(0)) # + 트럭 무게
                for truck in truck_in_bridge:
                    truck[1] = time

            else:
                for truck in truck_in_bridge:
                    truck[1] = time
        else:
            for truck in truck_in_bridge:
                    truck[1] = time
            break
            
    print(truck_in_bridge)
        
    return answer


solution(2, 10, [7, 4, 5, 6])
solution(100, 100, [10])
solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10])