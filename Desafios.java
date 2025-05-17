import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}

class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }
}

class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}

class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média: %.2f%n", media);
    }
}

class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);
    }
}

class MaiorDeDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}

class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("Área do triângulo: %.2f%n", area);
    }
}

class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }
    }
}

class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
}

class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();

        System.out.println("String invertida: " + invertida);
    }
}

class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}

class ContarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int digitos = String.valueOf(Math.abs(num)).length();

        System.out.println("Número de dígitos: " + digitos);
    }
}

class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}

class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}

class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

class MinutosParaHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de minutos: ");
        int totalMin = sc.nextInt();

        int horas = totalMin / 60;
        int minutos = totalMin % 60;

        System.out.println(horas + " hora(s) e " + minutos + " minuto(s)");
    }
}

class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}

class TrocaVariaveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();

        System.out.print("Valor de B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Após a troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

class Soma1aN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma de 1 a " + n + ": " + soma);
    }
}
