package com.appsomniac.resizablerectanglecanvas.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.appsomniac.resizablerectanglecanvas.R;
import com.appsomniac.resizablerectanglecanvas.customviews.BallManager;

import java.util.ArrayList;

public class ResizableRectangleActivity extends Activity {

	public  static int flag = 0;
	//this arraylist will hold the coordinates of the balls in canvas OnTOuchEvent
	public static ArrayList<BallManager> al_ball_manager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resizable_rectangle_activity);
		al_ball_manager = new ArrayList<>();

		TextView save_button = findViewById(R.id.save_button);
		save_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				try {
					//flag = 1;
					Log.e("0: X--> ", String.valueOf(al_ball_manager.get(0).getBall_x_corr()));
					Log.e("0: Y--> ", String.valueOf(al_ball_manager.get(0).getBall_y_corr()));

					Log.e("1: X--> ", String.valueOf(al_ball_manager.get(1).getBall_x_corr()));
					Log.e("1: Y--> ", String.valueOf(al_ball_manager.get(1).getBall_y_corr()));

					Log.e("2: X--> ", String.valueOf(al_ball_manager.get(2).getBall_x_corr()));
					Log.e("2: Y--> ", String.valueOf(al_ball_manager.get(2).getBall_y_corr()));

					Log.e("3: X--> ", String.valueOf(al_ball_manager.get(3).getBall_x_corr()));
					Log.e("3: Y--> ", String.valueOf(al_ball_manager.get(3).getBall_y_corr()));

				}catch (IndexOutOfBoundsException e){
					e.printStackTrace();
				}

			}
		});
	}
}
