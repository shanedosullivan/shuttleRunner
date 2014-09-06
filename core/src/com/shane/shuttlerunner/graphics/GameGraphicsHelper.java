package com.shane.shuttlerunner.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameGraphicsHelper {
	
	Texture spaceShipImage;
	TextureRegion spaceShipImageRegion;
	Texture background1;
	TextureRegion backgroundImageRegion;
	Texture enemy1;
	TextureRegion enemy1ImageRegion;
	Animation spaceShipAnimation;
	float spaceShipStateTime = 0;
	
	public void draw(SpriteBatch batch){
		batch = new SpriteBatch();
		
		spaceShipImage = new Texture("spaceShip.png");
		spaceShipImageRegion = new TextureRegion(spaceShipImage);
		
		background1 = new Texture("space.png");
		backgroundImageRegion = new TextureRegion(background1);
		
		enemy1 = new Texture("enemy1.png");
		enemy1ImageRegion = new TextureRegion(enemy1);
		
		spaceShipAnimation = new Animation(0.05f, spaceShipImageRegion);
		
		batch.begin();
		batch.draw(backgroundImageRegion, 0, 0);
		batch.draw(spaceShipAnimation.getKeyFrame(spaceShipStateTime), 0, 0, 50, 60);
		batch.draw(enemy1ImageRegion, 0, 300, 50, 60);
		batch.end();
	}
	

}
