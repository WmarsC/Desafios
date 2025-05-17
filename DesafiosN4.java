public class Pessoa_Ex61 {
        String nome;
        int idade;

        public Pessoa_Ex61(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }

    public static void main(String[] args) {
        Pessoa_Ex61 p1 = new Pessoa_Ex61("Maria", 30);
        p1.exibirDados();
    }
}

class Pessoa_Ex62 {
    String nome;
    int idade;

    public Pessoa_Ex62(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void falar(String frase) {
        System.out.println(nome + " diz: " + frase);
    }

    public void aniversario() {
        idade++;
        System.out.println(nome + " fez aniversário! Nova idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa_Ex62 p1 = new Pessoa_Ex62("João", 25);
        p1.exibirDados();
        p1.falar("Olá!");
        p1.aniversario();
    }
}

class ContaBancaria_Ex63 {
    private String titular;
    private double saldo;

    public ContaBancaria_Ex63(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }
    public static void main(String[] args) {
        ContaBancaria_Ex63 conta = new ContaBancaria_Ex63("Carlos", 1000.0);
        conta.exibirSaldo();
        conta.depositar(200);
        conta.sacar(150);
        conta.sacar(1200); // Teste com valor maior que o saldo
        conta.exibirSaldo();
    }
}

class ContaBancaria_Ex64 {
    private String titular;
    private double saldo;

    public ContaBancaria_Ex64(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter e Setter para titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para saldo (sem setter para evitar alteração direta)
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }
    public static void main(String[] args) {
        ContaBancaria_Ex64 conta = new ContaBancaria_Ex64("Ana", 500);
        conta.exibirSaldo();

        conta.setTitular("Luigi Okano");
        System.out.println("Novo titular: " + conta.getTitular());

        conta.depositar(250);
        conta.sacar(100);
        System.out.printf("Saldo final: R$%.2f\n", conta.getSaldo());
    }
}

class Animal_Ex65 {
    protected String nome;

    public Animal_Ex65(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }
}
class Cachorro extends Animal_Ex65 {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au au!");
    }
}
class Gato extends Animal_Ex65 {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " mia: Miau!");
    }
    public static void main(String[] args) {
        Animal_Ex65 a1 = new Animal_Ex65("Bicho");
        a1.emitirSom();

        Cachorro c1 = new Cachorro("Rex");
        c1.emitirSom();

        Gato g1 = new Gato("Mimi");
        g1.emitirSom();
    }
}

class Animal_Ex66 {
    protected String nome;

    public Animal_Ex66(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som genérico.");
    }

    public void mover() {
        System.out.println(nome + " está se movendo...");
    }
}
class Cachorro extends Animal_Ex66 {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " corre feliz com o rabo abanando!");
    }
}
class Gato extends Animal_Ex66 {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " mia: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " caminha com elegância.");
    }
    public static void main(String[] args) {
        Animal_Ex66[] animais = {
                new Cachorro("Bob"),
                new Gato("Luna"),
                new Animal_Ex66("Criatura Genérica")
        };

        for (Animal_Ex66 a : animais) {
            a.emitirSom();
            a.mover();
            System.out.println();
        }
    }
}

interface OperacaoMatematica_Ex67 {
    double somar(double a, double b);
    double subtrair(double a, double b);
}
class CalculadoraSimples implements OperacaoMatematica_Ex67 {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        OperacaoMatematica_Ex67 calc = new CalculadoraSimples();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
    }
}

interface OperacaoMatematica_Ex68 {
    double somar(double a, double b);
    double subtrair(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b);
}
class Calculadora implements OperacaoMatematica_Ex68 {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        OperacaoMatematica_Ex68 calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 2));
        System.out.println("Subtração: " + calc.subtrair(10, 2));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 2));
        System.out.println("Divisão: " + calc.dividir(10, 2));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Produto_Ex69 {
    private int id;
    private String nome;
    private double preco;

    public Produto_Ex69(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("ID: " + id + " | Produto: " + nome + " | Preço: R$" + preco);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Produto_Ex69> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Produtos");

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o ID do produto: ");
            int id = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            Produto_Ex69 p = new Produto_Ex69(id, nome, preco);
            produtos.add(p);
            System.out.println("Produto cadastrado!\n");
        }

        System.out.println("Produtos cadastrados:");
        for (Produto_Ex69 p : produtos) {
            p.exibirInfo();
        }

        sc.close();
    }
}

import java.util.ArrayList;

class Produto_Ex70 {
    private int id;
    private String nome;
    private double preco;

