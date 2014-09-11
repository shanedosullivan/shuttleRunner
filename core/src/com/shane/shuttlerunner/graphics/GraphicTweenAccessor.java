package com.shane.shuttlerunner.graphics;

import aurelienribon.tweenengine.TweenAccessor;

import com.badlogic.gdx.math.Vector2;
import com.shane.shuttlerunner.IGraphic;
import com.shane.shuttlerunner.domain.Spaceship;

public class GraphicTweenAccessor implements TweenAccessor<IGraphic>{

	public static final int POSITION_XY =1;
	
	@Override
	public int getValues(IGraphic sprite, int tweenType, float[] resultValues) {
		
		switch(tweenType){
			case POSITION_XY:
				resultValues[0] = sprite.getPositionVector().x;
				resultValues[1] = sprite.getPositionVector().y;
				return 2;
				
			default: 
				assert false; 
				return -1;
		}
	}

	@Override
	public void setValues(IGraphic sprite, int tweenType, float[] resultValues) {
		
		switch(tweenType){
		case POSITION_XY:
			Vector2 positionVector = new Vector2(resultValues[0], resultValues[1]);
			sprite.setPositionVector(positionVector);
			
		default:
			assert false;
		}
		
	}

}
