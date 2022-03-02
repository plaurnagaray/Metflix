import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie HIMYM
        //reproducir el episodio

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo(); //Estoy llamando al metodo que crea las pelis y series

        Director directorBuscado = miMetflix.buscarDirector("Stanley Kubrick");
        directorBuscado.mostrar();

        Serie serieBuscada = miMetflix.buscarSerie("Los Simuladores");

        if (serieBuscada == null){
            System.out.println("Serie no existe");
            return;
        }
        System.out.println("Ingrese nro de temporada: ");
        int nroTemporada = Teclado.nextInt();
        Teclado.nextLine();

        Temporada temporada = serieBuscada.buscarTemporada(nroTemporada);

        System.out.println("Ingrese nro de episodio: ");
        int nroEpisodio = Teclado.nextInt();
        Teclado.nextLine();


        Episodio episodio = temporada.buscarEpisodio(nroEpisodio);
        //guardamos en una variable
        
        episodio.reproducir(); //reproducir no devuelve una variable porque es void


        //ahora quiero imprimir un cartel que diga:
        //que lo que se acaba de reproducir arriba es un 
        //websodio o episodio
        //pero en un print aparte
        if(episodio instanceof Websodio){
            System.out.println("El episodio era un websodio");
        }
        else {
            System.out.println("Es un episodio");
        }

        //Ahora quiero que si es un Websodio, imprima el link del websodio
        if (episodio instanceof Websodio){
            //Castear: es el proceso donde "desenmascaramos" a una variable
            Websodio websodio = (Websodio)episodio;
            System.out.println("El link del websodio es: " + websodio.link);
        }
        /*
        miMetflix.buscarSerie("How I met your mother")
                    .buscarTemporada(5)
                    .buscarEpisodio(1)
                    .reproducir();
        */
    }
}
