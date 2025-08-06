package com.ahmetfatih.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

	@Id
	@Column(name = "id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "baslik_string", nullable = false)
	private String baslik_string;
	
	@Column(name = "aciklama_string", nullable = false)
	private String aciklama_string;
	
	@Column(name = "tamamlandi_mi", nullable = true)
	private boolean tamamlandi_mi;
	
}
