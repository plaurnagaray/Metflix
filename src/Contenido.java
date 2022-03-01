import java.util.*;

public class Contenido {
    public String nombre;
    public Genero genero;
    public Idioma idiomaOrigen;
    public int añoLanzamiento;
    //como en UN contenido hay VARIOS actores 
    //creo una lista
    public List<Actor> actores = new ArrayList<>();

    public List<Director> directores = new ArrayList<>();




}