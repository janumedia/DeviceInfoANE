package com.janumedia.ane.deviceinfo
{
	import flash.external.ExtensionContext;
	
	/**
	 * DeviceInfoExtension.as
	 * DeviceInfoANE
	 *
	 * Created by I Nengah Januartha on Nov 14, 2014
	 * Copyright (c) 2014 I Nengah Januartha. All rights reserved.
	 */
	
	public class DeviceInfoExtension
	{
		public static const EXTENSION_ID:String = "com.janumedia.ane.deviceinfo";
		
		private static var _instance:DeviceInfoExtension;
		private static var _forceSingleton:Boolean;
		
		private var _context:ExtensionContext;
		
		public function DeviceInfoExtension()
		{
			if(_instance || !_forceSingleton){
				throw new Error("DeviceInfoExtension is Singleton... use instance");
			}
			
			_instance = this;
			
			if (!_context) _context = ExtensionContext.createExtensionContext(EXTENSION_ID, null);
		}
		
		public static function get instance() : DeviceInfoExtension
		{
			_forceSingleton = true;
			
			if(!_instance){
				_instance = new DeviceInfoExtension();
			}
			
			return _instance;
		}
		
		public final function get deviceInfo () : DeviceInfo
		{
			if (!_context) return null;
			
			return _context.call("getDeviceInfo") as DeviceInfo;
		}
	}
}