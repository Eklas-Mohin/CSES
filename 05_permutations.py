def main():
    n = int(input())
    ans = ''
    if n > 1 and n < 4:
        print('NO SOLUTION')
    else:
        for i in range(2, n + 1, 2):
            ans += str(i) + ' '
        for i in range(1, n + 1, 2):
            ans += str(i) + ' '
    print(ans)
    
if __name__ == '__main__':
    main()