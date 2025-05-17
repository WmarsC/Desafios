import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

class Ex42 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 9, 4, 7, 1, 6, 3, 0};
        int soma = 0;

        for (int num : array) {
            soma += num;
        }

        System.out.println("Soma: " + soma);
    }
}

class Ex43 {
    public static void main(String[] args) {
        int[] array = {12, 5, 9, 21, 3, 17};
        int maior = array[0];
        int menor = array[0];

        for (int num : array) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}

import java.util.Arrays;

class Ex44 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Array invertido: " + Arrays.toString(array));
    }
}

class Ex45 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean iguais = Arrays.equals(a, b);

        System.out.println("Arrays são iguais? " + iguais);
    }
}

class Ex46 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] resultado = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] * b[i];
        }

        System.out.println("Resultado da multiplicação: " + Arrays.toString(resultado));
    }
}

import java.util.*;

class Ex47 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : array) {
            set.add(num);
        }

        System.out.println("Sem duplicatas: " + set);
    }
}

class Ex48 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int[][] soma = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Soma das matrizes:");
        for (int[] linha : soma) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Ex49 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };
        int[][] b = {
            {2, 0},
            {1, 2}
        };
        int[][] resultado = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matriz multiplicada:");
        for (int[] linha : resultado) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Ex50 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean simetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        System.out.println("Matriz é simétrica? " + simetrica);
    }
}

class Ex51 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean identidade = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
        }

        System.out.println("É matriz identidade? " + identidade);
    }
}

class Ex52 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int busca = 30;
        boolean encontrado = false;

        for (int num : array) {
            if (num == busca) {
                encontrado = true;
                break;
            }
        }

        System.out.println("Elemento encontrado? " + encontrado);
    }
}

class Ex53 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matriz.length;
        int[][] rotacionada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }

        System.out.println("Matriz rotacionada 90°:");
        for (int[] linha : rotacionada) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Ex54 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int valor = 2;
        int contagem = 0;

        for (int num : array) {
            if (num == valor) {
                contagem++;
            }
        }

        System.out.println(valor + " aparece " + contagem + " vezes.");
    }
}

class Ex55 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int val : matriz[i]) {
                soma += val;
            }
            double media = (double) soma / matriz[i].length;
            System.out.println("Média da linha " + i + ": " + media);
        }
    }
}
