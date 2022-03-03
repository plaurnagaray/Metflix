import java.util.ArrayList;
import java.util.List;

public class Metflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<Director> directores = new ArrayList<>();

    

    //Metodo que inicializa el catalogo con las pelis/series que querramos
    public void inicializarCatalogo(){
        
        
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); //cree espacio de memoria y lo instancie
        //Estas ultimas 2 lineas: Pelicula titanic = new Pelicula();
        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3 hs 30 
        Actor actor = new Actor(); //declaro, instanciando
        actor.nombre = "Leo DiCaprio";
        //Agrego a la lista de actores del objeto tiatnic
        titanic.actores.add(actor); //metodo Add -> agregar a una lista
        //recien ahora estoy agregando a Titanic al catalogo
        //this: porque estoy referenciando a un atributo dentro de esta misma clase
        this.peliculas.add(titanic);

        Pelicula batman = new Pelicula();
        batman.nombre = "Batman el caballero de la noche";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;
        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        //re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado en la variable actor
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);
        this.peliculas.add(batman);


        //How I met your mother. Serie
        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";
        howIMetYM.actores.add(actor);
        actor = new Actor();
        actor.nombre = "Cobie Smulders";
        howIMetYM.actores.add(actor);
        //T5:E11
        //Creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 5;
        //Creo el episodio
        Episodio episodio = new Episodio();
        episodio.setNombre("The last cigarrette");
        episodio.setNumero(11);
        episodio.setDuracion(43);
        //vinculo temporada con episodio
        temporada.episodios.add(episodio);
        episodio = new Episodio();
        episodio.setNombre("Definitions");
        episodio.setNumero(1);
        episodio.setDuracion(41);
        temporada.episodios.add(episodio);
        Websodio ws = new Websodio();
        ws.setNombre("Nombre websodio en internet");
        ws.setNumero(35);
        episodio.setDuracion(42);
        ws.link = "http://miepisodios.com/websodio.avi";
        temporada.episodios.add(ws);
        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);    
        //T3
        //Creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
        //Creo el episodio
        episodio = new Episodio();
        episodio.setNombre("Wait for it");
        episodio.setNumero(1);
        episodio.setDuracion(43);
        //vinculo temporada con episodio
        temporada.episodios.add(episodio);
        episodio = new Episodio();
        episodio.setNombre("Little Boys");
        episodio.setNumero(4);
        temporada.episodios.add(episodio);
        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);    
        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";
        bbt.actores.add(actor);
        //Creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
        //Creo el episodio
        episodio = new Episodio();
        episodio.setNombre("Pilot");
        episodio.setNumero(1);
        //Vinculo temporada con episodio
        temporada.episodios.add(episodio);
        episodio = new Episodio();
        episodio.setNombre("The Cooper Hofstadter Polarizatio");
        episodio.setNumero(9);
        temporada.episodios.add (episodio);
        //Agrego la temporada
        bbt.temporadas.add(temporada);
        this.series.add(bbt);

        Serie losSimuladores = new Serie();
        losSimuladores.nombre = "Los Simuladores";
        losSimuladores.añoLanzamiento = 2002;
        actor = new Actor();
        actor.nombre = "Diego Peretti";
        losSimuladores.actores.add(actor);
        temporada = new Temporada();
        temporada.numero = 1;
        episodio = new Episodio();
        episodio.setNombre("Capitulo 1");
        episodio.setNumero(1);
        temporada.episodios.add(episodio);
        losSimuladores.temporadas.add(temporada);
        this.series.add(losSimuladores);

        Pelicula elResplandor = new Pelicula();
        elResplandor.nombre = "El Resplandor";
        Director director = new Director();
        director.nombre = "Stanley Kubrick";
        this.directores.add(director);

       

    }
    //metodos: buscar una peli o serie
    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie 25 | serie 40 |
        //vamor a usar el foreach: que sirve para recorrer listas
        //a cada elemento de la lista
        //o sea la primera vez, va a apuntar a serie1, despues a serie 2,...
        //serie 25 hasta que termina
        for (Serie serie: this.series){
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
            return serie;  //devuelvo esta serie
        }
        //si llego hasta aca, es porque no encontro la serie
        return null;
    }
    
    public Serie buscarSerieV2(String nombreABuscar){
        Serie serieBuscada = null;
        //En este caso se recorre TODO
        //y al final se devuelve si encuentra una serie
        //en el caso anterior, se devuelve una vez encontrada
        //ej si hay 1000 series pero esta en la posicion 3, hace 3 vueltas
        for (Serie serie: this.series){
        
            if (serie.nombre.equals(nombreABuscar))
                serieBuscada = serie;
        }
        return serieBuscada;
        }

    public Director buscarDirector(String nombreDirector){
        for (Director director: this.directores){
            if (director.nombre.equals(nombreDirector))
            return director;
        }
        return null;

    }
    
}
