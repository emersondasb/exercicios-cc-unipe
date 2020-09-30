import time


def fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)


def main():
    while True:
        print('\n' + '='*60)
        n = int(input('Quantos elementos da série de Fibonacci deseja imprimir? '))

        t_inicio = time.time()

        for i in range(1, n + 1):
            print(fibonacci(i), end=' ')

        t_fim = time.time()

        t_total = t_fim - t_inicio
        print('\nTempo de execução (em segundos): {}'.format(t_total))


main()
