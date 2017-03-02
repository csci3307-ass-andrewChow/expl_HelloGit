/**
 * 
 */
package com.mycompany.exp1;

import com.mycompany.exp1.dragon.*;

import com.mycompany.exp1.village.Village;

/**
 * @author efaxb
 *
 */
public class MainEntry {
	public static void main (String[] args)
	{
		Dragon dragonMushu = new Mushu();
		Village village2eat = new Village(2);
		Dragon dragonSpyro = new Spyro(village2eat);

		
	}

}
