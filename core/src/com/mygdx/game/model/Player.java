package com.mygdx.game.model;

import com.badlogic.gdx.math.Vector2;

public class Player {
	public float speed = 64f;
	public Vector2 position = new Vector2();
	public Vector2 velocity = new Vector2(0, 0);
	public Vector2 dest = new Vector2();
	
	public Player(float x, float y) {
		position.x = x;
		position.y = y;
	}
	
	public void update(float delta) {
		position.mulAdd(velocity, delta);
	}
}
