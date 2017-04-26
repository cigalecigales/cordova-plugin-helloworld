package plugin.helloworld;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
// 外部ライブラリの読み込み
import hello.HelloWorldJar;

public class HelloWorld extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("sayHello")) {
            String name = data.getString(0);
            String message = HelloWorldJar.helloworld(name);
            callbackContext.success(message);
            return true;
        } else {
            return false;
        }
    }
}
