package plus1.club.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ProfessionActivity extends AppCompatActivity {

    public int profession;
    public String[] numbers;
    public int[] arrays =
            {R.array.profession1, R.array.profession2, R.array.profession3, R.array.profession4,
            R.array.profession5, R.array.profession6, R.array.profession7, R.array.profession8,
            R.array.profession9, R.array.profession10, R.array.profession11, R.array.profession12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profession);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(SelectProfessionActivity.EXTRA_MESSAGE);
        profession = Integer.parseInt(message);
        TextView editProfession = (TextView) findViewById(R.id.textProfession);

        // Если выбран пункт "Случайная профессия" - выбираем случайную профессию из списка
        if (profession == 0){
            Random rand = new Random();
            profession = rand.nextInt(12) + 1;
        }
        editProfession.setText(getResources().getStringArray(R.array.professions)[profession]);

        // Поиск заполняемых полей
        TextView editSalary = (TextView) findViewById(R.id.textSalary);
        TextView editFullRevenue = (TextView) findViewById(R.id.textFullRevenue);

        // Получение знанчений для заполнения
        numbers = getResources().getStringArray(arrays[profession-1]).clone();

        // Заполнение карточки профессии
        editSalary.setText(numbers[0]);
        editFullRevenue.setText(numbers[1]);
    }
}
