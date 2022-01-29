package net.runelite.client.plugins.privateserver;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("privateserver")

public interface PrivateServerConfig extends Config
{
	@ConfigItem(
			keyName = "modulus",
			name = "Key (modulus)",
			description = "RSA key used by the RSPS you wish to connect to.",
			position = 1
	)
	default String modulus()
	{
		return "";
	}

}