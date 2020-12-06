package net.icanthink.spacemod.procedure;

import net.minecraft.client.gui.GuiTextField;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.HashMap;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureSaveSlot1Clicked extends ElementsSpaceMod.ModElement {
	public ProcedureSaveSlot1Clicked(ElementsSpaceMod instance) {
		super(instance, 45);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure SaveSlot1Clicked!");
			return;
		}
		HashMap guistate = (HashMap) dependencies.get("guistate");
		SpaceModVariables.ForceSlot1 = (String) (new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:forceability1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText());
	}
}
