/**
 * 
 */
package com.mycompany.exp1.dragon;
import com.mycompany.exp1.village.Village;

/**
 * @author efaxb
 *
 */
public class Mushu implements Dragon {

	/* (non-Javadoc)
	 * @see exp1_HelloGit.exp1.dragon.Dragon#breathsFire()
	 */
	@Override
	public boolean breathsFire() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see exp1_HelloGit.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() {
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see exp1_HelloGit.exp1.dragon.Dragon#eatVillage(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village) {
		// TODO Auto-generated method stub
		return false;
	}

}
