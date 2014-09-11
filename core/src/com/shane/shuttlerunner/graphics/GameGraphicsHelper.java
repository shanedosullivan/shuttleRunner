package com.shane.shuttlerunner.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.shane.shuttlerunner.IGraphic;

public class GameGraphicsHelper {
	
	Texture spaceShipImage;
	Sprite spaceShipImageRegion;
	Texture background1;
	TextureRegion backgroundImageRegion;
	Texture enemy1;
	Sprite enemy1ImageRegion;
	Animation spaceShipAnimation;
	float spaceShipStateTime = 0;
	
	public void draw(SpriteBatch batch, IGraphic graphic){
		batch = new SpriteBatch();

		spaceShipImageRegion = new Sprite(graphic.getImage());
		
		background1 = new Texture("space.png");
		backgroundImageRegion = new TextureRegion(background1);
		
		enemy1 = new Texture("enemy1.png");
		enemy1ImageRegion = new Sprite(enemy1);
		
		spaceShipAnimation = new Animation(0.05f, spaceShipImageRegion);
		
		batch.begin();
		batch.draw(backgroundImageRegion, 0, 0);
		batch.draw(spaceShipAnimation.getKeyFrame(spaceShipStateTime), graphic.getPositionVector().x, graphic.getPositionVector().y, 50, 60);
		//spaceShipImageRegion.draw(batch);
		batch.draw(enemy1ImageRegion, 0, 300, 50, 60);
		batch.end();
	}
	

}
