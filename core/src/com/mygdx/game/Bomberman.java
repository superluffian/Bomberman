package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.model.World;

public class Bomberman extends ApplicationAdapter implements InputProcessor {
	private World world;
	private WorldRenderer renderer;
	private WorldController controller;
	
	@Override
	public void create () {
		world = new World();
		renderer = new WorldRenderer(world);
		controller = new WorldController(world);
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		controller.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(0.86f, 0.63f, 0.09f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render();
	}
	
	@Override
    public boolean keyDown(int keycode) {
		controller.keyDown(keycode);
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
    	controller.keyUp(keycode);
        return true;
    }
	
	@Override
    public boolean keyTyped(char character) {
        return false;
    }
	
	@Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }
	
	@Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
	
	@Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }
	
	@Override
    public boolean scrolled(int amount) {
        return false;
    }
}
