//Название пакета, в который входит данный класс
package org.siada.myapplication;

//Секция импорта пакетов, используемых данным классом
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//!Секция импорта пакетов, используемых данным классом

//Видимость класса, его назввание и имя класса от которого тот наследуется
public class MainActivityActivity extends AppCompatActivity {

    //Действия класса при создании
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Наследование от суперкласса "onCreate"
        super.onCreate(savedInstanceState);
        //Запуск лайоута
        setContentView(R.layout.main_activity);
    }
}
