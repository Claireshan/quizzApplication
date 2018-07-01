package e.claire.quizzapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question extends AppCompatActivity {
    int counts=0;
    int nos=0;
    String qn="1. Brass gets discoloured in air because of the presence of which of the following gases in air?";
    String qn1="2. Which of the following is a non metal that remains liquid at room temperature";
    String qn2="3. Which of the following is used in pencils?";
    String qn3="4. The gas usually filled in the electric bulb is";
    String qn4="5. Washing soda is the common name for";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent = getIntent();

        final TextView count = (TextView) findViewById(R.id.timer);
        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                count.setText("00: "+millisUntilFinished / 1000+"");
            }

            public void onFinish() {
                count.setText("out of time");
            }
        }.start();

        TextView question =(TextView) findViewById(R.id.qn);
        Button ans1 =(Button) findViewById(R.id.button2);
        Button ans2 =(Button) findViewById(R.id.button);
        Button ans3 =(Button) findViewById(R.id.button3);
        Button ans4 =(Button) findViewById(R.id.button4);

        question.setText("1. Brass gets discoloured in air because of the presence of which of the following gases in air?");
        ans1.setText("Oxygen");
        ans2.setText("Hydrogen sulphide");
        ans3.setText("Carbon dioxide");
        ans4.setText("Nitrogen");

    }
    public void btnClick(View view){
       final TextView question =(TextView) findViewById(R.id.qn);
        final Button ans1 =(Button) findViewById(R.id.button);
        final Button ans2 =(Button) findViewById(R.id.button2);
        final Button ans3 =(Button) findViewById(R.id.button3);
        final Button ans4 =(Button) findViewById(R.id.button4);
       final Intent intents = new Intent(this, scoreSummary.class);

       ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nos < 5) {
                    nos = nos + 1;
                    qnCount(nos);

                    if (question.getText().toString().equals(qn)) {
                        counts = counts + 1;
                        countMark(counts);
                        question.setText(qn1);
                        ans1.setText("Phosphorous");
                        ans2.setText("Bromine");
                        ans3.setText("Chlorine");
                        ans4.setText("Helium");

                    } else if (question.getText().toString().equals(qn1)) {
                        counts = counts + 1;
                        countMark(counts);
                        question.setText(qn2);
                        ans1.setText("Graphite");
                        ans2.setText("Silicon");
                        ans3.setText("Charcoal");
                        ans4.setText("Phosphorous");

                    } else if (question.getText().toString().equals(qn2)) {
                        question.setText(qn3);
                        ans1.setText("oxygen");
                        ans2.setText("Hydrogen");
                        ans3.setText("Nitrogen");
                        ans4.setText("Cardon dioxide");

                    } else if (question.getText().toString().equals(qn3)) {
                        question.setText(qn4);
                        ans1.setText("Calcium bicarbonate");
                        ans2.setText("Sodium bicarbonate");
                        ans3.setText("Calcium carbonate");
                        ans4.setText("Sodium carbonate");

                    } else if (question.getText().toString().equals(qn4)) {
                        intents.putExtra(EXTRA_MESSAGE, "");
                        startActivity(intents);
                    }

                }
                else {
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }
            }

        });
        ans2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (nos < 5) {
                    nos = nos + 1;
                    qnCount(nos);
                if (question.getText().toString().equals(qn)) {

                    question.setText(qn1);
                    ans1.setText("Phosphorous");
                    ans2.setText("Bromine");
                    ans3.setText("Chlorine");
                    ans4.setText("Helium");

                }
                else if (question.getText().toString().equals(qn1)) {

                    question.setText(qn2);
                    ans1.setText("Graphite");
                    ans2.setText("Silicon");
                    ans3.setText("Charcoal");
                    ans4.setText("Phosphorous");

                }
                else if (question.getText().toString().equals(qn2)) {
                    counts=counts+1;
                    countMark(counts);
                    question.setText(qn3);
                    ans1.setText("oxygen");
                    ans2.setText("Hydrogen");
                    ans3.setText("Nitrogen");
                    ans4.setText("Cardon dioxide");

                }
                else if (question.getText().toString().equals(qn3)) {
                    question.setText(qn4);
                    ans1.setText("Calcium bicarbonate");
                    ans2.setText("Sodium bicarbonate");
                    ans3.setText("Calcium carbonate");
                    ans4.setText("Sodium carbonate");

                }
                else if (question.getText().toString().equals(qn4)) {
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }

                }
                else {
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    if (nos < 5) {
                        nos = nos + 1;
                        qnCount(nos);
                if (question.getText().toString().equals(qn)) {

                    question.setText(qn1);
                    ans1.setText("Phosphorous");
                    ans2.setText("Bromine");
                    ans3.setText("Chlorine");
                    ans4.setText("Helium");

                }
               else if (question.getText().toString().equals(qn1)) {

                    question.setText(qn2);
                    ans1.setText("Graphite");
                    ans2.setText("Silicon");
                    ans3.setText("Charcoal");
                    ans4.setText("Phosphorous");

                }
                else if (question.getText().toString().equals(qn2)) {

                    question.setText(qn3);
                    ans1.setText("oxygen");
                    ans2.setText("Hydrogen");
                    ans3.setText("Nitrogen");
                    ans4.setText("Cardon dioxide");

                }
                else if (question.getText().toString().equals(qn3)) {
                    counts=counts+1;
                    countMark(counts);
                    question.setText(qn4);
                    ans1.setText("Calcium bicarbonate");
                    ans2.setText("Sodium bicarbonate");
                    ans3.setText("Calcium carbonate");
                    ans4.setText("Sodium carbonate");

                }
                else if (question.getText().toString().equals(qn4)) {
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }
                    }
                    else {
                        intents.putExtra(EXTRA_MESSAGE, "");
                        startActivity(intents);
                    }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (nos < 5) {
                    nos = nos + 1;
                    qnCount(nos);
                if (question.getText().toString().equals(qn)) {

                    question.setText(qn1);
                    ans1.setText("Phosphorous");
                    ans2.setText("Bromine");
                    ans3.setText("Chlorine");
                    ans4.setText("Helium");

                }
                else if (question.getText().toString().equals(qn1)) {

                    question.setText(qn2);
                    ans1.setText("Graphite");
                    ans2.setText("Silicon");
                    ans3.setText("Charcoal");
                    ans4.setText("Phosphorous");

                }
                else if (question.getText().toString().equals(qn2)) {
                    question.setText(qn3);
                    ans1.setText("oxygen");
                    ans2.setText("Hydrogen");
                    ans3.setText("Nitrogen");
                    ans4.setText("Cardon dioxide");

                }
                else if (question.getText().toString().equals(qn3)) {

                    question.setText(qn4);
                    ans1.setText("Calcium bicarbonate");
                    ans2.setText("Sodium bicarbonate");
                    ans3.setText("Calcium carbonate");
                    ans4.setText("Sodium carbonate");

                }
                else if (question.getText().toString().equals(qn4)) {
                    counts=counts+1;
                    countMark(counts);
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }
                }
                else {
                    intents.putExtra(EXTRA_MESSAGE, "");
                    startActivity(intents);
                }
            }
        });

    }
    public void countMark(int marks){
        TextView markScored=(TextView) findViewById(R.id.score_value);
        markScored.setText(""+ marks);


    }
    public void qnCount(int questnz){
        TextView qnsDone=(TextView) findViewById(R.id.noOfQns);
        qnsDone.setText( questnz+ "/5");
    }
}

