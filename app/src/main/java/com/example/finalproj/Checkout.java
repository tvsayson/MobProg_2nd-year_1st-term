package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Checkout extends AppCompatActivity {

    private Button[] group1Buttons;
    private Button[] group2Buttons;
    private Button[] group3Buttons;
    private Button[] currentlyHighlightedGroup1Button = new Button[1];
    private Button[] currentlyHighlightedGroup2Button = new Button[1];
    private Button[] currentlyHighlightedGroup3Button = new Button[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        // Create the custom background for the buttons
        Button button1 = findViewById(R.id.button1);
        button1.setBackgroundResource(R.drawable.custom_button);

        Button button2 = findViewById(R.id.button2);
        button2.setBackgroundResource(R.drawable.custom_button2);

        // Create the other buttons and assign their custom backgrounds similarly
        Button button3 = findViewById(R.id.button3);
        button3.setBackgroundResource(R.drawable.custom_button3);

        Button button4 = findViewById(R.id.button4);
        button4.setBackgroundResource(R.drawable.custom_button4);

        Button button5 = findViewById(R.id.button5);
        button5.setBackgroundResource(R.drawable.custom_button5);

        Button button6 = findViewById(R.id.button6);
        button6.setBackgroundResource(R.drawable.custom_button6);

        Button button7 = findViewById(R.id.button7);
        button7.setBackgroundResource(R.drawable.custom_button7);

        // Continue creating and setting backgrounds for other buttons as needed

        group1Buttons = new Button[]{button1, button2, button3};
        group2Buttons = new Button[]{button4, button5};
        group3Buttons = new Button[]{button6, button7};

        setButtonGroupListeners(group1Buttons, currentlyHighlightedGroup1Button);
        setButtonGroupListeners(group2Buttons, currentlyHighlightedGroup2Button);
        setButtonGroupListeners(group3Buttons, currentlyHighlightedGroup3Button);
    }

    private void setButtonGroupListeners(Button[] buttons, final Button[] currentlyHighlightedButton) {
        for (Button button : buttons) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentlyHighlightedButton[0] != null) {
                        unhighlightButton(currentlyHighlightedButton[0]);
                    }
                    highlightButton(button);
                    currentlyHighlightedButton[0] = button;
                }
            });
        }
    }

    private void highlightButton(Button button) {
        int buttonId = button.getId();
        int unhighlightedBackgroundResId = R.drawable.highlighted_button; // Default highlighted background

        if (buttonId == R.id.button2) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button2;
        }
        if (buttonId == R.id.button3) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button3;
        }
        if (buttonId == R.id.button4) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button4;
        }
        if (buttonId == R.id.button5) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button5;
        }
        if (buttonId == R.id.button6) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button6;
        }
        if (buttonId == R.id.button7) {
            unhighlightedBackgroundResId = R.drawable.highlighted_button7;
        }
        // Add more conditions for other buttons if needed

        button.setBackgroundResource(unhighlightedBackgroundResId);
    }

    private void unhighlightButton(Button button) {
        int buttonId = button.getId();
        int unhighlightedBackgroundResId = R.drawable.custom_button; // Default unhighlighted background

        if (buttonId == R.id.button2) {
            unhighlightedBackgroundResId = R.drawable.custom_button2;
        }
        if (buttonId == R.id.button3) {
            unhighlightedBackgroundResId = R.drawable.custom_button3;
        }
        if (buttonId == R.id.button4) {
            unhighlightedBackgroundResId = R.drawable.custom_button4;
        }
        if (buttonId == R.id.button5) {
            unhighlightedBackgroundResId = R.drawable.custom_button5;
        }
        if (buttonId == R.id.button6) {
            unhighlightedBackgroundResId = R.drawable.custom_button6;
        }
        if (buttonId == R.id.button7) {
            unhighlightedBackgroundResId = R.drawable.custom_button7;
        }
        // Add more conditions for other buttons if needed

        button.setBackgroundResource(unhighlightedBackgroundResId);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
    public void checkout(View view) {
        Intent intent = new Intent(this, Shipping_Address.class);
        startActivity(intent);
    }

}
