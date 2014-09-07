package com.shane.shuttlerunner;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.shane.shuttlerunner.domain.Spaceship;
import com.shane.shuttlerunner.graphics.GameGraphicsHelper;
import com.shane.shuttlerunner.mechanics.GameMechanicsHelper;

public class GameDriver extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	GameGraphicsHelper graphicsHelper;
	GameMechanicsHelper mechanicsHelper;
	IGraphic spaceship;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		spaceship = new Spaceship();
		graphicsHelper = new GameGraphicsHelper();
		mechanicsHelper = new GameMechanicsHelper();
	}

	@Override
	public void render () {

		mechanicsHelper.updatePositionVector(spaceship);
		graphicsHelper.draw(batch, spaceship);
	}
}
