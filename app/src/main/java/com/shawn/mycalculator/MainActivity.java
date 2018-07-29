package com.shawn.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button delete,clear,addition,subtraction,b7,b8,b9,multiplication,b4,b5,b6,division,b,b2,b3,equal,dot,b0,both,off;
    EditText editText;
    StringBuilder sb;
    int position, maxLength=17;
    double fn=Double.NaN,sn,result;
    String mathematicsOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener myListener=new MyListener();

        delete=(Button)findViewById(R.id.delete);
        clear=(Button)findViewById(R.id.clear);
        addition=(Button)findViewById(R.id.addition);
        subtraction=(Button)findViewById(R.id.subtraction);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        multiplication=(Button)findViewById(R.id.multiplication);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        division=(Button)findViewById(R.id.division);
        b=(Button)findViewById(R.id.b);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        equal=(Button)findViewById(R.id.equal);
        dot=(Button)findViewById(R.id.dot);
        both=(Button)findViewById(R.id.both);
        b0=(Button)findViewById(R.id.b0);
        off=(Button)findViewById(R.id.off);
        editText=(EditText)findViewById(R.id.et);

        delete.setOnClickListener(myListener);
        clear.setOnClickListener(myListener);
        addition.setOnClickListener(myListener);
        subtraction.setOnClickListener(myListener);
        b7.setOnClickListener(myListener);
        b8.setOnClickListener(myListener);
        b9.setOnClickListener(myListener);
        multiplication.setOnClickListener(myListener);
        b4.setOnClickListener(myListener);
        b5.setOnClickListener(myListener);
        b6.setOnClickListener(myListener);
        division.setOnClickListener(myListener);
        b.setOnClickListener(myListener);
        b2.setOnClickListener(myListener);
        b3.setOnClickListener(myListener);
        equal.setOnClickListener(myListener);
        dot.setOnClickListener(myListener);
        b0.setOnClickListener(myListener);
        both.setOnClickListener(myListener);
        off.setOnClickListener(myListener);
        editText.setFilters(
                new InputFilter[]{
                        new InputFilter.LengthFilter(maxLength)}
                        );
    }

    public class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String str=editText.getText().toString();
            position=editText.length()-1;
            Editable eb;

            switch (v.getId()) {

                case R.id.delete:
                    sb = new StringBuilder(str);
                    sb.deleteCharAt(str.length() - 1);
                    if(sb.length()>=0){
                    if (sb.length() == 0) {
                        editText.setText(null);
                    } else {
                        editText.setText(sb.toString());
                    }
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);}
                    else {
                        editText.setText("");
                        eb = editText.getText();
                        position = editText.length();
                        Selection.setSelection(eb, position);
                    }
                    break;
                case R.id.clear:
                    editText.setText(null);
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.addition:
                    mathematicsOperator = "+";
                    fn = Double.parseDouble(editText.getText().toString());
                    editText.setText(null);
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);

                    break;
                case R.id.subtraction:
                    mathematicsOperator = "-";
                    fn = Double.parseDouble(editText.getText().toString());
                    editText.setText(null);
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b7:
                    editText.setText(str + b7.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b8:
                    editText.setText(str + b8.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b9:
                    editText.setText(str + b9.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.multiplication:
                    mathematicsOperator = "×";
                    fn = Double.parseDouble(editText.getText().toString());
                    editText.setText(null);
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b4:
                    editText.setText(str + b4.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b5:
                    editText.setText(str + b5.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b6:
                    editText.setText(str + b6.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.division:
                    mathematicsOperator = "/";
                    fn = Double.parseDouble(editText.getText().toString());
                    editText.setText(null);
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b:
                    editText.setText(str + b.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b2:
                    editText.setText(str + b2.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b3:
                    editText.setText(str + b3.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.equal:
                    if(!Double.isNaN(fn)){
                    sn = Double.parseDouble(editText.getText().toString());
                    switch (mathematicsOperator) {
                        case "+":
                            result = fn + sn;
                            break;
                        case "-":
                            result = fn - sn;
                            break;
                        case "×":
                            result = fn * sn;
                            break;
                        case "/":
                            result = fn / sn;
                            break;
                    }
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    editText.setText(result + "");
                    }else {
                        fn=Double.parseDouble(editText.getText().toString());
                    }
                    break;
                case R.id.dot:
                    mathematicsOperator = ".";
                    editText.setText(String.valueOf(Math.round(Double.parseDouble(editText.getText().toString()))) + ".");
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.b0:
                    editText.setText(str + b0.getText());
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.both:
                    editText.setText(Double.parseDouble(editText.getText().toString()) * (-1) + "");
                    eb = editText.getText();
                    position = editText.length();
                    Selection.setSelection(eb, position);
                    break;
                case R.id.off:
                    finish();
                    break;
           }
        }
    }
}
