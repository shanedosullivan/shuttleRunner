package com.shane.shuttlerunner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public interface IGraphic {

	public Texture getImage();

	public void setImage(Texture image);

	public Vector2 getPositionVector();

	public void setPositionVector(Vector2 positionVector);

	
	
}
