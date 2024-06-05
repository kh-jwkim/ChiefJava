package org.chief.day13.collection.music.model;

import java.util.Comparator;

public class DescTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle()) * -1;
	}

}
