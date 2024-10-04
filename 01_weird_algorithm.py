def main():
    n = int(input())
    ans = ''
    while True:
        ans += str(n) + ' '
        if n == 1:
            break
        if n % 2 == 0:
            n //= 2
        else:
            n = (3 * n) + 1
    print(ans)
    
if __name__ == '__main__':
    main()