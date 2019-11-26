/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author Guilherme
 */
public class Queimada {
    
    private int X;
    private int Y;
    private String month;
    private String day;
    private Double FFMC;
    private Double DMC;
    private Double DC;
    private Double ISI;
    private Double temp;
    private int RH;
    private Double wind;
    private Double rain;
    private Double area;

    public Queimada(int X, int Y, String month, String day, Double FFMC, Double DMC, Double DC, Double ISI, Double temp, int RH, Double wind, Double rain, Double area) {
        this.X = X;
        this.Y = Y;
        this.month = month;
        this.day = day;
        this.FFMC = FFMC;
        this.DMC = DMC;
        this.DC = DC;
        this.ISI = ISI;
        this.temp = temp;
        this.RH = RH;
        this.wind = wind;
        this.rain = rain;
        this.area = area;
    }
    
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Double getFFMC() {
        return FFMC;
    }

    public void setFFMC(Double FFMC) {
        this.FFMC = FFMC;
    }

    public Double getDMC() {
        return DMC;
    }

    public void setDMC(Double DMC) {
        this.DMC = DMC;
    }

    public Double getDC() {
        return DC;
    }

    public void setDC(Double DC) {
        this.DC = DC;
    }

    public Double getISI() {
        return ISI;
    }

    public void setISI(Double ISI) {
        this.ISI = ISI;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public int getRH() {
        return RH;
    }

    public void setRH(int RH) {
        this.RH = RH;
    }

    public Double getWind() {
        return wind;
    }

    public void setWind(Double wind) {
        this.wind = wind;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    public void imprimir()
    {
        System.out.println(X + " ");
        System.out.println(Y+ " ");
        System.out.println(month+ " ");
        System.out.println(FFMC+ " ");
    }
}
