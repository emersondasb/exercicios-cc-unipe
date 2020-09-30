def hanoi(n, orig, dest, aux):
    if n == 1:
        print('1 -> {}'.format(n))
    else:
        hanoi(n - 1, orig, aux, dest)
        print('{} -> {}'.format(n, dest))
        hanoi(n - 1, aux, dest, orig)


def main():
    while True:
        n = int(input('Número de discos: '))
        hanoi(n, 'A', 'B', 'C')


main()
