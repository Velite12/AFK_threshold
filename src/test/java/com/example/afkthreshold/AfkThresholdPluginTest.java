package com.example.afkthreshold;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AfkThresholdPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AfkThresholdPlugin.class);
		RuneLite.main(args);
	}
}