
package kart.rank.service;

import kart.rank.model.CorridaModel;
import kart.rank.model.RankModel;

/**
 *
 * @author Felipe
 */
public interface CorridaService {
    
    public void rank(CorridaModel corrida);
    public void melhorVolta(CorridaModel corrida);
    public void diferencaTempoVencedor(RankModel rank);
}
