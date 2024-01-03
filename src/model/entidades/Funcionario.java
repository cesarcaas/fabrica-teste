package model.entidades;

import java.sql.Date;
import java.util.Objects;

public class Funcionario {
	
	private Integer funCodigo;
	private String funNome;
	private String funSexo;
	private Date funDataCadastro;
	
	public Funcionario() {
	}

	public Funcionario(Integer funCodigo, String funNome, String funSexo, Date funDataCadastro) {
		this.funCodigo = funCodigo;
		this.funNome = funNome;
		this.funSexo = funSexo;
		this.funDataCadastro = funDataCadastro;
	}

	public Integer getFunCodigo() {
		return funCodigo;
	}

	public void setFunCodigo(Integer funCodigo) {
		this.funCodigo = funCodigo;
	}

	public String getFunNome() {
		return funNome;
	}

	public void setFunNome(String funNome) {
		this.funNome = funNome;
	}

	public String getFunSexo() {
		return funSexo;
	}

	public void setFunSexo(String funSexo) {
		this.funSexo = funSexo;
	}

	public Date getFunDataCadastro() {
		return funDataCadastro;
	}

	public void setFunDataCadastro(Date funDataCadastro) {
		this.funDataCadastro = funDataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(funCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(funCodigo, other.funCodigo);
	}

	@Override
	public String toString() {
		return "Funcionario [funCodigo=" + funCodigo + ", funNome=" + funNome + ", funSexo=" + funSexo
				+ ", funDataCadastro=" + funDataCadastro + "]";
	}

}
