package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Root {

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

  String name;
  //List<String> topLevelDomain;
  String alpha2Code;
  String alpha3Code;
  //List<String> callingCodes;
  String capital;
  //List<String> altSpellings;
  String region;
  String subregion;
  int population;
  List<Double> latlng;
  String demonym;
  double area;
  double gini;
  //List<String> timezones;
  //List<String> borders;
  String nativeName;
  String numericCode;
  //List<Currency> currencies;
  //List<Language> languages;
  Translations translations;
  String flag;
  //List<RegionalBloc> regionalBlocs;
  String cioc;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAlpha2Code() {
	return alpha2Code;
}
public void setAlpha2Code(String alpha2Code) {
	this.alpha2Code = alpha2Code;
}
public String getAlpha3Code() {
	return alpha3Code;
}
public void setAlpha3Code(String alpha3Code) {
	this.alpha3Code = alpha3Code;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getSubregion() {
	return subregion;
}
public void setSubregion(String subregion) {
	this.subregion = subregion;
}
public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}
public List<Double> getLatlng() {
	return latlng;
}
public void setLatlng(List<Double> latlng) {
	this.latlng = latlng;
}
public String getDemonym() {
	return demonym;
}
public void setDemonym(String demonym) {
	this.demonym = demonym;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getGini() {
	return gini;
}
public void setGini(double gini) {
	this.gini = gini;
}
public String getNativeName() {
	return nativeName;
}
public void setNativeName(String nativeName) {
	this.nativeName = nativeName;
}
public String getNumericCode() {
	return numericCode;
}
public void setNumericCode(String numericCode) {
	this.numericCode = numericCode;
}
public Translations getTranslations() {
	return translations;
}
public void setTranslations(Translations translations) {
	this.translations = translations;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public String getCioc() {
	return cioc;
}
public void setCioc(String cioc) {
	this.cioc = cioc;
}
@Override
public String toString() {
	return "Root [name=" + name + ", alpha2Code=" + alpha2Code + ", alpha3Code=" + alpha3Code + ", capital=" + capital
			+ ", region=" + region + ", subregion=" + subregion + ", population=" + population + ", latlng=" + latlng
			+ ", demonym=" + demonym + ", area=" + area + ", gini=" + gini + ", nativeName=" + nativeName
			+ ", numericCode=" + numericCode + ", translations=" + translations + ", flag=" + flag + ", cioc=" + cioc
			+ "]";
}

  
}

