package com.github.cbuschka.mykubewatch;

import io.kubernetes.client.ApiException;

import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException, ApiException
	{
		MyKubeWatchMain myKubeWatch = new MyKubeWatchMain();
		myKubeWatch.run();
	}
}