package sandbox.com.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import sandbox.com.map.MapGrid;

public class Core extends ApplicationAdapter {
	
	
	private SpriteBatch batch;
	private ShapeRenderer shapeRenderer;
	private OrthographicCamera cam;
	private World world;
	
	private MapGrid mapGrid;
	
	@Override
	public void create () {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.setToOrtho(false);
		world = new World(new Vector2(0, -9.81f), true);
		
		mapGrid = new MapGrid();
		
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setAutoShapeType(true);
	}

	@Override
	public void render () {
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		shapeRenderer.setProjectionMatrix(cam.combined);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		shapeRenderer.begin();
		mapGrid.renderDebug(shapeRenderer);
		shapeRenderer.end();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		
	}
}
