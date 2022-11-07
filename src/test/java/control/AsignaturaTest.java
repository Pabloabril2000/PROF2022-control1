package control;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class AsignaturaTest {

	//Prueba devuelve excepcion si vector es nulo
	@Test
	void vectorNuloTest() {
		Matricula m1 = new Matricula(null);
		assertThrows(Exception.class,()->m1.getImporte(),"El vector de asignaturas no puede ser nulo");
	}
	
	//Prueba el metodo getImporte recorre todas las asignaturas
	@Test
	void recorrerTodoTest() throws Exception {
		Vector<Asignatura> v1 = new Vector<>(5);
		Matricula m1 = new Matricula(v1);
		System.out.println(m1.getImporte());
	}

}
