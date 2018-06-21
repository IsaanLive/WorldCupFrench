package com.sentosatech.worldcup2014fr.modelmanager;

public interface ModelManagerListener {

	public void onWSError();

	public void OnSuccess(String json);
}
