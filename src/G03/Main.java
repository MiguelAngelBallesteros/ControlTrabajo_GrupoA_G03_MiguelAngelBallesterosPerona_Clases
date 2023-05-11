//MIGUEL ÁNGEL BALLESTEROS PERONA
package G03;

public class Main {
    public static void main(String[] args) {
        Hub H=new Hub();
        Contenedores Cont=new Contenedores(12,23,"Alemania",true,1,"Asda".toCharArray(),"as".toCharArray(),"asda".toCharArray());
        Contenedores Cont1=new Contenedores(13,23,"Alemania",true,2,"Asa".toCharArray(),"asd".toCharArray(),"asda".toCharArray());
        Contenedores Cont2=new Contenedores(14,23,"Alemania",true,3,"Ada".toCharArray(),"ad".toCharArray(),"asda".toCharArray());
        H.PlanoHub();
        H.ApilarContenedor(Cont);
        H.ApilarContenedor(Cont1);
        H.ApilarContenedor(Cont2);
        H.PlanoHub();
        H.mostrar_datos(12);
        H.contenedores_pais("Alemania");
        H.PlanoHub();
        H.buscacont(Cont.getPrioridad());
        H.buscacont(Cont1.getPrioridad());
        H.buscacont(Cont2.getPrioridad());
    }
}