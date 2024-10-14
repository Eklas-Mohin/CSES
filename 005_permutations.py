# abs(list[i] - list[i - 1]) > 1

def main():
    n = int(input())
    permutation = []
    
    if n > 1 and n < 4:
        print('NO SOLUTION')
    else:
        for i in range(2, n + 1, 2):
            permutation.append(str(i))
            
        for i in range(1, n + 1, 2):
            permutation.append(str(i))
            
    print(' '.join(permutation))
    
if __name__ == '__main__':
    main()