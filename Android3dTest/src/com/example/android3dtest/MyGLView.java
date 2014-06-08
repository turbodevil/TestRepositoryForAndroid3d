package com.example.android3dtest;

import android.content.Context;
import android.opengl.GLSurfaceView;

class MyGLView extends GLSurfaceView {
	private final MyGLRenderer renderer;
	MyGLView(Context context) {
		super(context);
		renderer = new MyGLRenderer(context);
		setRenderer(renderer);
	}
}