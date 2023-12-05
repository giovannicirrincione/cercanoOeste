package cercanoOeste.back.Factorys;

import cercanoOeste.back.Adapters.AdaptadorDistancia;
import cercanoOeste.back.Adapters.AdaptadorGoogleMaps;

public class FactoryAdapterCalculoDistancia {

    private static FactoryAdapterCalculoDistancia instancia;

    private FactoryAdapterCalculoDistancia(){

    }

    public static FactoryAdapterCalculoDistancia obtenerInstancia() {
        // Si la instancia aún no ha sido creada, crearla
        if (instancia == null) {
            instancia = new FactoryAdapterCalculoDistancia();
        }
        // Devolver la instancia existente o recién creada
        return instancia;
    }
    //metodo que devuelve el objeto con la logica de la comunicacion
    public AdaptadorDistancia obtenerAdaptadorDistancia(){
        AdaptadorDistancia adaptador = new AdaptadorGoogleMaps();
        return adaptador;
    }
}
