package com.example.razzcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double var1,var2;                       // delcaring the  variables
    boolean add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button n0 = findViewById(R.id.n0); // assigning the variables and getting the id of the object of the variabls
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);

        final Button equal = findViewById(R.id.equal);
        final Button addition = findViewById(R.id.addition);
        final Button subtraction = findViewById(R.id.subtraction);
        final Button division = findViewById(R.id.division);
        final Button multiplication = findViewById(R.id.multiplication);

        final Button delete = findViewById(R.id.delete);
        final Button clear = findViewById(R.id.clear);

        final TextView result = findViewById(R.id.result);

        n0.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");  //setting the text on textview we created whatever we click
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0){
                    result.setText(result.getText()+".");
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();

                }


            }
        });

        equal.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0){ // validate if the result value length donot must contain any number before adding

                var2 = Double.parseDouble(result.getText()+""); // storing the second input value to the variable 2
                if (add==true){                                      // condition if add is true
                    result.setText(var1+var2+"");     // the value of the textview will be the addition of the two variable var1 and var2
                    add = false;                            // and then closing the function.
                }
                if (subtract==true){
                    result.setText(var1-var2+"");
                    subtract = false;
                }

                if (multiply==true){
                    result.setText(var1*var2+"");
                    multiply = false;
                }
                if (divide==true){
                    result.setText(var1-var2+"");
                    divide = false;
                }
            }else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        addition.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0) {
                    var1 = Double.parseDouble(result.getText() + ""); // storing the first input value to the var1
                    add = true;                                    //  if the input value  is true
                    result.setText(null);                         // after storing the value the text field will be null
                }else {
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0){
                var1 = Double.parseDouble(result.getText()+"");
                subtract = true;
                result.setText(null);
            }else
                {
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0){
                var1 = Double.parseDouble(result.getText()+"");
                multiply = true;
                result.setText(null);

            }else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() { //setting the click listener on each button
            @Override
            public void onClick(View view) {
                if (result.getText().length()>0){
                var1 = Double.parseDouble(result.getText()+"");
                divide = true;
                result.setText(null);
            }
                else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

       delete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { // delete button on click listener for what happen if we click the delete button
            String Element = result.getText().toString(); // converting the screen value toString and
                                                            // storing the value of the screen to the element variable

               int displyLength = Element.length();  // storing the value of Element length to displyLength variable

               if (displyLength>0){ // create error if the screen dont have any value so if the displyLength is greater than zero.
                   Element = Element.substring(0,displyLength-1); //  the begin index will be 0 and end index will be Displylength-1
                                                                  // now the Element value will be one length sorter

                   result.setText(Element);  // the Element is one length sorter so we r updating the result of the screen


               }
           }
       });

       clear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result.setText("");  // if the clear button is click the display result will be null
           }
       });
    }
}
