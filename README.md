# :sun_with_face: cordova-plugin-helloworld :full_moon_with_face:

## HelloWorld Cordova Plugin
This plugin can display message "Hello World".<br>
Very simple.
I created this to learn how to develop cordova plugin.

## How to use
Add plugin to your project.

```bash
$ cordova plugin add https://github.com/cigalecigales/cordova-plugin-helloworld.git
```

Call `sayHello` method

```js
document.addEventListener("deviceready", function() {
  var success = function(message) {
    alert(message);
  }

  var failure = function() {
    alert("Plugin error...");
  }

  hello.sayHello("SAMPLE NAME", success, failure);
});
```
