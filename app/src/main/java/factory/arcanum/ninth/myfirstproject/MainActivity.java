package factory.arcanum.ninth.myfirstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAskClick(View view){
        Intent open = new Intent(MainActivity.this, AskHelp.class);
        startActivity(open);
    }

    public void onRelaxClick(View view){
        Intent open = new Intent(MainActivity.this, Relax.class);
        startActivity(open);
    }

    public void onGiveupClick(View view){
        Intent open = new Intent(MainActivity.this, Give_up.class);
        startActivity(open);
    }

    public void onAheadClick(View view){
        Intent open = new Intent(MainActivity.this, Ahead.class);
        startActivity(open);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "No, you are not", Toast.LENGTH_SHORT);
        toast.show();
    }

}
