public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Flavio";
        String segundoNome = "Cordis";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        Integer primeiroNum = 10;
        Integer segundoNum = 20;

        Integer somaTotal = somandoContas(primeiroNum, segundoNum);

        System.out.println(somaTotal);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static Integer somandoContas (Integer primeiroNum, Integer segundoNum){
        return (primeiroNum + segundoNum);
    }
}
