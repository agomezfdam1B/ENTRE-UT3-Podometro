import java.io.PrintStream;
/**
 * 
 *
 *  
 */
public class Podometro {

    private final char hombre='H';
    private final char mujer='M';
    private final double zancada_hombre=0.45;
    private final double zancada_mujer=0.41;
    private final int sabado=6;
    private final int domingo=7;

    private String marca;
    private double altura;
    private char sexo;
    private double longitudZancada;

    private int totalPasosLaborables;
    private int totalPasosSabado;
    private int totalPasosDomingo;

    private int totalDistanciaSemana;
    private int totalDistanciaFinSemana;

    private int tiempo;
    private int caminatasNoche;

    /**
     * 
     */
    public Podometro(String nombreMarca) 
    {
        marca=nombreMarca;
        sexo='M';
    }

    /**
     *
     */
    public String getMarca()
    {
        return marca;
    }

    public void configurar(double queAltura, char queSexo)
    {
        altura=queAltura;
        switch(sexo){
                case 'M': queSexo='M';
                longitudZancada=Math.floor((double)queAltura)*zancada_mujer;
                longitudZancada=longitudZancada;
                break;
                case 'H': queSexo='H';
                longitudZancada=Math.ceil((double)queAltura)*zancada_hombre;
                longitudZancada=longitudZancada;
                break;
        }        
        sexo=queSexo;
        if ((queSexo !='H')&&(queSexo !='M'))
        {
            System.out.println("INSERTE M SI ES MUJER, H SI ES HOMBRE");
        }
    }

    /**
     *
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio, int horaFin)
    {
        if (dia == 1) {
            pasos++;
            }
        if (dia == 1 || dia == 2) {
            pasos++;
        }
        if (dia == 1 || dia == 2 || dia == 3) {
            pasos++;
        }
        if (dia == 1 || dia == 2 || dia == 3 || dia == 4) {
            pasos++;
        }
        if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {  
            pasos++;
        }
        if (dia == 6){
            pasos+=totalPasosSabado;
        }
        if (dia == 7){
            pasos+=totalPasosDomingo;
        }     
        totalPasosLaborables=totalPasosLaborables;
        totalPasosSabado=totalPasosSabado;
        totalPasosDomingo=totalPasosDomingo;
        //como intentear almacenar la información de los días
        if (sexo=='M')
        {
            totalDistanciaSemana=(int)(totalPasosLaborables*zancada_mujer);
        }
        if (sexo=='H')
        {
            totalDistanciaSemana=(int)(totalPasosLaborables*zancada_hombre);
            totalDistanciaFinSemana=(int)((totalPasosSabado+totalPasosDomingo)*zancada_hombre);
        }
        totalDistanciaFinSemana=(int)((totalPasosSabado+totalPasosDomingo)*zancada_mujer);
        totalDistanciaFinSemana=(int)((totalPasosSabado+totalPasosDomingo)*zancada_hombre);
        horaInicio=horaInicio;
        horaFin=horaFin;
    }   

    /**
      * 
      */
    public void printConfiguración()
    {
        System.out.println("Configuración de  podómetro");
        System.out.println("*******************************");
        System.out.println("Altura: "+altura+" metros");
        System.out.println("Sexo: "+sexo);
        System.out.println("Longitud de tu zancada: "+longitudZancada+" metros");
    }

    public void printEstadisticas()
    {
        System.out.println("Estadísticas");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("Distancia recorrida durante toda la semana "+totalDistanciaSemana+" Km");//recorrido semana
        System.out.println("Distancia recorrida durante el fin de semana "+totalDistanciaFinSemana+" Km");//recorrido sólo finde
        System.out.println("");
        System.out.println("");
        System.out.println("Nº de pasos en días laborables: "+totalPasosLaborables);//pasos switch1-5
        System.out.println("Nº de pasos SÁBADO: "+totalPasosSabado);//pasos switch 6
        System.out.println("Nº de pasos DOMINGO: "+totalPasosDomingo);//pasos switch 6
        System.out.println("");
        System.out.println("");
        System.out.println("Nº de caminatas relizadas a partir de las 21h: ");//pasos switch 1-6 sólo  noche?
        System.out.println("");
        System.out.println("Día/s con más pasos caminados: LABORABLES");//qué dee sos switch/dias tiene el > nº de pasos
    }
    
    public void diaMayorNumeroPasos()
    {
        return ;
    }
}
