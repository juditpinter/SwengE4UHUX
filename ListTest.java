package list_colors;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

public class ListTest {

	private List colors = new List();

	@Before

	public void init()

	{

		this.colors.add("Blue");
		this.colors.add("Red");
		this.colors.add("Brown");
		this.colors.add("Yellow");
		this.colors.add("Purle");
		this.colors.add("Pink");
		this.colors.add("White");
		this.colors.add("Black");
		this.colors.add("Silver");
		this.colors.add("Gold");
		this.colors.add("Green");
		this.colors.add("Turquoise");

	}
	
	@Test
	   public void testSize(){
	   assertEquals("Méret ellenőrzése",12,colors.size());
	   //Teszteli, hogy a listám mérete egyezik e 12-vel.
	    }

	@Test

	public void testEmpty() {
		assertFalse(this.colors.isEmpty()); 
		//Ellenőrzi, hogy hamis e az hogy a listám üres.
	}

	@Test

	public void testAdd()

	{

		this.colors.add("Burgundy");
		assertEquals("Új szin hozzáadása:", 13, this.colors.size());
		//Az adott új szín bekerülhet e a 13. színként a listába

	}

	@Test(expected = NoSuchElementException.class)

	public void removeTestNotExist() {
		this.colors.remove("Yellow"); 
		//Töröl egy nem létező színt
	}

	@Test

	public void removeAllTest()

	{

		this.colors.removeAll();
		assertTrue(this.colors.isEmpty()); 
		//Teszt a lista törlésének metódusára.

	}

	@After

	public void destroy() {
		this.colors.removeAll();
		//Minden teszt után lefut és kiüríti a listát.
	}

}