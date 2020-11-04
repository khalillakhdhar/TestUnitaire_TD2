package testes;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
public class Testes {
@Test
public void zero()
{
Validation v=new Validation();
Assert.assertEquals(true, v.division(4, 1));
}
@Test
public void difference()
{
	Validation v=new Validation();
Assert.assertEquals(true, v.soustraire(7, 6));
}
@Test
public void diff()
{
	Validation v=new Validation();
Assert.assertEquals(true, v.difference(14,16));	

}
@Test
@Ignore
public void paire()
{
	Validation v=new Validation();
Assert.assertEquals(true, v.parite(5));	
}
public static void main(String args[])
{
	System.out.println("je teste");


}

}
