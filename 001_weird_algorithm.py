# Collatz Conjecture 
# The 3 * n + 1 problem

def main():
    n = int(input())
    sequence = []

    # Generate the Collatz sequence
    while True:
        sequence.append(str(n))
        if n == 1:
            break
        if n % 2 == 0:
            n //= 2
        else:
            n = 3 * n + 1

    print(' '.join(sequence))

if __name__ == '__main__':
    main()
