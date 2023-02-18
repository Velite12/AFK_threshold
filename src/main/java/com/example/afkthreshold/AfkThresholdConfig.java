package com.example.afkthreshold;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Units;

@ConfigGroup("afkthreshold")
public interface AfkThresholdConfig extends Config
{
	@ConfigItem(
			keyName = "afkThreshold",
			name = "AFK Threshold",
			description = "How long to wait until checking if the player is idle."
	)
	@Units(Units.SECONDS)
	default int afkThreshold()
	{
		return 40;
	}
	@ConfigItem(
			keyName = "postIdleTime",
			name = "Post Idle Time",
			description = "After Idle, how long to wait until sending a notification?"
	)
	@Units(Units.SECONDS)
	default int postIdleWait()
	{
		return 0;
	}

}
