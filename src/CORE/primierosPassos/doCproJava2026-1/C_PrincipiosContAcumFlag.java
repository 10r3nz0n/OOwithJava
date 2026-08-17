/**
 * Programa com o seguinte objetivo:
 * - Apresentar princípios básicos de programação (variáveis, operadores,
 * fluxo).
 * - Refrescar lógica com incremento/decremento e acumuladores.
 * - Mostrar uso de operadores compostos e booleanos.
 *
 * Autor: Professor Lorenzon
 */

void main() {

        // Contador: exemplo clássico de variável de controle
        int contador = 0;

        // Acumulador: variável que soma progressivamente valores
        double acumulador = 0;

        // Flag (sentinela): variável booleana para controle de fluxo
        boolean flag = false; // valor padrão já é false, mas é importante declarar

        IO.println("\nValor inicial de declaração do contador: " + contador);
        IO.println("Valor modificado primeira vez: " + contador++); // usa e depois...
        IO.println("Valor modificado segunda vez: " + ++contador); // incrementa antes

        // Agora contador = 2
        --contador; // vira 1
        contador--; // vira 0

        IO.println("\nValor inicial retornado do contador: " + contador);

        // Acumulador: somas progressivas
        IO.println("\nAcumulador inicial: " + acumulador);
        acumulador = acumulador + 10; // forma tradicional
        IO.println("Após acumulador = acumulador + 10: " + acumulador);
        acumulador += 100; // forma simplificada com operador composto
        IO.println("Após acumulador += 100: " + acumulador);

        // Inversão de booleano (sentinela)
        IO.println("\nValor inicial da flag: " + flag);
        flag = !flag; // inverte valor lógico (false → true)
        IO.println("Valor da flag após inversão (!flag): " + flag);

}