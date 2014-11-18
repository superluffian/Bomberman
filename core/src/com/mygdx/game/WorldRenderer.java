package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.model.World;

public class WorldRenderer {
	private World world;
	private SpriteBatch batch;
	private Texture tex_brick = new Texture("brick.png");
	private Texture tex_wall = new Texture("wall.png");
	private Texture tex_player = new Texture("player.png");
	private int unitSize;
	
	public WorldRenderer(World world) {
		this.world = world;
		this.unitSize = world.unitSize;
		batch = new SpriteBatch();
	}
	
	public void render() {
		batch.begin();
		for (int x = 0; x < world.mapWidth; x++) {
			for (int y = 0; y < world.mapHeight; y++) {
				if (world.map[x][y] == 1) {
					batch.draw(tex_brick, unitSize * x, unitSize * y);
				}
				else if (world.map[x][y] == 2) {
					batch.draw(tex_wall, unitSize * x, unitSize * y);
				}
			}
		}
		batch.draw(tex_player, world.player.position.x, world.player.position.y);
		batch.end();
	}
}
