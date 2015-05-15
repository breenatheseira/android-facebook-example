package com.example.facebookexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


public class LoginFragment extends Fragment {
	LoginButton loginButton;
	CallbackManager callbackManager;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
	    View view = inflater.inflate(R.layout.fragment_login, container, false);

	    loginButton = (LoginButton) view.findViewById(R.id.login_button);
	    loginButton.setReadPermissions("user_friends");
	    // If using in a fragment
	    loginButton.setFragment(this);    
	    // Other app specific specialization

	    // Callback registration
	    loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
	        @Override
	        public void onSuccess(LoginResult loginResult) {
	            // App code
	        }

	        @Override
	        public void onCancel() {
	            // App code
	        }

	        @Override
	        public void onError(FacebookException exception) {
	            // App code
	        }
	    });    
	    
	    return view;
	}

}
