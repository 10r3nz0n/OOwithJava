package utilitarios;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Teclado {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static int solicitarInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public static int solicitarInt(String mensagem) {
        System.out.print(mensagem + " ");
        return solicitarInt();
    }

    public static int integer() {
        return solicitarInt();
    }

    public static int integer(String mensagem) {
        return solicitarInt(mensagem);
    }

    public static String solicitarString() {
        while (true) {
            String valor = scanner.nextLine().trim();
            if (!valor.isEmpty())
                return valor;
            System.out.println("Entrada vazia ou correção de buffer limpado! Digite novamente.");
        }
    }

    public static String solicitarString(String mensagem) {
        System.out.print(mensagem + " ");
        return solicitarString();
    }

    public static String string(String mensagem) {
        return solicitarString(mensagem);
    }

    public static String string() {
        return solicitarString();
    }

    public static double solicitarDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número decimal.");
                scanner.nextLine(); // limpa buffer
            }
        }
    }

    public static double solicitarDouble(String mensagem) {
        System.out.print(mensagem + " ");
        return solicitarDouble();
    }

    public static double decimal(String mensagem) {
        return solicitarDouble(mensagem);
    }

    public static double decimal() {
        return solicitarDouble();
    }

    public static LocalDate solicitarData() {

        // ou trocar DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            String entrada = solicitarString();
            try {
                return LocalDate.parse(entrada, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato : " + DATE_FORMAT);
            }
        }
    }

    public static LocalDate solicitarData(String mensagem) {
        System.out.print(mensagem + " ");
        return solicitarData();
    }

    // Area 2.0, por Diego Kuhn - OO Java 2025-2 CC Unochapecó

    /*
     * Exemplos:
     * String nome = Teclado.solicitar("Nome:", String.class);
     * Integer idade = Teclado.solicitar("Idade:", Integer.class);
     * Double salario = Teclado.solicitar("Salario:", Double.class);
     */

    // Sobrecarga incluída por Lorenzon 20261
    public static <T> T solicitar(String mensagem, Class<T> tipo) {
        System.out.print(mensagem + " ");
        return solicitar(tipo);
    }

    public static <T> T solicitar(Class<T> tipo) {
        while (true) {
            // System.out.print(mensagem + " "); Lorenzon 20261
            String entrada = scanner.nextLine().trim();

            try {
                if (tipo == String.class) {
                    if (entrada.isEmpty()) {
                        throw new IllegalArgumentException("Entrada vazia! Digite novamente.");
                    }
                    return tipo.cast(entrada);
                }

                // Tratamento especial para LocalDate
                if (tipo == LocalDate.class) {
                    return tipo.cast(LocalDate.parse(entrada, DATE_FORMAT));
                }

                // Tenta encontrar método de conversão estático, como parseInt, valueOf, etc.
                Method parseMethod = encontrarMetodoConversao(tipo);
                if (parseMethod != null) {
                    Object valorConvertido = parseMethod.invoke(null, entrada);
                    return tipo.cast(valorConvertido);
                }

                throw new IllegalArgumentException("Tipo não suportado: " + tipo.getSimpleName());

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Esperado um valor do tipo " + tipo.getSimpleName() + ".");
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato " + DATE_FORMAT);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro ao converter valor: " + e.getMessage());
            }
        }
    }

    private static Method encontrarMetodoConversao(Class<?> tipo) {
        try {
            return tipo.getMethod("valueOf", String.class);
        } catch (NoSuchMethodException e) {
            try {
                return tipo.getMethod("parse" + tipo.getSimpleName(), String.class);
            } catch (NoSuchMethodException ex) {
                return null;
            }
        }
    }
}