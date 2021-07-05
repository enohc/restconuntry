package com.example.demo;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegionalBloc{
	 String acronym;
	 String name;
	 List<String> otherAcronyms;
	 List<String> otherNames;
	 
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getOtherAcronyms() {
		return otherAcronyms;
	}
	public void setOtherAcronyms(List<String> otherAcronyms) {
		this.otherAcronyms = otherAcronyms;
	}
	public List<String> getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(List<String> otherNames) {
		this.otherNames = otherNames;
	}
	 
	 
	}