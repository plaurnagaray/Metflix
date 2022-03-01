public class App {
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

        Temporada temporada = serieBuscada.buscarTemporada(1);

        Episodio episodio = temporada.buscarEpisodio(1);
        //guardamos en una variable
        
        episodio.reproducir(); //reproducir no devuelve una variable porque es void

        /*
        miMetflix.buscarSerie("How I met your mother")
                    .buscarTemporada(5)
                    .buscarEpisodio(1)
                    .reproducir();
        */
    }
}
