package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	//Texture img;
	Texture fondo;
	Texture p1;
	Texture p2;
	Texture p3;
	Texture p4;
	Texture hongo;
	Texture cloud;
	Texture arbusto;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		fondo = new Texture("fondo.png");
		//player = new Texture("player.png");
		arbusto = new Texture("arbusto.png");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);
		batch.draw(fondo, 0, 0);
		batch.draw(arbusto, 50, 0);
		batch.end();


		batch.end();
	}
}
