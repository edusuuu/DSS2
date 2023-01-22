package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pizzahut_comment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzahut_comment);


        Button submit = findViewById(R.id.button);
        EditText name,comment;
        TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17;
        TextView cm1,cm2,cm3,cm4,cm5,cm6,cm7,cm8,cm9,cm10,cm11,cm12,cm13,cm14,cm15,cm16,cm17;
        name = findViewById(R.id.inputName);
        comment = findViewById(R.id.inputComment);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n10 = findViewById(R.id.n10);
        n11 = findViewById(R.id.n11);
        n12 = findViewById(R.id.n12);
        n13 = findViewById(R.id.n13);
        n14 = findViewById(R.id.n14);
        n15 = findViewById(R.id.n15);
        n16 = findViewById(R.id.n16);
        n17 = findViewById(R.id.n17);
        cm1 = findViewById(R.id.cm1);
        cm2 = findViewById(R.id.cm2);
        cm3 = findViewById(R.id.cm3);
        cm4 = findViewById(R.id.cm4);
        cm5 = findViewById(R.id.cm5);
        cm6 = findViewById(R.id.cm6);
        cm7 = findViewById(R.id.cm7);
        cm8 = findViewById(R.id.cm8);
        cm9 = findViewById(R.id.cm9);
        cm10 = findViewById(R.id.cm10);
        cm11 = findViewById(R.id.cm11);
        cm12 = findViewById(R.id.cm12);
        cm13 = findViewById(R.id.cm13);
        cm14 = findViewById(R.id.cm14);
        cm15 = findViewById(R.id.cm15);
        cm16 = findViewById(R.id.cm16);
        cm17 = findViewById(R.id.cm17);

        n5.setVisibility(View.INVISIBLE);
        cm5.setVisibility(View.INVISIBLE);
        n6.setVisibility(View.INVISIBLE);
        cm6.setVisibility(View.INVISIBLE);
        n7.setVisibility(View.INVISIBLE);
        cm7.setVisibility(View.INVISIBLE);
        n8.setVisibility(View.INVISIBLE);
        cm8.setVisibility(View.INVISIBLE);
        n9.setVisibility(View.INVISIBLE);
        cm9.setVisibility(View.INVISIBLE);
        n10.setVisibility(View.INVISIBLE);
        cm10.setVisibility(View.INVISIBLE);
        n11.setVisibility(View.INVISIBLE);
        cm11.setVisibility(View.INVISIBLE);
        n12.setVisibility(View.INVISIBLE);
        cm12.setVisibility(View.INVISIBLE);
        n13.setVisibility(View.INVISIBLE);
        cm13.setVisibility(View.INVISIBLE);
        n14.setVisibility(View.INVISIBLE);
        cm14.setVisibility(View.INVISIBLE);
        n15.setVisibility(View.INVISIBLE);
        cm15.setVisibility(View.INVISIBLE);
        n16.setVisibility(View.INVISIBLE);
        cm16.setVisibility(View.INVISIBLE);
        n17.setVisibility(View.INVISIBLE);
        cm17.setVisibility(View.INVISIBLE);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().isEmpty() && cm1.getText().toString().isEmpty()){
                    n1.setText(name.getText().toString());
                    cm1.setText(comment.getText().toString());

                }
                else if (n2.getText().toString().isEmpty() && cm2.getText().toString().isEmpty()){
                    n2.setText(name.getText().toString());
                    cm2.setText(comment.getText().toString());
                }
                else if (n3.getText().toString().isEmpty() && cm3.getText().toString().isEmpty()){
                    n3.setText(name.getText().toString());
                    cm3.setText(comment.getText().toString());
                }
                else if (n4.getText().toString().isEmpty() && cm4.getText().toString().isEmpty()){
                    n4.setText(name.getText().toString());
                    cm4.setText(comment.getText().toString());
                }
                else if (n5.getText().toString().isEmpty() && cm5.getText().toString().isEmpty()){
                    n5.setText(name.getText().toString());
                    cm5.setText(comment.getText().toString());
                    n5.setVisibility(View.VISIBLE);
                    cm5.setVisibility(View.VISIBLE);
                }
                else if (n6.getText().toString().isEmpty() && cm6.getText().toString().isEmpty()){
                    n6.setText(name.getText().toString());
                    cm6.setText(comment.getText().toString());
                    n6.setVisibility(View.VISIBLE);
                    cm6.setVisibility(View.VISIBLE);
                }
                else if (n7.getText().toString().isEmpty() && cm7.getText().toString().isEmpty()){
                    n7.setText(name.getText().toString());
                    cm7.setText(comment.getText().toString());
                    n7.setVisibility(View.VISIBLE);
                    cm7.setVisibility(View.VISIBLE);
                }
                else if (n8.getText().toString().isEmpty() && cm8.getText().toString().isEmpty()){
                    n8.setText(name.getText().toString());
                    cm8.setText(comment.getText().toString());
                    n8.setVisibility(View.VISIBLE);
                    cm8.setVisibility(View.VISIBLE);
                }
                else if (n9.getText().toString().isEmpty() && cm9.getText().toString().isEmpty()){
                    n9.setText(name.getText().toString());
                    cm9.setText(comment.getText().toString());
                    n9.setVisibility(View.VISIBLE);
                    cm9.setVisibility(View.VISIBLE);
                }
                else if (n10.getText().toString().isEmpty() && cm10.getText().toString().isEmpty()){
                    n10.setText(name.getText().toString());
                    cm10.setText(comment.getText().toString());
                    n10.setVisibility(View.VISIBLE);
                    cm10.setVisibility(View.VISIBLE);
                }
                else if (n11.getText().toString().isEmpty() && cm11.getText().toString().isEmpty()){
                    n11.setText(name.getText().toString());
                    cm11.setText(comment.getText().toString());
                    n11.setVisibility(View.VISIBLE);
                    cm11.setVisibility(View.VISIBLE);
                }
                else if (n12.getText().toString().isEmpty() && cm12.getText().toString().isEmpty()){
                    n12.setText(name.getText().toString());
                    cm12.setText(comment.getText().toString());
                    n12.setVisibility(View.VISIBLE);
                    cm12.setVisibility(View.VISIBLE);
                }
                else if (n13.getText().toString().isEmpty() && cm13.getText().toString().isEmpty()){
                    n13.setText(name.getText().toString());
                    cm13.setText(comment.getText().toString());
                    n13.setVisibility(View.VISIBLE);
                    cm13.setVisibility(View.VISIBLE);
                } else if (n14.getText().toString().isEmpty() && cm14.getText().toString().isEmpty()){
                    n14.setText(name.getText().toString());
                    cm14.setText(comment.getText().toString());
                    n14.setVisibility(View.VISIBLE);
                    cm14.setVisibility(View.VISIBLE);
                } else if (n15.getText().toString().isEmpty() && cm15.getText().toString().isEmpty()){
                    n15.setText(name.getText().toString());
                    cm15.setText(comment.getText().toString());
                    n15.setVisibility(View.VISIBLE);
                    cm15.setVisibility(View.VISIBLE);
                } else if (n16.getText().toString().isEmpty() && cm16.getText().toString().isEmpty()){
                    n16.setText(name.getText().toString());
                    cm16.setText(comment.getText().toString());
                    n16.setVisibility(View.VISIBLE);
                    cm16.setVisibility(View.VISIBLE);
                } else if (n17.getText().toString().isEmpty() && cm17.getText().toString().isEmpty()){
                    n17.setText(name.getText().toString());
                    cm17.setText(comment.getText().toString());
                    n17.setVisibility(View.VISIBLE);
                    cm17.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}