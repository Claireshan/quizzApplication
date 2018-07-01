package e.claire.quizzapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** called when the start button is  clicked */
    public void startQuiz(View view){
        Intent intent = new Intent(this, question.class);
        Bundle bundle =new Bundle();
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
        intent.putExtras(bundle);

    }
    public void setQuit(View view) {
        Button quit = (Button) findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}
