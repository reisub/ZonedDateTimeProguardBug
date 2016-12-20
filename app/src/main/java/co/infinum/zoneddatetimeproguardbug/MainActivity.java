package co.infinum.zoneddatetimeproguardbug;

import org.threeten.bp.ZonedDateTime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ZonedDateTime zonedDateTime = ZonedDateTime.parse("2016-08-13T12:15:00Z");

        ((TextView)findViewById(R.id.dateTimeBeforeText)).setText(zonedDateTime.toString());
        findViewById(R.id.nextActivityButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOtherActivity(zonedDateTime);
            }
        });
    }

    private void runOtherActivity(ZonedDateTime zonedDateTime) {
        startActivity(OtherActivity.newIntent(this, zonedDateTime));
    }
}
