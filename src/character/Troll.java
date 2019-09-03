package character;

import Weapon.Weaponbehavior;

public class Troll extends Character {
	
	public Troll(Weaponbehavior w){
		weaponbehavior = w;
		
	}

	@Override
	public void fight() {
		System.out.println("Troll lutando");

	}

}
