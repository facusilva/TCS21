package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;
class GeometriaTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	Geometria gm;
	
	@BeforeEach
	public void before() {
		gm=new Geometria(2);
	}
	
	/*@AfterEach
	public void after() {
		gm.clear();
	}*/
	
	@Test
	public void testAreacuadrado() {
		gm=new Geometria(1);
		int resul = gm.areacuadrado(2);
		int esper = 4;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreaCirculo() {
		gm=new Geometria(2);
		double resul = gm.areaCirculo(2);
		double esper = 12.5664;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreatriangulo() {
		gm=new Geometria(3);
		int resul = gm.areatriangulo(2, 3);
		int esper = 3;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testArearectangulo() {
		gm=new Geometria(4);
		int resul = gm.arearectangulo(3, 3);
		int esper = 9;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreapentagono() {
		gm=new Geometria(5);
		int resul = gm.areapentagono(2, 3);
		int esper = 3;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testArearombo() {
		gm=new Geometria(6);
		int resul = gm.arearombo(2, 3);
		int esper = 3;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testArearomboide() {
		gm=new Geometria(7);
		int resul = gm.arearomboide(3, 3);
		int esper = 9;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreatrapecio() {
		gm=new Geometria(8);
		int resul = gm.areatrapecio(3, 3, 2);
		int esper = 6;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testFigura() {
		gm = new Geometria();
		String resul = gm.figura(0);
		String esper = "Default";
		assertEquals(esper,resul);
	}
	
	@Test
	public void testGetId() {
		gm = new Geometria(2);
		int resul = gm.getId();
		int esper = 2;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testGetNom() {
		gm.setNom("prova");
		String resul = gm.getNom();
		String esper = "prova";
		assertEquals(esper, resul);
	}
	
	@Test
	public void testSetId() {
		gm = new Geometria(4);
		gm.setId(2);
		int resul = gm.getId();
		int esper = 2;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testSetArea() {
		gm.setArea(gm.areaCirculo(2));
		double resul = gm.getArea();
		double esper = 12.5664;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testToString() {
		gm.setArea(gm.areaCirculo(2));
		String resul = gm.toString();
		String esper = "Geometria [id=2, nom=Circulo, area=12.5664]";
		assertEquals(esper, resul);
	}
	

	
}
