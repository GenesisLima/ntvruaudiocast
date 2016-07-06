package org.ntvru.audiocast.repository;

import java.util.List;

import org.ntvru.audiocast.model.Show;

public interface ShowRepository {
         
	public long count();
	public void save(Show show);
	public void delete(Show show);
	public List<Show> findAll();
	public Show findByShowNo(String showNo);
	public Show findByShowNo(Long id);
	public void delete(Long id);
	
	
}
