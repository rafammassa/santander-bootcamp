public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Em recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
