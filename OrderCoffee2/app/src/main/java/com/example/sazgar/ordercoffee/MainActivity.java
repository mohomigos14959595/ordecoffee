package com.example.sazgar.ordercoffee;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private int count = 1;

    public void display() {
        TextView textcount = (TextView) findViewById(R.id.textviewcount);
        textcount.setText(count+"");
    }

    public void afzayesh() {


        if (count < 20)


            count++;
    }

    public void kahesh() {
        if (count > 1)
            count--;
    }

    public void increase(View view) {
        afzayesh();
        display();

    }

    public void decrease(View view) {
        kahesh();
        display();


    }
    public void summary(View view){
        //1
        EditText edname=(EditText)findViewById(R.id.edittextname);
        EditText edaddress=(EditText)findViewById(R.id.edittextaddress);
        CheckBox chmilk=(CheckBox)findViewById(R.id.checkboxmilk);
        CheckBox chsugar=(CheckBox)findViewById(R.id.checkboxsugar);
        TextView tesummary=(TextView)findViewById(R.id.textviewsummary);

        //2
        String numbers;
        if(count==1){
            numbers="coffee";

        }
        else
        numbers="coffees";
        String namemessage=edname.getText().toString();
        String addressmessage=edaddress.getText().toString();
        boolean milk=chmilk.isChecked();
        String vaziat;
        if(milk)
            vaziat="milk : yes";
        else
            vaziat="milk : no";
        boolean sugar=chsugar.isChecked();
        String qualityofsugar;
        if(sugar)
            qualityofsugar="sugar : yes";

        else
            qualityofsugar="sugar : no";
        tesummary.setText(" name :"+namemessage+"\n address :"+addressmessage+"\n"+vaziat+"\n"+qualityofsugar
        +"\nyou want "+count+numbers);


    }
    public void toastmilk(View view){
        CheckBox chmilk=(CheckBox)findViewById(R.id.checkboxmilk);
        boolean milk=chmilk.isChecked();
        if(milk)
            Toast.makeText(this,"you want milk with your coffee",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"you did not order milk",Toast.LENGTH_LONG).show();
    }
    public void toastsugar(View view){
        CheckBox chmilk=(CheckBox)findViewById(R.id.checkboxsugar);
        boolean sugar=chmilk.isChecked();
        if(sugar)
            Toast.makeText(this,"you want sugar with your coffee",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"you did not order sugar",Toast.LENGTH_LONG).show();
    }
}

