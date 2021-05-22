package net.brattlof.angelclient;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;

public class AngelClient implements ModInitializer
{
	public static final File FOLDER = new File(FabricLoader.getInstance().getGameDir().toString(), "angel-client");

	@Override
	public void onInitialize()
	{
		System.out.println(FOLDER);
	}
}
