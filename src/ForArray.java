public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"FULANO", "CICLANO", "BUTANO", "PETRANO"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno da posição [" + i + "] é o " + alunos[i]);
        }

        String carros [] = {"MUSTANG", "RAPTOR", "RAM 2500", "TESLA"};
        for(String carro: carros){
            System.out.println("Carro: " + carro);
        }
    }
}