package character;

import Weapon.Weaponbehavior;

public class Knight extends Character {
	
	public Knight(Weaponbehavior w) {
		weaponbehavior = w;
		
	}

	@Override
	public void fight() {
		System.out.println("Knight lutando");

	}

}
