package com.janumedia.ane.deviceinfo;

import java.util.HashMap;
import java.util.Map;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;

import com.adobe.fre.FREASErrorException;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FRENoSuchNameException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREReadOnlyException;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

/**
 * DeviceInfoContext.java
 * DeviceInfoANE
 *
 * Created by I Nengah Januartha on Nov 14, 2014
 * Copyright (c) 2014 I Nengah Januartha. All rights reserved.
 */

public class DeviceInfoContext extends FREContext {

	/* (non-Javadoc)
	 * @see com.adobe.fre.FREContext#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.adobe.fre.FREContext#getFunctions()
	 */
	@Override
	public Map<String, FREFunction> getFunctions() {
		
		Map<String, FREFunction> map = new HashMap<String, FREFunction>();
	    
	    map.put("getDeviceInfo", getDeviceInfo());
	    
	    return map;
	}

	private FREFunction getDeviceInfo() {
		return new FREFunction() {
			
			@Override
			public FREObject call(FREContext ctx, FREObject[] args) {
				try {
					
					FREObject deviceInfo = FREObject.newObject("com.janumedia.ane.deviceinfo.DeviceInfo", null);
					deviceInfo.setProperty("model", FREObject.newObject(Build.MODEL));
			        deviceInfo.setProperty("manufacturer", FREObject.newObject(Build.MANUFACTURER));
			        deviceInfo.setProperty("device", FREObject.newObject(Build.DEVICE));
			        deviceInfo.setProperty("product", FREObject.newObject(Build.PRODUCT));
			        deviceInfo.setProperty("brand", FREObject.newObject(Build.BRAND));
			        deviceInfo.setProperty("sdkVersion", FREObject.newObject(Build.VERSION.SDK_INT));
			          
			        DisplayMetrics metrics = new DisplayMetrics();
			        Display display = ctx.getActivity().getWindow().getWindowManager().getDefaultDisplay();
			        display.getMetrics(metrics);
			          
			        deviceInfo.setProperty("density", FREObject.newObject(metrics.density));
			        deviceInfo.setProperty("densityDpi", FREObject.newObject(metrics.densityDpi));
			        deviceInfo.setProperty("heightPixels", FREObject.newObject(metrics.heightPixels));
			        deviceInfo.setProperty("widthPixels", FREObject.newObject(metrics.widthPixels));
			          
			        return deviceInfo;
			        
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FRETypeMismatchException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FREInvalidObjectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FREASErrorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FRENoSuchNameException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FREWrongThreadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FREReadOnlyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		};
	}

}
