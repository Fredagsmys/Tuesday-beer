package com.example.draganddrop;

import android.app.Activity;
import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button dragButton;
    LinearLayout bottomLayout;
    LinearLayout topLayout;
    Drawable bg;
    Drawable dropbg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dragButton = findViewById(R.id.dragButton);
        bottomLayout = findViewById(R.id.bottomLayout);
        topLayout = findViewById(R.id.topLayout);


        //Listeners
        topLayout.setOnDragListener(new MyDragListener());
        bottomLayout.setOnDragListener(new MyDragListener());
        dragButton.setOnTouchListener(new MyTouchListener());
        bg = topLayout.getBackground();
        dropbg = bg;
        dropbg.setAlpha(9);

    }

    private final class MyTouchListener implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                        view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            } else {
                return false;
            }
        }
    }

    class MyDragListener implements OnDragListener {
        Drawable enterShape = getResources().getDrawable(
                R.drawable.shape_droptarget);
        Drawable normalShape = getResources().getDrawable(R.drawable.shape);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            LinearLayout L = (LinearLayout) v;
            DropTarget target = new DropTarget(MainActivity.this);
            switch (action) {

                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;

                case DragEvent.ACTION_DRAG_ENTERED:
                    //Drar in knappen i layouten
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    //drar ur knappen ur layout
                    break;

                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    container.removeView(target);
                    break;

                case DragEvent.ACTION_DRAG_ENDED:
                    //slutet av allt
                    break;

                default:
                    break;
            }
            return true;
        }
    }
}