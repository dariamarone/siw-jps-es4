package persistence;

import model.Curatore;
import java.util.*;

public interface CuratoreCrudRepository {
	public Curatore save(Curatore curatore);
	public Curatore findOne(Long id);
	public List<Curatore> findAll();
	public void detete(Curatore curatore);
	public void deleteAll();

}
