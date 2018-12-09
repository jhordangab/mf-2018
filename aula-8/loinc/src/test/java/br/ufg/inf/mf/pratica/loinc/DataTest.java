package br.ufg.inf.mf.pratica.loinc;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class DataTest extends TestCase {
	@Test
    public void testRightDriver() {
        assertTrue(Data.CarregarDriver("com.mysql.cj.jdbc.Driver"));
    }
	
	@Test
    public void testWrongDriver() {
		assertTrue(!Data.CarregarDriver("com.mysql.jg.jdbc.Driver"));
    }
	
	@Test
    public void testWrongConnection() {
		String url = "jdbc:mysql://www.db4free.net/mf18loinc?verifyServerCertificate=false&useSSL=true";
		assertEquals(Data.obtemConexao(url, "mf18cacloinc", "qr3fdcacas#m@s"), null);
    }
	
	@Test
    public void testClassReturn() {
        ArrayList<Loinc> data = Data.getAllData("loinc_num = '10000-8'");
        assertEquals(data.get(0).getClasse(), "EKG.MEAS");
    }
	
	@Test
    public void testLimitMethod() {
        ArrayList<Loinc> data = Data.getDataWithLimit("loinc_num = '10000-8'", 1);
        assertEquals(data.size(), 1);
    }

	@Test
    public void testSelectedFieldMethod() {
        ArrayList<Loinc> data = Data.getDataWithSelectedField("loinc_num = '10000-8'", "loinc_num");
    }

	@Test
    public void testSelectedFieldMethodNull() {
        ArrayList<Loinc> data = Data.getDataWithSelectedField("loinc_num = '10000-8'", "loinc_num");
    }
}
