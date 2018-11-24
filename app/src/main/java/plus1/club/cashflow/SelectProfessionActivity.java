package plus1.club.cashflow;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectProfessionActivity extends ListActivity {

    private ArrayAdapter<String> mAdapter;
    public final static String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.professions_list);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.professions));
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, ProfessionActivity.class);
        intent.putExtra(EXTRA_MESSAGE, Integer.toString(position));
        startActivity(intent);
    }
}
