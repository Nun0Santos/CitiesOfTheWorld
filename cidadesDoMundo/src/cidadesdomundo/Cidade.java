/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cidade {
    String nome;
    String pais;
    String capital;
    String linkBandeiraPais;
    String linguaOficial;
    String linkBandeiraCidade;
    String linkMonumentos; //aqui ArrayList
    Double areaCidade;
    Double nHabitantes;
    Double densidadePopulacional;
    String codigoPostal;
    String presidente;
    Double latitude; //alterar
    Double longitude;
    Double altitude;
    String clima;
    String fusoHorario;
    String website;
    String cidadesGeminadas; //ArrayList

    public Cidade(String nome, String pais, String capital, String linkBandeiraPais, String linguaOficial, String linkBandeiraCidade, String linkMonumentos, Double areaCidade, Double nHabitantes, Double densidadePopulacional, String codigoPostal, String presidente, Double latitude, Double longitude, Double altitude, String clima, String fusoHorario, String website, String cidadesGeminadas) {
        this.nome = nome;
        this.pais = pais;
        this.capital = capital;
        this.linkBandeiraPais = linkBandeiraPais;
        this.linguaOficial = linguaOficial;
        this.linkBandeiraCidade = linkBandeiraCidade;
        this.linkMonumentos = linkMonumentos;
        this.areaCidade = areaCidade;
        this.nHabitantes = nHabitantes;
        this.densidadePopulacional = densidadePopulacional;
        this.codigoPostal = codigoPostal;
        this.presidente = presidente;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.clima = clima;
        this.fusoHorario = fusoHorario;
        this.website = website;
        this.cidadesGeminadas = cidadesGeminadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLinkBandeiraPais() {
        return linkBandeiraPais;
    }

    public void setLinkBandeiraPais(String linkBandeiraPais) {
        this.linkBandeiraPais = linkBandeiraPais;
    }

    public String getLinguaOficial() {
        return linguaOficial;
    }

    public void setLinguaOficial(String linguaOficial) {
        this.linguaOficial = linguaOficial;
    }

    public String getLinkBandeiraCidade() {
        return linkBandeiraCidade;
    }

    public void setLinkBandeiraCidade(String linkBandeiraCidade) {
        this.linkBandeiraCidade = linkBandeiraCidade;
    }

    public String getLinkMonumentos() {
        return linkMonumentos;
    }

    public void setLinkMonumentos(String linkMonumentos) {
        this.linkMonumentos = linkMonumentos;
    }

    public Double getAreaCidade() {
        return areaCidade;
    }

    public void setAreaCidade(Double areaCidade) {
        this.areaCidade = areaCidade;
    }

    public Double getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(Double nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public Double getDensidadePopulacional() {
        return densidadePopulacional;
    }

    public void setDensidadePopulacional(Double densidadePopulacional) {
        this.densidadePopulacional = densidadePopulacional;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getFusoHorario() {
        return fusoHorario;
    }

    public void setFusoHorario(String fusoHorario) {
        this.fusoHorario = fusoHorario;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCidadesGeminadas() {
        return cidadesGeminadas;
    }

    public void setCidadesGeminadas(String cidadesGeminadas) {
        this.cidadesGeminadas = cidadesGeminadas;
    }


    
}

   

    
    
