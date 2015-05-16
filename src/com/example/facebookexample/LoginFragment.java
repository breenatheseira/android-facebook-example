package com.example.facebookexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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
	    Log.d("FE1", "Passed view inflater");
	    loginButton = (LoginButton) view.findViewById(R.id.login_button);
	    loginButton.setReadPermissions("user_friends");
	    
	    // If using in a fragment
	    loginButton.setFragment(this);    
	    // Other app specific specialization
	    Log.d("FE2", "set Fragment");
	    
	    return view;
	}

}
