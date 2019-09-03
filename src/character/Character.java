package character;

import Weapon.Weaponbehavior;

public abstract class Character {
	
	Weaponbehavior weaponbehavior;
	
	public abstract void fight();
	

	public void setWeaponbehavior(Weaponbehavior w) {
		this.weaponbehavior = w;
	}
	

}
