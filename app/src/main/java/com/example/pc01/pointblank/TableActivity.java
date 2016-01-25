package com.example.pc01.pointblank;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class TableActivity extends AppCompatActivity {
    private Context context;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

//        HorizontalScrollView hsv = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
//
//        TableLayout tl = new TableLayout(this);
//        tl.setGravity(Gravity.CENTER);
//        tl.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
//        TableRow tr = new TableRow(this);
//        tr.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
//        tr.setBackgroundColor(Color.parseColor("#c0c0c0"));
//        String[] headerText={"ID","NAME","TYPE"};
//        for(String c:headerText) {
//            TextView tv = new TextView(this);
//            tv.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
//                    TableRow.LayoutParams.WRAP_CONTENT));
//            tv.setGravity(Gravity.CENTER);
//            tv.setTextSize(18);
//            tv.setPadding(5, 5, 5, 5);
//            tv.setText(c);
//            tr.addView(tv);
//        }
//        tl.addView(tr);
//        hsv.addView(tl);

        // Reference to Table row rowHeader

        TableRow tr = (TableRow) findViewById(R.id.rowHeader);
        tr.setBackgroundColor(Color.BLACK);


        String[] headerText = {"ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE"};
        for (String c : headerText) {
            TextView tv = new TextView(this);
            tv.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            tv.setGravity(Gravity.CENTER);
            tv.setTextSize(18);
            tv.setBackgroundColor(Color.WHITE);
            tv.setPadding(10, 10, 10, 10);
            tv.setText(c);
            tr.addView(tv);
        }

        LinearLayout ll = (LinearLayout) findViewById(R.id.layoutIsi);
        String[] isiText = {"ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE", "ID", "NAME", "TYPE"};
        for (int i = 0; i < 100; i++) {
            TableRow trISI = new TableRow(this);
            trISI.setBackgroundColor(Color.BLACK);
            trISI.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));
            if (i % 2 == 0) {
                trISI.setBackgroundColor(Color.LTGRAY);
            }
            for (String c : isiText) {
                TextView tv = new TextView(this);
                tv.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));
                tv.setGravity(Gravity.CENTER);
                tv.setTextSize(18);
                tv.setBackgroundColor(Color.WHITE);
                tv.setPadding(10, 10, 10, 10);
                tv.setText(c);
                trISI.addView(tv);
            }
            ll.addView(trISI);
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Table Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.pc01.pointblank/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Table Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.pc01.pointblank/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
