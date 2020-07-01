package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* 
 * Usamos o serializable quando queremos que nossos objetos sejam transformados em cadeias de bytes
 * para que possa trafegar na rede e possa ser gravado em arquivos
*/
@Entity // Fazer a classe dependendo da Especificação(javax) e não da Implementação
@Table(name = "tb_user") // Para informar que o user é uma tabela
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id // Apontando para o JPA quem é minha PrimaryKey
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Dizendo que a PK é auto incrementável
	private Long id;
	private String nome;
	private String email;
	private String phone;
	private String password;
	
	@JsonIgnore //Evitar um loop entre User e Order
	@OneToMany(mappedBy = "client") // Informando onde está a FK
	private List<Order> orders = new ArrayList<>();
	
	public User() {
	}

	public User(Long id, String nome, String email, String phone, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
