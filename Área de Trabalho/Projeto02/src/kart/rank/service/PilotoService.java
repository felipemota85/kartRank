
package kart.rank.service;

import kart.rank.model.CorridaModel;

/**
 *
 * @author Felipe
 */
public interface PilotoService {
    
    public void melhorVoltaPorPiloto(CorridaModel corrida);
    public void mediaVelocidadePorPiloto(CorridaModel corrida);
    
}
