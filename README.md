This is a demo Native Extension to get Android device information

Extension ID
---------
```
<extensionID>com.janumedia.ane.deviceinfo</extensionID>
```

Usage
---------

```
var d:DeviceInfo = DeviceInfoExtension.instance.deviceInfo;
			
trace("brand", d.brand);
trace("device", d.device);
trace("manufacturer", d.manufacturer);
trace("model", d.model);
trace("product", d.product);
trace("sdkVersion", d.sdkVersion);
trace("density", d.density);
trace("densityDpi", d.densityDpi);
trace("heightPixels", d.heightPixels);
trace("widthPixels", d.widthPixels);


Feel FREE to use , distribute or update ! :)