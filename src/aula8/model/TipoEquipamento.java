package aula8.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TipoEquipamento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipo;
	private String nomeTipoEq;
	
	@ManyToOne 
	@JoinColumn(name = "equipamento_tipoEquipamento")
	private Equipamento equipamento;
	
	public TipoEquipamento() {
		
	}

	
	public Integer getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}


	public String getNomeTipoEq() {
		return nomeTipoEq;
	}

	public void setNomeTipoEq(String nomeTipoEq) {
		this.nomeTipoEq = nomeTipoEq;
	}


	@Override
	public String toString() {
		return "TipoEquipamento [idTipo=" + idTipo + ", nomeTipoEq=" + nomeTipoEq + "]";
	}

	
	
}
