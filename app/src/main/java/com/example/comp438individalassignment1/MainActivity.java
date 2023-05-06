package com.example.comp438individalassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView check;
    static int result=5;
    RadioButton p1;
    RadioGroup r1;
    RadioGroup r2;
    RadioGroup r3;
    RadioGroup r4;
    RadioGroup r5;
    RadioGroup r6;
    RadioButton p2;
    RadioButton p3;
    RadioButton p4;
    RadioButton p5;
    RadioButton p6;
    RadioButton p7;
    RadioButton p8;
    RadioButton p9;
    RadioButton p10;
    RadioButton p11;
    RadioButton p12;
    RadioButton p13;
    RadioButton p14;
    RadioButton p15;
    RadioButton p16;
    RadioButton p17;
    RadioButton p18;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.check);
        p1=findViewById(R.id.hand1);
        p2=findViewById(R.id.arm1);
        p3=findViewById(R.id.leg1);

        p4=findViewById(R.id.leg2);
        p5=findViewById(R.id.arm2);
        p6=findViewById(R.id.head2);

        p7=findViewById(R.id.hand3);
        p8=findViewById(R.id.arm3);
        p9=findViewById(R.id.lag3);

        p10=findViewById(R.id.hand4);
        p11=findViewById(R.id.leg4);
        p12=findViewById(R.id.arm4);

        p13=findViewById(R.id.hand5);
        p14=findViewById(R.id.face5);
        p15=findViewById(R.id.leg5);

        p16=findViewById(R.id.hand6);
        p17=findViewById(R.id.arm6);
        p18=findViewById(R.id.feet6);
        r1=findViewById(R.id.one);
        r2=findViewById(R.id.two);
        r3=findViewById(R.id.three);
        r4=findViewById(R.id.four);
        r5=findViewById(R.id.five);
        r6=findViewById(R.id.six);









    }

    public void checkResult(View view) {

        int counter=0;
       int group1=r1.getCheckedRadioButtonId();
       if(group1==R.id.arm1){
           counter++;
       }
       int group2=r2.getCheckedRadioButtonId();
       if(group2==R.id.head2){
           counter++;

       }
    int group3=r3.getCheckedRadioButtonId();
       if(group3==R.id.hand3){
           counter++;
       }
       int group4=r4.getCheckedRadioButtonId();
       if(group4==R.id.leg4){
           counter++;
       }
       int group5=r5.getCheckedRadioButtonId();
       if(group5==R.id.face5){
           counter++;
       }
       int grop6=r6.getCheckedRadioButtonId();
       if(grop6==R.id.feet6){
           counter++;
       }
       if(counter==6){
           check.setVisibility(View.VISIBLE);
           check.setText("all is true ...you are super");
       }
       else{
           check.setVisibility(View.VISIBLE);
           check.setText("the result is : " + counter+ " \n " + "question1 is :"+"arms" +"\n"+" question2 is : " + "head "+"\n" + "question3 is : " + "hand"+  "\n"+" question4 is : " + "leg"+"\n"+"question5 is :"+"face"+"\n"+"question6 is :"+ "feet" );
       }

    }

}
