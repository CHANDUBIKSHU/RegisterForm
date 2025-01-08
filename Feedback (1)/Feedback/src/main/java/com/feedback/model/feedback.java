package com.feedback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class feedback {
	
	public feedback() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slno;
	private int ratingkannada;
	private int ratingenglish;
	private int ratinghindhi;
	private int ratingsocial;
	private int ratingscience;
	private int ratingmath;
	
	
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public int getRatingkannada() {
		return ratingkannada;
	}
	public void setRatingkannada(int ratingkannada) {
		this.ratingkannada = ratingkannada;
	}
	public int getRatingenglish() {
		return ratingenglish;
	}
	public void setRatingenglish(int ratingenglish) {
		this.ratingenglish = ratingenglish;
	}
	public int getRatinghindhi() {
		return ratinghindhi;
	}
	public void setRatinghindhi(int ratinghindhi) {
		this.ratinghindhi = ratinghindhi;
	}
	public int getRatingsocial() {
		return ratingsocial;
	}
	public void setRatingsocial(int ratingsocial) {
		this.ratingsocial = ratingsocial;
	}
	public int getRatingscience() {
		return ratingscience;
	}
	public void setRatingscience(int ratingscience) {
		this.ratingscience = ratingscience;
	}
	public int getRatingmath() {
		return ratingmath;
	}
	public void setRatingmath(int ratingmath) {
		this.ratingmath = ratingmath;
	}
	public feedback(int slno, int ratingkannada, int ratingenglish, int ratinghindhi, int ratingsocial,
			int ratingscience, int ratingmath) {
		super();
		this.slno = slno;
		this.ratingkannada = ratingkannada;
		this.ratingenglish = ratingenglish;
		this.ratinghindhi = ratinghindhi;
		this.ratingsocial = ratingsocial;
		this.ratingscience = ratingscience;
		this.ratingmath = ratingmath;
	}
	@Override
	public String toString() {
		return "feedback [slno=" + slno + ", ratingkannada=" + ratingkannada + ", ratingenglish=" + ratingenglish
				+ ", ratinghindhi=" + ratinghindhi + ", ratingsocial=" + ratingsocial + ", ratingscience="
				+ ratingscience + ", ratingmath=" + ratingmath + "]";
	}
	
	
}
