package com.techouts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "jobpost")
public class JobPost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	@ElementCollection
	private List<String> postTechStack;
	

}
