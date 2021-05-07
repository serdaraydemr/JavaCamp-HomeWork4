package eticaretDemo.core;

import googleLogger.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements GoogleService{

	@Override
	public void ggoogleAdapter(String message) {
		GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
		googleLoggerManager.googleAdapter(message);
		
		
		
	}

	
		
	}


