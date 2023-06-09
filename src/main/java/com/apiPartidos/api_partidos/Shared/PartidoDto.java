package com.apiPartidos.api_partidos.Shared;

import java.io.Serializable;
import java.util.Date;

public class PartidoDto implements Serializable {

    private static final long serialVersionUID=1L;

    private long id;
    private String idPartido;
    private String username;
    private Date fecha;
    private long equipoLocal;
    private long equipoVisitante;
    private String golesLocal;
    private String golesVisitante;
    private Date creado;
    private UsuarioDto usuarioEntity;
    private EquipoDto equipoEntityLocal;
    private EquipoDto equipoEntityVisitante;

    public PartidoDto() {
    }

    public PartidoDto(long id, String idPartido, String username, Date fecha, long equipoLocal, long equipoVisitante, String golesLocal, String golesVisitante, Date creado, UsuarioDto usuarioEntity, EquipoDto equipoEntityLocal, EquipoDto equipoEntityVisitante) {
        this.id = id;
        this.idPartido = idPartido;
        this.username = username;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.creado = creado;
        this.usuarioEntity = usuarioEntity;
        this.equipoEntityLocal = equipoEntityLocal;
        this.equipoEntityVisitante = equipoEntityVisitante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(long equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public long getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(long equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(String golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(String golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public UsuarioDto getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDto usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public EquipoDto getEquipoEntityLocal() {
        return equipoEntityLocal;
    }

    public void setEquipoEntityLocal(EquipoDto equipoEntityLocal) {
        this.equipoEntityLocal = equipoEntityLocal;
    }

    public EquipoDto getEquipoEntityVisitante() {
        return equipoEntityVisitante;
    }

    public void setEquipoEntityVisitante(EquipoDto equipoEntityVisitante) {
        this.equipoEntityVisitante = equipoEntityVisitante;
    }
}
