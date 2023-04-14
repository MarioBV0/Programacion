package Examenentornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiClaseTest {

	@Test
	void testNumero_mayor() {
		
		int a=5;
		int b=4;
		int c=3;
				
		MiClase clase=new MiClase();
		int resultado=clase.numero_mayor(5,4,3);
		int esp=5;
		assertEquals(resultado,esp);
	}
	
	
	@Test
	void testNumero_mayor2() {
		
		int a=1;
		int b=1;
		int c=3;
				
		MiClase clase=new MiClase();
		int resultado=clase.numero_mayor(1,1,3);
		int esp=3;
		assertEquals(resultado,esp);
	}
	
	
@Test	
void testNumero_mayor3() {
		
		int a=1;
		int b=4;
		int c=2;
				
		MiClase clase=new MiClase();
		int resultado=clase.numero_mayor(1,4,2);
		int esp=4;
		assertEquals(resultado,esp);
	}

}
