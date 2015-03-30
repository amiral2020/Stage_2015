package design.pattern.state.door.allstates;

import design.pattern.state.door.Door2;
import design.pattern.state.door.DoorState;

public class DoorStayOpen extends DoorState {

	public DoorStayOpen(Door2 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.CLOSING);
	}

}
