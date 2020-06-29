package com.SPRINGHmysql;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Players {
	
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer Id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="speciality")
		private String speciality;

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSpeciality() {
			return speciality;
		}

		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		
			

}
