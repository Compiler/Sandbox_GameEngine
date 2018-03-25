package sandbox.com.map;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class MapGrid {
	
	
	
	public static Vector2 MAP_DIMENSIONS = new Vector2(100, 100);
	public static int CELL_SIZE = 20;
	private Object mapItems[][];
	public MapGrid(){
		
		
		mapItems = new Object[(int) MAP_DIMENSIONS.x][(int) MAP_DIMENSIONS.y];
		
	}
	
	
	public void renderDebug(ShapeRenderer render){
		for(int i = 0; i < MAP_DIMENSIONS.x; i++){
			for(int k = 0; k < MAP_DIMENSIONS.y; k++){
				render.rect(i * CELL_SIZE, k * CELL_SIZE, CELL_SIZE, CELL_SIZE);
				
			}
		}
		
	}

}
