package com.shane.shuttlerunner.domain;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.shane.shuttlerunner.IGraphic;

public class Spaceship implements IGraphic{
	
	private float xPosition = 0;
	private float yPosition = 0;
	private Vector2 spaceShipPositionVector = new Vector2(xPosition, yPosition);
	private Texture spaceShipImage = new Texture("spaceShip.png");
	
	@Override
	public Texture getImage() {
		return spaceShipImage;
	}
	
	@Override
	public void setImage(Texture image) {
		this.spaceShipImage = image;
	}

	@Override
	public Vector2 getPositionVector() {
		return spaceShipPositionVector;
	}

	@Override
	public void setPositionVector(Vector2 positionVector) {
		this.spaceShipPositionVector = positionVector;
	}
	
	
	
	
}
