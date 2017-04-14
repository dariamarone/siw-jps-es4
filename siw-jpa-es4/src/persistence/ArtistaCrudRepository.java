package persistence;

import model.Artista;
import java.util.*;

public interface ArtistaCrudRepository {
	public Artista save(Artista artista);
	public Artista fingOne(Long id);
	public List<Artista> findAll();
	public void delete(Artista artista);
	public void deleteAll();
}
