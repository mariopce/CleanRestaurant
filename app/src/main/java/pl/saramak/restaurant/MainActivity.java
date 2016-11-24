package pl.saramak.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.saramak.presenter.start.FirstScreenPresenter;
import pl.saramak.presenter.start.FirstScreenView;
import pl.saramak.restaurant.navigator.FragmentNavigator;
import pl.saramak.restaurant.navigator.MainNavigator;
import pl.saramak.restaurant.presentation.Navigator;
import pl.saramak.restaurant.presentation.start.FirstScreenPresenterAndroid;

public class MainActivity extends AppCompatActivity implements FirstScreenView{

    FirstScreenPresenter presenter;
    Navigator navigator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigator = new MainNavigator(getSupportFragmentManager());
        presenter = new FirstScreenPresenterAndroid(this);
    }

    @Override
    public void showRegistrationForm() {
        navigator.showRegistrationForm();
    }

    @Override
    public void showLoginForm() {

    }
}
