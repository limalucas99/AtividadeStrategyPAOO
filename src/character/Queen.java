package character;

import Weapon.Weaponbehavior;

public class Queen extends Character {
	
	public Queen(Weaponbehavior w){
		weaponbehavior = w;
		
	}

	@Override
	public void fight() {
		System.out.println("Queen lutando");

	}

}
