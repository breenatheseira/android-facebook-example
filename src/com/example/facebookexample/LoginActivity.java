package com.example.facebookexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;

public class LoginActivity extends FragmentActivity {
	CallbackManager callbackManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("FELA1", "created view");
		
		FacebookSdk.sdkInitialize(getApplicationContext());
		Log.d("FELA2", "init FBSDK");
		
		setContentView(R.layout.activity_login);
		
		callbackManager = CallbackManager.Factory.create();
	}
}
