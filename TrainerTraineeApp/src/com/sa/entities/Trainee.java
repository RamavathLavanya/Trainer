package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
	
	private long id;
	private String name;
	private Trainer trainer;
	private List<Training>trinings=new ArrayList<Training>();
	private List<Training> trainings;
	
	public Trainee(long id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	


	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer1(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Training> getTrainings() {
		return getTrainings();
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}
	
	

}

	