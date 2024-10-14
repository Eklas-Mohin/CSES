# maximum repetitions of consecutive characters

def main():
    st = input()
    mx = cnt = 1
    
    for i in range(1, len(st)):
        if st[i] == st[i - 1]:
            cnt += 1
            mx = max(mx, cnt)
        else:
            cnt = 1
    
    print(mx)
    
if __name__ == '__main__':
    main()
    