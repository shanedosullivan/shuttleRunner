package com.shane.shuttlerunner.mechanics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.shane.shuttlerunner.IGraphic;

public class GameMechanicsHelper {
	
	public void setStartPositionsToZero(IGraphic graphic){
		graphic.getPositionVector().set(0, 0);
		
	}
	
	public Vector2 updatePositionVector(IGraphic graphic){
		Vector2 vector = graphic.getPositionVector();
		float xPosition = vector.x;
		
		if(Gdx.input.isKeyPressed(Keys.NUM_4)){
			xPosition = xPosition - 1.0f;			
		}
		
		if(Gdx.input.isKeyPressed(Keys.NUM_6)){
			xPosition = xPosition + 1.0f;			
		}
		
		vector.set(xPosition, vector.y);
		return vector;
	}
}
