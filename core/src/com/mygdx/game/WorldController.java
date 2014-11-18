package com.mygdx.game;

import com.badlogic.gdx.Input.Keys;
import com.mygdx.game.model.World;

public class WorldController {
	private World world;
	
	public WorldController(World world){
		this.world = world;
	}
	
	public void update (float delta) {
		world.player.update(delta);
	}
	
	public void keyDown(int keycode) {
		switch (keycode) {
		case Keys.RIGHT:
			world.player.velocity.set(world.player.speed, 0);
			break;
		case Keys.LEFT:
			world.player.velocity.set(-world.player.speed, 0);
			break;
		case Keys.UP:
			world.player.velocity.set(0, world.player.speed);
			break;
		case Keys.DOWN:
			world.player.velocity.set(0, -world.player.speed);
			break;
		}
	}
	
	public void keyUp(int keycode) {
		switch (keycode) {
		case Keys.RIGHT:
			if (world.player.velocity.x > 0) {
				world.player.velocity.x = 0;
			}
			break;
		case Keys.LEFT:
			if (world.player.velocity.x < 0) {
				world.player.velocity.x = 0;
			}
			break;
		case Keys.UP:
			if (world.player.velocity.y > 0) {
				world.player.velocity.y = 0;
			}
			break;
		case Keys.DOWN:
			if (world.player.velocity.y < 0) {
				world.player.velocity.y = 0;
			}
			break;
		}
	}
}
