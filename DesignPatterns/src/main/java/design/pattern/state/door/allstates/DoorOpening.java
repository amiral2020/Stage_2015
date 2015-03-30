package design.pattern.state.door.allstates;

import design.pattern.state.door.Door2;
import design.pattern.state.door.DoorState;

public class DoorOpening extends DoorState {

	public DoorOpening(Door2 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.CLOSING);
	}
	
	public void compete(){
		door.setState(door.OPEN);
	}

}
