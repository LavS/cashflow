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
        TextView textSalary = (TextView) findViewById(R.id.textSalary);
        TextView textFullRevenue = (TextView) findViewById(R.id.textFullRevenue);

        TextView textTaxes = (TextView) findViewById(R.id.textTaxes);
        TextView textMortagePayments = (TextView) findViewById(R.id.textMortagePayments);
        TextView textLoanPaymentsForEducation = (TextView) findViewById(R.id.textLoanPaymentsForEducation);
        TextView textPaymentsForCarloan = (TextView) findViewById(R.id.textPaymentsForCarloan);
        TextView textCreditCardPayments = (TextView) findViewById(R.id.textCreditCardPayments);
        TextView textPaymentsForSmallLoans = (TextView) findViewById(R.id.textPaymentsForSmallLoans);
        TextView textOtherExpenses = (TextView) findViewById(R.id.textOtherExpenses);
        TextView textFullCosts = (TextView) findViewById(R.id.textFullCosts);

        TextView textExpensesPerChild = (TextView) findViewById(R.id.textExpensesPerChild);
        TextView textMonthCashFlow = (TextView) findViewById(R.id.textMonthCashFlow);

        TextView textSaving = (TextView) findViewById(R.id.textSaving);
        TextView textMortage = (TextView) findViewById(R.id.textMortage);
        TextView textLoanForEducation = (TextView) findViewById(R.id.textLoanForEducation);
        TextView textCarloan = (TextView) findViewById(R.id.textCarloan);
        TextView textCreditCard = (TextView) findViewById(R.id.textCreditCard);
        TextView textSmallLoans = (TextView) findViewById(R.id.textSmallLoans);

        // Получение знанчений для заполнения
        numbers = getResources().getStringArray(arrays[profession-1]).clone();

        // Заполнение карточки профессии
        textSalary.setText("$"+numbers[0]);
        textFullRevenue.setText("$"+numbers[1]);

        textTaxes.setText("$"+numbers[2]);
        textMortagePayments.setText("$"+numbers[3]);
        textLoanPaymentsForEducation.setText("$"+numbers[4]);
        textPaymentsForCarloan.setText("$"+numbers[5]);
        textCreditCardPayments.setText("$"+numbers[6]);
        textPaymentsForSmallLoans.setText("$"+numbers[7]);
        textOtherExpenses.setText("$"+numbers[8]);
        textFullCosts.setText("$"+numbers[9]);

        textExpensesPerChild.setText("$"+numbers[10]);
        textMonthCashFlow.setText("$"+numbers[11]);

        textSaving.setText("$"+numbers[12]);
        textMortage.setText("$"+numbers[13]);
        textLoanForEducation.setText("$"+numbers[14]);
        textCarloan.setText("$"+numbers[15]);
        textCreditCard.setText("$"+numbers[16]);
        textSmallLoans.setText("$"+numbers[17]);

    }
}
