package com.shane.shuttlerunner;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.shane.shuttlerunner.domain.Spaceship;
import com.shane.shuttlerunner.graphics.GameGraphicsHelper;
import com.shane.shuttlerunner.graphics.GraphicTweenAccessor;
import com.shane.shuttlerunner.mechanics.GameMechanicsHelper;

public class GameDriver extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	GameGraphicsHelper graphicsHelper;
	GameMechanicsHelper mechanicsHelper;
	IGraphic spaceship;
	TweenManager tweenManager;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		spaceship = new Spaceship();
		graphicsHelper = new GameGraphicsHelper();
		mechanicsHelper = new GameMechanicsHelper();
		
		tweenManager = new TweenManager();
		
		Tween.registerAccessor(Spaceship.class, new GraphicTweenAccessor()); 
	}

	@Override
	public void render () {

		mechanicsHelper.updatePositionVector(spaceship, tweenManager);
		graphicsHelper.draw(batch, spaceship);
	}
}
