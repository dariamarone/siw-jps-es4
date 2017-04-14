package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Stanza {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String piano;
	
	@OneToMany
	private List<Opera> opere;
	@ManyToOne
	private Curatore curatore;
	
	public Stanza(){
		this.opere = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMane() {
		return name;
	}

	public void setMane(String mane) {
		this.name = mane;
	}

	public String getPiano() {
		return piano;
	}

	public void setPiano(String piano) {
		this.piano = piano;
	}

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}

	public Curatore getCuratore() {
		return curatore;
	}

	public void setCuratore(Curatore curatore) {
		this.curatore = curatore;
	}
	

}
