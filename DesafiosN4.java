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

