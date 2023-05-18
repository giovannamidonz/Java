package POO.Entitade;

public class AppPneu {
    static boolean resultado;
    static Pneu pneu;
    public static void main(String[] args) {

        pneu = new Pneu(1,"fiat", 110);
        System.out.println(" o id do pneu : " + pneu.getIdPneu());
        System.out.println(" o modelo do pneu : " +pneu.getModelo());
        System.out.println(" o indice de vida do pneu  : " +pneu.getIndiceDeUso());
        System.out.println(" o estado do pneu:  " +pneu.getEstado());
        System.out.println(" a horas de uso do pneu : " +pneu.getHoraDeUso());
        System.out.println("----------------------------------------------------------------------------------");
        boolean resultado = pneu.desgatar(4,14);
        if (resultado == true){
            System.out.println(" o indice de vida do pneu  : " +pneu.getIndiceDeUso());
            System.out.println(" o estado do pneu:  " +pneu.getEstado());
            System.out.println(" a horas de uso do pneu : " +pneu.getHoraDeUso());
        }else{
            System.out.println("Fora de uso ");
        }

        pneu.desgatar(4,14);
        mostrarDesgaster();
        pneu.desgatar(15,20);
        mostrarDesgaster();
        pneu.desgatar(21, 23);
        mostrarDesgaster();




    }
    public static void mostrarDesgaster() {
        if (resultado == true){

            System.out.println(" o indice de vida do pneu  : " +pneu.getIndiceDeUso());
            System.out.println(" o estado do pneu:  " +pneu.getEstado());
            System.out.println(" a horas de uso do pneu : " +pneu.getHoraDeUso());
        }else{
            System.out.println("Fora de uso ");
        }
    }
}
