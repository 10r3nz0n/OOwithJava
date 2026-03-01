#ifndef FUNCOES_H
#define FUNCOES_H

int solicitarOpcaoMedia(void);

int validarNotas(double nota1, double nota2, double nota3);

double calcularMediaAritmetica(double nota1, double nota2, double nota3);
double calcularMediaPonderada(double nota1, double nota2, double nota3, int peso1, int peso2, int peso3);

void exibirResultados(double media, double mediaAprovacao);

#endif