package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {

	ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public BaseDatos() {
        libros.add(new Libro(1, "HARRY POTTER Y EL PRISIONERO DE AZKABAN", "J.K ROWLING", "SALAMANDRA", "2013-10-08", "INFANTIL"));
        libros.add(new Libro(2, "EL GRAN LABERINTO", "FERNANDO SABATER PEREZ", "ARIEL", "2012-10-16", "FICCIÓN"));
        libros.add(new Libro(3, "ROMEO Y JULIETA", "WILLIAM SHAKESPEARE", "SALAMANDRA", "2014-07-18", "ROMANTICA"));
        libros.add(new Libro(4, "LA CARTA ESFERICA", "ARTURO PEREZ LOPEZ", "SALAMANDRA", "2011-04-08", "FICCION"));
        libros.add(new Libro(5, "EL CODIGO DA VINCI", "DAN BROWN", "ARIEL", "2010-10-20", "FICCION"));
        libros.add(new Libro(6, "MUCHO RUIDO Y POCAS NUECES", "WILLIAM SHAKESPEARE", "SALAMANDRA", "2011-09-16", "ROMANTICA"));
        libros.add(new Libro(7, "PROTOCOLO", "JOSE LOPEZ MURILLO", "SALAMANDRA", "2014-01-21", "SOCIAL"));
        libros.add(new Libro(8, "LINUX", "FERNANDO SABATER PEREZ", "ARIEL", "2012-02-02", "INFORMATICA"));
        libros.add(new Libro(9, "EL TUMULTO", "H.P LOVECRAFT", "DEBATE", "2001-07-07", "CIENCIA"));
        libros.add(new Libro(10, "PERSONAJES MITICOS", "RICHARD HOLLIGHAM", "DEBATE", "2013-01-07", "ENTRETENIMIENTO"));
        libros.add(new Libro(11, "EL TIEMPO", "J.K ROWLING", "SALAMANDRA", "1999-11-05", "CIENCIA"));
        libros.add(new Libro(12, "DIETAS MEDITERRANEAS", "ARTURO PEREZ LOPEZ", "ARIEL", "2014-09-16", "COCINA"));
        libros.add(new Libro(13, "ANGELES Y DEMONIOS", "DAN BROWN", "ARIEL", "2014-09-21", "FICCION"));
        libros.add(new Libro(14, "FORTALEZA DIGITAL", "DAN BROWN", "ARIEL", "2011-04-19", "FICCION"));
        libros.add(new Libro(15, "CAPITAN ALATRISTE", "ARTURO PEREZ REVERTE", "ALFAGUARA", "2001-04-17", "HISTORICA"));
        libros.add(new Libro(16, "PIEL DE TAMBOR", "ARTURO PEREZ REVERTE", "ALFAGUARA", "2009-04-14", "HISTORICA"));
        libros.add(new Libro(17, "TIEMPOS DE COLERA", "GABRIEL GARCIA", "OVEJA NEGRA", "2002-08-04", "HISTORICA"));
        libros.add(new Libro(18, "NOTICIA DE UN SECUESTRO", "GABRIEL GARCIA", "ALFAGUARA", "2013-05-13", "INTRIGA"));
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public void inserta(Libro libro) {
		libros.add(libro);
	}
	
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			
			if(li.getId() == id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			
			if(li.getId() == libro.getId()) {
				libro.setTitulo(libro.getTitulo());
				libro.setAutor(libro.getAutor());
				libro.setEditorial(libro.getEditorial());
				libro.setFecha(libro.getFecha());
				libro.setTematica(libro.getTematica());
				break;
			}
		}
	}
}
