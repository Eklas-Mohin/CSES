def main():
    st = input()
    ln = len(st)
    cnt = mx = 1
    for i in range(ln - 1):
        if st[i] == st[i + 1]:
            cnt += 1
            mx = max(mx, cnt)
        else:
            cnt = 1
    print(mx)
    
if __name__ == '__main__':
    main()