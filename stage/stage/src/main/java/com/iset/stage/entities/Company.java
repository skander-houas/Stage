package com.iset.stage.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Company")
public class Company {

	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idCompany;
		private String nomCompany;
		private String adressCompany;
		private String descriptionCompany;
		private Date dateCreation;
		public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Company(String nomCompany, String adressCompany, String descriptionCompany, Date dateCreation) {
			super();
			this.nomCompany = nomCompany;
			this.adressCompany = adressCompany;
			this.descriptionCompany = descriptionCompany;
			this.dateCreation = dateCreation;
		}
		public Long getIdCompany() {
			return idCompany;
		}
		public void setIdCompany(Long idCompany) {
			this.idCompany = idCompany;
		}
		public String getNomCompany() {
			return nomCompany;
		}
		public void setNomCompany(String nomCompany) {
			this.nomCompany = nomCompany;
		}
		public String getAdressCompany() {
			return adressCompany;
		}
		public void setAdressCompany(String adressCompany) {
			this.adressCompany = adressCompany;
		}
		public String getDescriptionCompany() {
			return descriptionCompany;
		}
		public void setDescriptionCompany(String descriptionCompany) {
			this.descriptionCompany = descriptionCompany;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		@Override
		public String toString() {
			return "Company [idCompany=" + idCompany + ", nomCompany=" + nomCompany + ", adressCompany=" + adressCompany
					+ ", descriptionCompany=" + descriptionCompany + ", dateCreation=" + dateCreation + "]";
		}
		




}


