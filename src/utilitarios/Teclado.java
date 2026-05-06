package temadogrupo.utilitarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * SOLID S: esta classe centraliza a entrada de dados da aplicacao.
 * Java 25: usa IO.readln por baixo.
 * A versao generica com Class<T> foi removida para manter o codigo simples.
 */

public final class Teclado {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Teclado() {
    }

    public static String readLine() {
        return readLine("");
    }

    public static String readLine(String mensagem) {
        String entrada = IO.readln(mensagem);
        return normalizarEntrada(entrada);
    }

    public static String readString() {
        return readString("");
    }

    public static String readString(String mensagem) {
        while (true) {
            String entrada = readLine(mensagem);

            if (!entrada.isEmpty()) {
                return entrada;
            }

            Video.mensagemAlerta("Entrada vazia. Digite novamente.");
        }
    }

    public static Integer readInteger() {
        return readInteger("");
    }

    public static Integer readInteger(String mensagem) {
        while (true) {
            String entrada = readLine(mensagem);

            try {
                return Integer.valueOf(entrada);
            } catch (NumberFormatException excecao) {
                Video.mensagemErro("Entrada invalida. Digite um numero inteiro.");
            }
        }
    }

    public static Double readDouble() {
        return readDouble("");
    }

    public static Double readDouble(String mensagem) {
        while (true) {
            String entrada = readLine(mensagem);
            entrada = entrada.replace(',', '.');

            try {
                return Double.valueOf(entrada);
            } catch (NumberFormatException excecao) {
                Video.mensagemErro("Entrada invalida. Digite um numero decimal.");
            }
        }
    }

    public static LocalDate readLocalDate() {
        return readLocalDate("");
    }

    public static LocalDate readLocalDate(String mensagem) {
        while (true) {
            String entrada = readLine(mensagem);

            try {
                return LocalDate.parse(entrada, FORMATO_DATA);
            } catch (DateTimeParseException excecao) {
                Video.mensagemErro("Data invalida. Use o formato dd/MM/yyyy.");
            }
        }
    }

    public static int readInt() {
        return readInteger().intValue();
    }

    public static int readInt(String mensagem) {
        return readInteger(mensagem).intValue();
    }

    public static int solicitarInt() {
        return readInt();
    }

    public static int solicitarInt(String mensagem) {
        return readInt(mensagem);
    }

    public static String solicitarString() {
        return readString();
    }

    public static String solicitarString(String mensagem) {
        return readString(mensagem);
    }

    public static double solicitarDouble() {
        return readDouble().doubleValue();
    }

    public static double solicitarDouble(String mensagem) {
        return readDouble(mensagem).doubleValue();
    }

    private static String normalizarEntrada(String entrada) {
        if (entrada == null) {
            return "";
        }

        return entrada.trim();
    }
}
