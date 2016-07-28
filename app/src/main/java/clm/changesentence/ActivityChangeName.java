package clm.changesentence;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityChangeName extends AppCompatActivity {
    SharedPreferences sp;
    SharedPreferences.Editor spEditor;
    TextView nameTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_name);

        sp= PreferenceManager.getDefaultSharedPreferences(this);
        spEditor= sp.edit();

        nameTV= (TextView) findViewById(R.id.nameTV);

        Button saveNameBTN = (Button) findViewById(R.id.saveNameBTN);
        saveNameBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spEditor.putString("name",nameTV.getText().toString());
            }
        });

    }
}
