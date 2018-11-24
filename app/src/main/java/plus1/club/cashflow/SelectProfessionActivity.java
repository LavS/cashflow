package plus1.club.cashflow;

import android.app.ListActivity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.widget.ArrayAdapter;

public class SelectProfessionActivity extends ListActivity {

    final String[] professions = new String[] { "Автомеханик", "Адвокат", "Водитель грузовика",
            "Врач", "Дворник", "Инженер", "Медсестра", "Менеджер", "Офицер полиции",
            "Пилот авиалиний", "Секретарь", "Учитель"};

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, professions);
        setListAdapter(mAdapter);
    }
}
