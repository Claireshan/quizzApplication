package e.claire.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class scoreSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_summary);
        Intent intent = getIntent();
//
//        TextView score =(TextView) findViewById(R.id.score);
//        Bundle bundle =new Bundle();
//        TextView scores =(TextView) findViewById(R.id.textView);
//        String value = score.getText().toString();
//        bundle.putString("value", value);
//        scores.setText("Total score"+score);
//        intent.putExtra(EXTRA_MESSAGE, "");

    }
    public void setTry(View view) {
        Button quit = (Button) findViewById(R.id.again);
        quit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                  System.exit(0);
            }
        });

    }


}
