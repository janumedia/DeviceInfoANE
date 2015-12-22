package com.janumedia.ane.deviceinfo;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

/**
 * DeviceInfoExtension.java
 * DeviceInfoANE
 *
 * Created by I Nengah Januartha on Nov 14, 2014
 * Copyright (c) 2014 I Nengah Januartha. All rights reserved.
 */

public class DeviceInfoExtension implements FREExtension {

	/* (non-Javadoc)
	 * @see com.adobe.fre.FREExtension#createContext(java.lang.String)
	 */
	@Override
	public FREContext createContext(String args) {
		return new DeviceInfoContext();
	}

	/* (non-Javadoc)
	 * @see com.adobe.fre.FREExtension#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.adobe.fre.FREExtension#initialize()
	 */
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
