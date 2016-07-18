package org.stavros.interplat.source;

import org.stavros.interplat.model.Model;

public abstract class DefaultSource implements GenericSource {
	
	@Override
	public Model getData(GenericQuery query) throws GenericException {
		connect();
		
		Model model = null;
		
		try {
			model = filter(query);
		}
		catch(Exception exception) {
			throw new GenericException(exception);
		}
		
		close();
		
		return model;
	}

}
