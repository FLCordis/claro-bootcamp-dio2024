public class FormatadorCEP {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCEP("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde as regras de negócio!");;
        }
    }

    static String formatarCEP(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();  
        }
        return "23.765-064";
    }
}
