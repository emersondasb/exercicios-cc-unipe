import time


def fibonacci(n):

    n1 = 0
    n2 = 1

    print('{}'.format(n1), end=' ')
    print('{}'.format(n2), end=' ')

    contador = 3  # começa em 3 pois os dois primeiros elementos já foram impressos

    while contador <= n:
        n3 = n1 + n2
        print('{}'.format(n3), end=' ')
        n1 = n2
        n2 = n3
        contador += 1


def main():
    while True:
        print('\n' + '='*60)
        n = int(input('Quantos elementos da série de Fibonacci deseja imprimir? '))

        t_inicio = time.time()

        fibonacci(n)

        t_fim = time.time()

        t_total = t_fim - t_inicio
        print('\nTempo de execução (em segundos): {}'.format(t_total))


main()
