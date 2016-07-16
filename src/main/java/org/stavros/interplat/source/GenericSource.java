package org.stavros.interplat.source;

import java.io.FileNotFoundException;

import org.stavros.interplat.model.Model;

public interface GenericSource {
	
	void connect();
	
	Model getData(GenericQuery query) throws FileNotFoundException;
	
	void close();

}