    public Produto_Ex70(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco);
    }
}
class CarrinhoDeCompras {
    private ArrayList<Produto_Ex70> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto_Ex70 produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public void exibirCarrinho() {
        System.out.println("Produtos no carrinho:");
        for (Produto_Ex70 p : produtos) {
            p.exibirInfo();
        }
        System.out.printf("Total: R$%.2f\n", calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto_Ex70 p : produtos) {
            total += p.getPreco();
        }
        return total;
    }
    public static void main(String[] args) {
        Produto_Ex70 p1 = new Produto_Ex70(1, "Camisa", 49.90);
        Produto_Ex70 p2 = new Produto_Ex70(2, "Calça", 89.90);
        Produto_Ex70 p3 = new Produto_Ex70(3, "Tênis", 199.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.exibirCarrinho();
    }
}

class Funcionario_Ex71 {
    protected String nome;
    protected double salario;

    public Funcionario_Ex71(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário: R$%.2f\n", salario);
    }

    public double getSalario() {
        return salario;
    }
}
class Gerente extends Funcionario_Ex71 {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("Gerente: " + nome);
        System.out.printf("Salário base: R$%.2f\n", salario);
        System.out.printf("Bônus: R$%.2f\n", bonus);
        System.out.printf("Total: R$%.2f\n", salario + bonus);
    }

    public double getSalarioTotal() {
        return salario + bonus;
    }
    public static void main(String[] args) {
        Funcionario_Ex71 f = new Funcionario_Ex71("João", 3000);
        Gerente g = new Gerente("Maria", 5000, 1500);

        f.exibirDados();
        System.out.println();
        g.exibirDados();
    }
}

class Ex72_Complemento71 {
    public static void main(String[] args) {
        Funcionario_Ex71 f1 = new Funcionario_Ex71("Carlos", 2800);
        Funcionario_Ex71 f2 = new Gerente("Ana", 6000, 2000); // polimorfismo

        Funcionario_Ex71[] funcionarios = { f1, f2 };

        for (Funcionario_Ex71 f : funcionarios) {
            f.exibirDados(); // método chamado de acordo com o tipo real do objeto
            System.out.println();
        }
    }
}

class CalculadoraUtil_Ex73 {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double media(double[] valores) {
        if (valores.length == 0) return 0;
        double soma = 0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.length;
    }
    public static void main(String[] args) {
        double resultadoSoma = CalculadoraUtil_Ex73.somar(10, 5);
        double resultadoSubtracao = CalculadoraUtil_Ex73.subtrair(10, 5);
        double[] numeros = { 7.5, 8.0, 9.0 };

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Média: " + CalculadoraUtil_Ex73.media(numeros));
    }
}

enum DiaSemana_Ex74 {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
class DiaSemanaComplemento {
    public static void main(String[] args) {
        DiaSemana_Ex74 hoje = DiaSemana_Ex74.SEXTA;

        switch (hoje) {
            case SEGUNDA:
                System.out.println("Início da semana.");
                break;
            case SEXTA:
                System.out.println("Sextou!");
                break;
            case DOMINGO:
                System.out.println("Dia de descanso.");
                break;
            default:
                System.out.println("Mais um dia útil.");
        }

        // Listar todos os dias
        System.out.println("\nTodos os dias da semana:");
        for (DiaSemana_Ex74 dia : DiaSemana_Ex74.values()) {
            System.out.println(dia);
        }
    }
}

class Aluno_Ex75 {
    private String nome;
    private double[] notas;

