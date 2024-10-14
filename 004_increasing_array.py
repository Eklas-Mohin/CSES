# problem: minimum moves to make a list non-decreasing

def main():
    n = int(input())
    lst = list(map(int, input().split()))
    min_moves = 0
    
    for i in range(1, n):
        if lst[i] < lst[i - 1]:
            min_moves = min_moves + lst[i - 1] - lst[i]
            lst[i] = lst[i - 1]
    
    print(min_moves)
    
if __name__ == '__main__':
    main()
