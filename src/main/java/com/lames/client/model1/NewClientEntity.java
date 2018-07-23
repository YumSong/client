package com.lames.client.model1;

import com.jake.annotation.Column;
import com.jake.annotation.Entity;
import com.jake.annotation.ID;
import com.jake.annotation.Sequence;

@Entity("client")
public class NewClientEntity {
//	id varchar(256) primary key,
//	name varchar(256),
//	password varchar(256)
	
	
	@ID
	@Sequence("S_client")
	@Column("id")
	private Integer id;
	@Column("name")
	private String name;
	@Column("password")
	private String password;
	
	
	
	
	public NewClientEntity() {
		
	}

	public NewClientEntity(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NewClientEntity [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	

}