    public Aluno_Ex75(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f\n", calcularMedia());
        System.out.println(estaAprovado() ? "Situação: Aprovado" : "Situação: Reprovado");
    }
    public static void main(String[] args) {
        double[] notasJoao = { 8.0, 6.5, 7.5 };
        Aluno_Ex75 joao = new Aluno_Ex75("João", notasJoao);

        double[] notasAna = { 5.0, 4.5, 6.0 };
        Aluno_Ex75 ana = new Aluno_Ex75("Ana", notasAna);

        joao.exibirBoletim();
        System.out.println();
        ana.exibirBoletim();
    }
}

import java.util.ArrayList;
class Ex76Continuacao75 {
    public static void main(String[] args) {
        ArrayList<Aluno_Ex75> alunos = new ArrayList<>();

        alunos.add(new Aluno_Ex75("João", new double[]{8.0, 6.5, 7.5}));
        alunos.add(new Aluno_Ex75("Ana", new double[]{5.0, 4.5, 6.0}));
        alunos.add(new Aluno_Ex75("Pedro", new double[]{9.0, 8.5, 10.0}));

        System.out.println("Boletim Escolar:");
        for (Aluno_Ex75 aluno : alunos) {
            aluno.exibirBoletim();
            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Aluno_Ex77 {
    private String nome;
    private double[] notas;

    public Aluno_Ex77(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f\n", calcularMedia());
    }
}
class ComparadorPorNome implements Comparator<Aluno_Ex77> {
    @Override
    public int compare(Aluno_Ex77 a1, Aluno_Ex77 a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}
class ComparadorPorMedia implements Comparator<Aluno_Ex77> {
    @Override
    public int compare(Aluno_Ex77 a1, Aluno_Ex77 a2) {
        return Double.compare(a2.calcularMedia(), a1.calcularMedia()); // ordem decrescente
    }
    public static void main(String[] args) {
        ArrayList<Aluno_Ex77> alunos = new ArrayList<>();
        alunos.add(new Aluno_Ex77("Carlos", new double[]{6.5, 7.0, 8.0}));
        alunos.add(new Aluno_Ex77("Amanda", new double[]{9.0, 8.5, 9.5}));
        alunos.add(new Aluno_Ex77("Bruno", new double[]{5.0, 6.0, 6.5}));

        System.out.println("Ordenado por nome:");
        Collections.sort(alunos, new ComparadorPorNome());
        for (Aluno_Ex77 aluno : alunos) aluno.exibirBoletim();

        System.out.println("\nOrdenado por média:");
        Collections.sort(alunos, new ComparadorPorMedia());
        for (Aluno_Ex77 aluno : alunos) aluno.exibirBoletim();
    }
}

import java.util.*;

class Aluno_Ex78 {
    private String nome;
    private double[] notas;

    public Aluno_Ex78(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setNotas(double[] novasNotas) {
        this.notas = novasNotas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) soma += nota;
        return soma / notas.length;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Média: " + String.format("%.2f", calcularMedia());
    }
}
class SistemaAlunos {
    private static ArrayList<Aluno_Ex78> alunos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> adicionarAluno();
                case 2 -> listarAlunos();
                case 3 -> atualizarAluno();
                case 4 -> removerAluno();
            }
        } while (opcao != 0);
    }

    private static void adicionarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        alunos.add(new Aluno_Ex78(nome, notas));
        System.out.println("Aluno adicionado!");
    }

    private static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println(i + " - " + alunos.get(i));
            }
        }
    }

    private static void atualizarAluno() {
        listarAlunos();
        System.out.print("Digite o índice do aluno que deseja atualizar: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index < alunos.size()) {
            System.out.print("Novo nome: ");
            String novoNome = sc.nextLine();

            double[] novasNotas = new double[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Nova nota " + (i + 1) + ": ");
                novasNotas[i] = sc.nextDouble();
            }

            alunos.get(index).setNome(novoNome);
            alunos.get(index).setNotas(novasNotas);

            System.out.println("Aluno atualizado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void removerAluno() {
        listarAlunos();
        System.out.print("Digite o índice do aluno que deseja remover: ");
        int index = sc.nextInt();
        if (index >= 0 && index < alunos.size()) {
            alunos.remove(index);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

import java.util.Arrays;
import java.util.Objects;

class Aluno_Ex79 {
    private String nome;
    private double[] notas;

    public Aluno_Ex79(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) soma += nota;
        return soma / notas.length;
    }

    // toString: para exibir o objeto de forma legível
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", média=" + String.format("%.2f", calcularMedia()) +
                '}';
    }

    // equals: para comparar alunos com base no nome e nas notas
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno_Ex79 outro)) return false;
        return nome.equalsIgnoreCase(outro.nome) &&
                Arrays.equals(notas, outro.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Arrays.hashCode(notas));
    }
    public static void main(String[] args) {
        Aluno_Ex79 a1 = new Aluno_Ex79("Ana", new double[]{8.0, 9.0, 7.5});
        Aluno_Ex79 a2 = new Aluno_Ex79("Ana", new double[]{8.0, 9.0, 7.5});

        System.out.println(a1); // usa toString()
        System.out.println("São iguais? " + a1.equals(a2)); // true
    }
}

class PessoaValida_Ex80 {
    private String nome;
    private String cpf;
    private int idade;

    public PessoaValida_Ex80(String nome, String cpf, int idade) {
        this.nome = nome;
        setCpf(cpf);    // valida ao setar
        setIdade(idade);
    }

    public void setCpf(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade mínima: 18 anos");
        }
    }

    private boolean validarCPF(String cpf) {
        // Validação simples: deve ter 11 dígitos numéricos
        if (cpf == null || cpf.length() != 11) return false;
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaValida{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
    public static void main(String[] args) {
        try {
            PessoaValida_Ex80 p = new PessoaValida_Ex80("Lucas", "12345678901", 20);
            System.out.println(p);

            // Tentando criar inválido:
            PessoaValida_Ex80 p2 = new PessoaValida_Ex80("Maria", "12345", 16);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
