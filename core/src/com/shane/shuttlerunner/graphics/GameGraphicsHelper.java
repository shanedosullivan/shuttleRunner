package com.shane.shuttlerunner.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.shane.shuttlerunner.IGraphic;
import com.shane.shuttlerunner.domain.Spaceship;

public class GameGraphicsHelper {
	
	Texture spaceShipImage;
	TextureRegion spaceShipImageRegion;
	Texture background1;
	TextureRegion backgroundImageRegion;
	Texture enemy1;
	TextureRegion enemy1ImageRegion;
	Animation spaceShipAnimation;
	float spaceShipStateTime = 0;
	
	public void draw(SpriteBatch batch, IGraphic spaceship){
		batch = new SpriteBatch();

		spaceShipImageRegion = new TextureRegion(spaceship.getImage());
		
		background1 = new Texture("space.png");
		backgroundImageRegion = new TextureRegion(background1);
		
		enemy1 = new Texture("enemy1.png");
		enemy1ImageRegion = new TextureRegion(enemy1);
		
		spaceShipAnimation = new Animation(0.05f, spaceShipImageRegion);
		
		batch.begin();
		batch.draw(backgroundImageRegion, 0, 0);
		batch.draw(spaceShipAnimation.getKeyFrame(spaceShipStateTime), spaceship.getPositionVector().x, spaceship.getPositionVector().y, 50, 60);
		batch.draw(enemy1ImageRegion, 0, 300, 50, 60);
		batch.end();
	}
	

}
