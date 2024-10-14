# Number Spiral

def main():
    t = int(input())
    
    for _ in range(t):
        x, y = map(int, input().split())
        
        if y % 2 == 1 and y >= x:
            print(y * y - x + 1)
        elif x % 2 == 1 and x > y:
            print((x - 1) * (x - 1)  + y)
        elif x % 2 == 0 and x >= y:
            print(x * x - y + 1)
        else:
            print((y - 1) * (y - 1)  + x)

if __name__ == '__main__':
    main()
