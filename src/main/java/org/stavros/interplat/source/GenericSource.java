package org.stavros.interplat.source;

import org.stavros.interplat.model.Model;

public interface GenericSource {
	
	void connect();
	
	Model getData(GenericQuery query);
	
	void close();

}
