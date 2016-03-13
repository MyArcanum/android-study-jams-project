package factory.arcanum.ninth.myfirstproject;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Relax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);
    }

    public void createAlarm(View view) {

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void VIDEO(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/" ));
        startActivity(intent);
    }
}
