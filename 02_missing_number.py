def main():
    n = int(input())
    nums = list(map(int, input().split()))
    nums.sort()
    flag = True
    for i in range(n - 1):
        if nums[i] != i + 1:
            print(i + 1)
            flag = False
            break
    if flag:
        print(n)
    
if __name__ == '__main__':
    main()