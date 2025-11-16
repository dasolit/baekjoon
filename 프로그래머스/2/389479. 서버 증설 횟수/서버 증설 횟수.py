def solution(players, m, k):
    T = len(players)
    expire = [0] * (T + k + 1)
    active = 0
    answer = 0

    for t in range(T):
        active -= expire[t]

        required = players[t] // m

        if active < required:
            add = required - active
            active += add
            answer += add
            expire[t + k] += add  

    return answer