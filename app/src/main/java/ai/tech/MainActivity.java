package ai.tech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        TextView txtFullName = findViewById(R.id.txtFullName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        txtFullName.setText("Full name: " + edtTxtFirstName.getText().toString() + " "
                + edtTxtLastName.getText().toString() + ".");
        txtEmail.setText("E-Mail: " + edtTxtEmail.getText().toString());
    }
}