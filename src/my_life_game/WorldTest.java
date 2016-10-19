package my_life_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldTest {
	private static World world = new World();
	private final int[][] map ={
			{1,1,1},
			{1,1,1},
			{1,1,1}
	};
	private final int[][] map1 ={
			{1,1,1},
			{1,1,1},
			{1,1,1}
	};
	private final int[][] map2 ={
			{1,0,1},
			{0,0,0},
			{1,0,1}
	};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStartAnimation() {
		int is=0;
		try{
			world.startAnimation();
			is=1;
		}
		catch(Exception e){
			is = 0;
		}
		finally {
			assertEquals(is, 1);
		}
		
		
	}

	@Test
	public void testChangemap() {
		
		world.changemap(map, map1);

		assertArrayEquals(map, map2);
	}

	@Test
	public void testGetnext() {
		int num = world.getnext(0, 0, map);
		assertEquals(3,num);
		
	}

}
