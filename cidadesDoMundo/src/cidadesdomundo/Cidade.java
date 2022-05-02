/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

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
    String linkMonumentos;
    int areaCidade;
    int nHabitantes;
    int densidadePopulacional;
    String codigoPostal;
    String presidente;
    float latitude;
    float longitude;
    float altitude;
    String clima;
    String fusoHorario;
    String website;
    String cidadesGeminadas;

    public Cidade(String nome, String pais, String capital, String linkBandeiraPais, String linguaOficial, String linkBandeiraCidade, String linkMonumentos, int areaCidade, int nHabitantes, int densidadePopulacional, String codigoPostal, String presidente, float latitude, float longitude, float altitude, String clima, String fusoHorario, String website, String cidadesGeminadas) {
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

    public int getAreaCidade() {
        return areaCidade;
    }

    public void setAreaCidade(int areaCidade) {
        this.areaCidade = areaCidade;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public int getDensidadePopulacional() {
        return densidadePopulacional;
    }

    public void setDensidadePopulacional(int densidadePopulacional) {
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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
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
