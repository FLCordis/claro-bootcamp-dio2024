public class AboutMe {

    public static void main(String[] args) {
        /*
         * Aqui na execução do programa via MS-DOS podemos colocar "java AboutMe Flavio Cordis 23 1.94" para entregar
         * os parâmetros necessários da nossa classe.
         * Outra opção é um arquivo LAUNCH.JSON com os argumentos no VSCODE (Run >> Add/Edit Configuration)!
         * "args": [
                "Flávio",
                "Cordis",
                23,
                1.93
            ]
         */

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("E " + altura + "cm de altura.");
    }
}
