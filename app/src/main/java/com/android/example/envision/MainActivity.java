package org.srmcampusguide.envision;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import org.srmcampusguide.envision.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder1(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.824083, 80.044043?q=12.824083, 80.044043(Enrollment Venue)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder2(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.824779, 80.046642?q=12.824779, 80.046642(Auditorium)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder3(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.823394, 80.044560?q=12.823394, 80.044560(Java)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder4(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.823673, 80.043989?q=12.823673, 80.043989(Enrollment Helpdesk)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder5(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.822896, 80.044626?q=12.822896, 80.044626(Shuttle Bus)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder6(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.821829, 80.043339?q=12.821829, 80.043339(Hostel - Boys)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder7(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.821044, 80.045872?q=12.821044, 80.045872(Hostel - Girls)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder8(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.821255, 80.037748?q=12.821255, 80.037748(Railway Bus Stop)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void submitOrder9(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.822605, 80.044509?q=12.822605, 80.044509(City Union Bank)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    } public void submitOrder10(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:12.822733, 80.045064?q=12.822733, 80.045064(Common Toilet)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}
