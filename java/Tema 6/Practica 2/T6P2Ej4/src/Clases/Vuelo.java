/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Vuelo {
    private int NumeroDeVuelo;
    private String HoraSalida;
    private String HoraLlegada;    
    private String LugarOrigen;
    private String LugarDestino;
    private Date FechaSalida;
    private Date FechaRegreso;
    private String TipoVuelo;
    private Ciudad Ciuda;
    
    /*Constructor*/

    public Vuelo(int NumeroDeVuelo, String HoraSalida, String HoraLlegada, String LugarOrigen, String LugarDestino, Date FechaSalida, Date FechaRegreso, String TipoVuelo) {
        this.NumeroDeVuelo = NumeroDeVuelo;
        this.HoraSalida = HoraSalida;
        this.HoraLlegada = HoraLlegada;
        this.LugarOrigen = LugarOrigen;
        this.LugarDestino = LugarDestino;
        this.FechaSalida = FechaSalida;
        this.FechaRegreso = FechaRegreso;
        this.TipoVuelo = TipoVuelo;
    }
    
    /*Get & Set*/

    public int getNumeroDeVuelo() {
        return NumeroDeVuelo;
    }

    public void setNumeroDeVuelo(int NumeroDeVuelo) {
        this.NumeroDeVuelo = NumeroDeVuelo;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public void setLugarOrigen(String LugarOrigen) {
        this.LugarOrigen = LugarOrigen;
    }

    public String getLugarDestino() {
        return LugarDestino;
    }

    public void setLugarDestino(String LugarDestino) {
        this.LugarDestino = LugarDestino;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Date getFechaRegreso() {
        return FechaRegreso;
    }

    public void setFechaRegreso(Date FechaRegreso) {
        this.FechaRegreso = FechaRegreso;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public Ciudad getCiuda() {
        return Ciuda;
    }

    public void setCiuda(Ciudad Ciuda) {
        this.Ciuda = Ciuda;
    }
    
    
    /*Metodos*/
    
    public void reservar(){
        
    }
    public void modificar(){
        
    }
    public void eliminar(){
        
    }
    public Vuelo buscar(){
        
    }

}
