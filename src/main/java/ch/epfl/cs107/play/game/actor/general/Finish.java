package ch.epfl.cs107.play.game.actor.general;

import java.awt.Color;

import ch.epfl.cs107.play.game.actor.Actor;
import ch.epfl.cs107.play.game.actor.ActorGame;
import ch.epfl.cs107.play.game.actor.GameEntity;
import ch.epfl.cs107.play.game.actor.ImageGraphics;
import ch.epfl.cs107.play.game.actor.TextGraphics;
import ch.epfl.cs107.play.math.BasicContactListener;
import ch.epfl.cs107.play.math.PartBuilder;
import ch.epfl.cs107.play.math.Polygon;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

public class Finish extends GameEntity implements Actor {
	
	private PartBuilder partBuilder;
	private ImageGraphics graphics;
	private BasicContactListener listener;
	private TextGraphics message;
	
	public Finish(ActorGame game, Vector position) {
		super(game, true, position);
		partBuilder = getEntity().createPartBuilder();
		Polygon polygon = new Polygon(
				0.0f, 0.0f,
				1.0f, 0.0f,
				1.0f, 10.0f,
				0.0f, 10.0f
				);
		partBuilder.setShape(polygon);
		partBuilder.setGhost(true);
		partBuilder.build();
		graphics = new ImageGraphics("flag.blue.png", 2.0f, 2.0f);
		graphics.setParent(this);
		getOwner().addActor(this);
		listener = new BasicContactListener();
		this.getEntity().addContactListener(listener);

	}

	@Override
	public void draw(Canvas canvas) {
		graphics.draw(canvas);
	}
	
	public Finish getFlag() {
		return this;
	}
	
	public BasicContactListener getListener() {
		return listener;
	}
}
