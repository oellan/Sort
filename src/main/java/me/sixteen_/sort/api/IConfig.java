package me.sixteen_.sort.api;

import org.lwjgl.glfw.GLFW;

@FunctionalInterface
public interface IConfig {

	/**
	 * @return keyCode for key that will sort the container
	 */
	int getKeycode();

	/**
	 * @return keyCode for key R
	 */
	static int defaultConfig() {
		return GLFW.GLFW_KEY_R;
	}
}