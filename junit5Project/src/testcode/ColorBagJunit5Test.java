package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

/*
 * The @BeforeEach annotation denotes that the annotated method should be
 *  executed before each @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods 
 *  in the current class. It is executed only once.
 */

class ColorBagJunit5Test {
	
	private ColorBag colorBag;
	

	@BeforeEach
	void setUp() throws Exception {
		colorBag=new ColorBag();
		colorBag.add("red");
		colorBag.add("yellow");
		colorBag.add("green");
		colorBag.add("white");
		colorBag.add("orange");
		colorBag.add("purple");
	}

	@Test
	@DisplayName("Added color should be in a bag")
	void testAdd() {
		var newColor="Pink";
		colorBag.add(newColor);
		assertTrue(colorBag.contains(newColor), "failure");
	}

	@Test
	@DisplayName("removed color shold not be in the bag")
	void testRemove() {
		var color="white";
		colorBag.remove(color);
		assertFalse(colorBag.contains(color), "failure");
	}

	@Test
	@DisplayName("color bag should be transformed into list")
	void testToList() {

		var myList=Arrays.asList("red","yellow","green","white","orange","purple");	
		var colorList=colorBag.toList();
		
		Collections.sort(myList);
		Collections.sort(colorList);
		assertEquals(colorList,myList, "failure");

	}

	
	

	@Test
	void testSize() {
		int bSize=colorBag.size();
		assertEquals(6, bSize,"failure");
	}

}
