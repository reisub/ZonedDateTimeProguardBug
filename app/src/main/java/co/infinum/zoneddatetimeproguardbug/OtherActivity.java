package co.infinum.zoneddatetimeproguardbug;

import org.threeten.bp.ZonedDateTime;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private static final String EXTRA_ZONED_DATE_TIME = "zoned date time";

    public static Intent newIntent(Context context, ZonedDateTime zonedDateTime) {
        Intent intent = new Intent(context, OtherActivity.class);
        intent.putExtra(EXTRA_ZONED_DATE_TIME, zonedDateTime);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ZonedDateTime zonedDateTime = (ZonedDateTime) getIntent().getSerializableExtra(EXTRA_ZONED_DATE_TIME);
        ((TextView)findViewById(R.id.dateTimeAfterText)).setText(zonedDateTime.toString());
    }
}
