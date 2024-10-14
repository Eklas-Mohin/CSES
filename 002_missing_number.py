# 1 + 2 + 3 + .... + n = n * (n + 1) / 2

def main():
    n = int(input())
    nums = list(map(int, input().split()))
    
    x = sum(nums)
    sum_n = n * (n + 1) // 2
    
    print(sum_n - x)
    
if __name__ == '__main__':
    main()