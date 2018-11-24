package plus1.club.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class ProfessionActivity extends AppCompatActivity {

    public int profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profession);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(SelectProfessionActivity.EXTRA_MESSAGE);
        profession = Integer.parseInt(message);
        TextView editText = (TextView) findViewById(R.id.textProfession);

        // Если выбран пункт "Случайная профессия" - выбираем случайную профессию из списка
        if (profession == 0){
            Random rand = new Random();
            profession = rand.nextInt(12) + 1;
        }
        editText.setText(getResources().getStringArray(R.array.professions)[profession]);
    }
}
