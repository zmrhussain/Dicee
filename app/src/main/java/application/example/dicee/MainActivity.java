package application.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;

        rollbutton = (Button) findViewById(R.id.roll_button);

        final ImageView leftdicee = (ImageView) findViewById(R.id.image_leftDicee);

        final ImageView rightdicee = (ImageView) findViewById(R.id.image_rightDicee);

        final int[] diceArray ={
                R.mipmap.dice1,
                R.mipmap.dice2,
                R.mipmap.dice3,
                R.mipmap.dice4,
                R.mipmap.dice5,
                R.mipmap.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee" , "Ze button has been pressed");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee" , "The number is " +number);

                leftdicee.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightdicee.setImageResource(diceArray[number]);
            }
        });

    }
}
