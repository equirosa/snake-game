package com.zetcode.tl;

import com.zetcode.bl.apples.concrete.BlueApple;
import com.zetcode.bl.apples.concrete.RedApple;
import com.zetcode.bl.apples.concrete.YellowApple;
import com.zetcode.bl.apples.prototype.Apple;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AppleManager {
	private ArrayList<Apple> apples;

	public AppleManager(){
		apples = new ArrayList<>();
		apples.add(new RedApple());
		apples.add(new BlueApple());
		apples.add(new YellowApple());
	}

	public Apple getRandomApple(){
		int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
		return apples.get(randomNum);
	}
}
