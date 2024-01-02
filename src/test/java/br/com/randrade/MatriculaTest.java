/**
 * 
 */
package br.com.randrade;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.randrade.dao.IMatriculaDAO;
import br.com.randrade.dao.MatriculaDAO;
import br.com.randrade.domain.Matricula;

/**
 * @author rafael.andrade
 */
public class MatriculaTest {
	
	private IMatriculaDAO matriculaDAO;
	
	public MatriculaTest() {
		matriculaDAO = new MatriculaDAO();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		matriculaDAO.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
		
	}
}
