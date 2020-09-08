package Model;

import java.util.ArrayList;

public class PlayerPosition {
	
	private String position;
	
	public PlayerPosition() {
		super();
	}

	public PlayerPosition(String label) {
		super();
		this.position = label;
	}
	
	public void setPosition(String label) {
		this.position = label;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public String toString() {
		return this.position;
	}

}
