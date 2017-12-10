package ch.epfl.cs107.play.game.actor.Levels;

import java.awt.Color;
import ch.epfl.cs107.play.game.actor.Actor;
import ch.epfl.cs107.play.game.actor.ActorGame;
import ch.epfl.cs107.play.game.actor.Level;
import ch.epfl.cs107.play.game.actor.general.Bascule;
import ch.epfl.cs107.play.game.actor.general.Bike;
import ch.epfl.cs107.play.game.actor.general.Crate;
import ch.epfl.cs107.play.game.actor.general.Emitter;
import ch.epfl.cs107.play.game.actor.general.Finish;
import ch.epfl.cs107.play.game.actor.general.Pendule;
import ch.epfl.cs107.play.game.actor.general.Terrain;
import ch.epfl.cs107.play.math.Polygon;
import ch.epfl.cs107.play.math.Polyline;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

public class BasicBikeGameLevel extends Level implements Actor {
	

	protected Bike bike;
	protected Finish flag;
	protected Terrain terrain;
	protected ActorGame game;
	protected Emitter emitter;
	protected Bascule bascule; 
	protected Pendule pendule;
	
	public BasicBikeGameLevel(ActorGame game) {
		this.game = game;
	}
	
	public void createAllActors() {
		terrain = new Terrain(game, new Polyline(
				-1000.0f, -1000.0f,
				-1000.0f, 0.0f,
				0.0f, 0.0f,
				3.0f, 1.0f,
				8.0f, 1.0f,
				15.0f, 3.0f,
				16.0f, 3.0f,
				25.0f, 0.0f,
				35.0f, -5.0f,
				50.0f, -5.0f,
				55.0f, -4.0f,
				65.0f, 0.0f,
				6500.0f, -1000.0f), Color.CYAN, Color.WHITE);
		bike = new Bike(game, new Vector(-5.0f, 10.0f)); 
		flag = new Finish(game, new Vector(50.0f, -4.0f));
		Polygon polygon = new Polygon (
				new Vector(0.0f, 0.0f),
				new Vector(0.0f, 3.0f),
				new Vector(3.0f, 3.0f),
				new Vector(3.0f, 0.0f)
				);
		bascule = new Bascule(game, false, new Vector(2.0f, 2.0f));
		pendule = new Pendule(game, false, new Vector(10.f , 15.0f));
		//emitter = new Emitter(game.getCanvas(), polygon, "fart03.png", 1.0f, 1.0f, new Vector(5.0f, -1.0f), 1.0f, 0.0f);
		game.addActor(terrain);
		game.addActor(bike);
		game.addActor(flag);
		game.addActor(bascule);
		game.addActor(pendule);
	}

	public void draw(Canvas canvas) {}
	
	public Bike getBike() {
		return bike;
	}
	
	public Terrain getTerrain() {
		return terrain;
	}
	
	public Finish getFlag() {
		return flag;
	}

	public Crate getCrate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bascule getBascule() {
		// TODO Auto-generated method stub
		return bascule;
	}

	@Override
	public Pendule getPendule() {
		// TODO Auto-generated method stub
		return pendule;
	}
}
