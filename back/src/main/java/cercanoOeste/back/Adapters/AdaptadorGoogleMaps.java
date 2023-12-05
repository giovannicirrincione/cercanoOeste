package cercanoOeste.back.Adapters;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TravelMode;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class AdaptadorGoogleMaps implements AdaptadorDistancia {
    @Value("${google.maps.apiKey}")
    private String apiKey;
    public Double obtenerDistancia(String origen,String destino){
        try {
            DistanceMatrixApiRequest request = DistanceMatrixApi.newRequest(new com.google.maps.GeoApiContext.Builder().apiKey(apiKey).build())
                    .origins(origen)
                    .destinations(destino)
                    .mode(TravelMode.DRIVING);

            DistanceMatrix matrix = request.await();

            // Obtén la distancia desde la respuesta de la API y haz lo que necesites con ella
            String distancia = matrix.rows[0].elements[0].distance.humanReadable;
            double distanciaNumerica = Double.parseDouble(distancia.replaceAll("[^\\d.]", ""));

            return distanciaNumerica;
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
            return -1.0;
        }
    }



    public AdaptadorGoogleMaps() {
    }
}
