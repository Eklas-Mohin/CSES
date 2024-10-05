''' author: mohin 
    problem: sum of series(1 + 2 + ... + n) 
'''

def main():
    n = int(input())
    nums = list(map(int, input().split()))
    
    sum_n = n * (n + 1) // 2
    x = sum(nums)
    
    print(sum_n - x)
    
if __name__ == '__main__':
    main()