package com.shane.shuttlerunner.mechanics;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.shane.shuttlerunner.IGraphic;
import com.shane.shuttlerunner.graphics.GraphicTweenAccessor;

public class GameMechanicsHelper {

	
	public void setStartPositionsToZero(IGraphic graphic){
		graphic.getPositionVector().set(0, 0);
		
	}

	public void updatePositionVector(IGraphic graphic, TweenManager tweenManager){
		Vector2 positionVector = graphic.getPositionVector();
		Vector2 velocityVector = graphic.getVelocityVector();
		
		float deltaTime = Gdx.graphics.getDeltaTime();
		float xPosition = positionVector.x;
		
		if(Gdx.input.isKeyPressed(Keys.NUM_4)){
			xPosition -= velocityVector.x * deltaTime;
			Tween.to(graphic, GraphicTweenAccessor.POSITION_XY, 1.0f).target(xPosition, positionVector.y).start(tweenManager);
		}
		
		if(Gdx.input.isKeyPressed(Keys.NUM_6)){
			xPosition += velocityVector.x * deltaTime;	
			Tween.to(graphic, GraphicTweenAccessor.POSITION_XY, 1.0f).target(xPosition, positionVector.y).start(tweenManager);
		}
		tweenManager.update(deltaTime);
		positionVector.set(xPosition, positionVector.y);
	}


}
