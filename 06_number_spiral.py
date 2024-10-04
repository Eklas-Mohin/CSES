def main():
    t = int(input())
    while t:
        m = list(map(int, input().split()))
        x = m[0]
        y = m[1]
        if y % 2 == 1 and y >= x:
            print(y * y - x + 1)
        elif x % 2 == 1 and x > y:
            print((x - 1) * (x - 1)  + y)
        elif x % 2 == 0 and x >= y:
            print(x * x - y + 1)
        else:
            print((y - 1) * (y - 1)  + x)
        t = t - 1
    
if __name__ == '__main__':
    main()