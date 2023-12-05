/**
 * 
 */
package com.pruebatecnica.www.service;

import java.util.List;

import com.pruebatecnica.www.dto.Party;

/**
 * 
 */
public interface IPartyService {
	/**
	 * Deveuelve todas las partys en funci�n de el videojuego
	 * 
	 * @param id
	 * @return List<Party>
	 */
	public List<Party> getAllByGame(Long id);

	/**
	 * A�ade un party a la base de datos
	 * 
	 * @param party
	 * @return Party
	 */
	public Party add(Party party);

}
