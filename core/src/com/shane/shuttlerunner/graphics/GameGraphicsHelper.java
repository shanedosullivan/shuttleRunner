package com.shane.shuttlerunner.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameGraphicsHelper {
	
	public void draw(SpriteBatch batch){
		batch = new SpriteBatch();
		
		Texture spaceShipImage = new Texture("spaceShip.png");
		TextureRegion spaceShipImageRegion = new TextureRegion(spaceShipImage);
		
		Texture background1 = new Texture("space.png");
		TextureRegion backgroundImageRegion = new TextureRegion(background1);
		
		Texture enemy1 = new Texture("enemy1.png");
		TextureRegion enemy1ImageRegion = new TextureRegion(enemy1);
		
		batch.begin();
		batch.draw(backgroundImageRegion, 0, 0);
		batch.draw(spaceShipImageRegion, 0, 0, 50, 60);
		batch.draw(enemy1ImageRegion, 0, 300, 50, 60);
		batch.end();
	}
}
