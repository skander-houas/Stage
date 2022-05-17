package com.iset.stage.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Etudiant")
public class Etudiant {

	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idEtudiant;
		private String nomEtudiant;
		private String mailEtudiant;
		private String descriptionEtudiant;
		
		public Etudiant() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getNomEtudiant() {
			return nomEtudiant;
		}

		public void setNomEtudiant(String nomEtudiant) {
			this.nomEtudiant = nomEtudiant;
		}

		public String getMailEtudiant() {
			return mailEtudiant;
		}

		public void setMailEtudiant(String mailEtudiant) {
			this.mailEtudiant = mailEtudiant;
		}

		public String getDescriptionEtudiant() {
			return descriptionEtudiant;
		}

		public void setDescriptionEtudiant(String descriptionEtudiant) {
			this.descriptionEtudiant = descriptionEtudiant;
		}

		@Override
		public String toString() {
			return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", mailEtudiant="
					+ mailEtudiant + ", descriptionEtudiant=" + descriptionEtudiant + "]";
		}
		
		




}


