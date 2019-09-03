package character;

import Weapon.Weaponbehavior;

public class King extends Character {
	
	public King(Weaponbehavior w) {
		weaponbehavior=w;
		
	}

	@Override
	public void fight() {
	System.out.println("King lutando");

	}

}
