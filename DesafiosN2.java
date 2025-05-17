import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean valido = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }
    }
}

import java.util.Scanner;

class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);
    }
}

class Ex23 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares de 1 a 100: " + contador);
    }
}

import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}

import java.util.Scanner;

class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar Data");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    System.out.println("Hoje é um ótimo dia para programar!");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}

import java.util.Scanner;
import java.util.Random;

class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1; // de 1 a 100
        int tentativa, tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100!");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = sc.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s)!");
            }

        } while (tentativa != numeroSecreto);
    }
}

import java.util.Scanner;

class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int n = sc.nextInt();

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}

import java.util.Scanner;

class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        while (true) {
            System.out.print("Digite uma nota (-1 para encerrar): ");
            double nota = sc.nextDouble();

            if (nota == -1) break;

            soma += nota;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }
    }
}

import java.util.Scanner;

class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura da pirâmide: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;

class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = sc.nextInt();

        String binario = Integer.toBinaryString(decimal);

        System.out.println("Representação binária: " + binario);
    }
}

import java.util.Scanner;

class Ex31 {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("MDC: " + mdc(x, y));
    }
}

import java.util.Scanner;

class Ex32 {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("MMC: " + mmc(x, y));
    }
}

import java.util.Scanner;

class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do lado do quadrado: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário mensal: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Valor da parcela: R$ ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.3) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo negado. Parcela excede 30% da renda.");
        }
    }
}

import java.util.Scanner;

class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Ordenação simples (Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("Ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}

import java.util.Scanner;

class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor para saque (múltiplo de 10): R$ ");
        int valor = sc.nextInt();

        if (valor % 10 != 0) {
            System.out.println("Valor inválido. Digite múltiplos de 10.");
            return;
        }

        int[] cedulas = {100, 50, 20, 10};
        for (int cedula : cedulas) {
            int qtd = valor / cedula;
            valor %= cedula;
            if (qtd > 0) {
                System.out.println(qtd + " nota(s) de R$ " + cedula);
            }
        }
    }
}

import java.util.Scanner;

class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        boolean temMaiuscula = false, temMinuscula = false, temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
        }

        if (senha.length() >= 8 && temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca! Use pelo menos 8 caracteres, com letra maiúscula, minúscula e número.");
        }
    }
}

import java.util.Scanner;

class Ex38 {
    public static boolean valida(String s) {
        int contador = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') contador++;
            else if (c == ')') contador--;

            if (contador < 0) return false;
        }
        return contador == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sequência de parênteses: ");
        String seq = sc.nextLine();

        if (valida(seq)) {
            System.out.println("Sequência válida.");
        } else {
            System.out.println("Sequência inválida.");
        }
    }
}

import java.util.Scanner;

class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Velocidade média (km/h): ");
        double velocidade = sc.nextDouble();

        double tempo = distancia / velocidade;

        int horas = (int) tempo;
        int minutos = (int) ((tempo - horas) * 60);

        System.out.println("Tempo estimado de viagem: " + horas + "h " + minutos + "min.");
    }
}

import java.util.Scanner;

class Ex40 {
    enum Cor {VERDE, AMARELO, VERMELHO}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cor do semáforo (VERDE, AMARELO, VERMELHO): ");
        String entrada = sc.nextLine().toUpperCase();

        try {
            Cor cor = Cor.valueOf(entrada);

            switch (cor) {
                case VERDE:
                    System.out.println("Siga.");
                    break;
                case AMARELO:
                    System.out.println("Atenção.");
                    break;
                case VERMELHO:
                    System.out.println("Pare.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Cor inválida.");
        }
    }
}
