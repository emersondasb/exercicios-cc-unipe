/* Apresentar as potências de 3, variando de O a 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. 
Deverá ser apresentado, observando a seguinte formatação: 
3 elevado a 0 = 1 
3 elevado a 1  = 3 
3 elevado a 2 = 9 
(...)
3 elevado a 15 = 14348907 */

#include <stdio.h>
#include <math.h>

int main() {
    int base = 3, expoente;
    
    for(expoente = 0; expoente < 16; expoente++) {
        printf("\n%d^%d = %.0f", base, expoente, pow(base, expoente));
    }
}
