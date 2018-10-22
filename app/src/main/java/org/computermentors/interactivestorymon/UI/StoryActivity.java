package org.computermentors.interactivestorymon.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.computermentors.interactivestorymon.Model.Story;
import org.computermentors.interactivestorymon.R;

public class StoryActivity extends AppCompatActivity {

    private String name;
    private ImageView storyImageView;
    private TextView storyTextView;
    private Button choiceButton1;
    private Button choiceButton2;
    private Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        storyImageView = findViewById(R.id.storyImageView);
        storyTextView = findViewById(R.id.storyTextView);
        choiceButton1 = findViewById(R.id.choice1Button);
        choiceButton2 = findViewById(R.id.choice2Button);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        if(name == null || name.isEmpty()){
            name = "Friend";
        }

        story = new Story();

    }
}
