package pl.saramak.restaurant.navigator;

import android.support.v4.app.FragmentManager;

import pl.saramak.restaurant.MainActivity;
import pl.saramak.restaurant.presentation.Navigator;

/**
 * Created by mario on 24.11.16.
 */
public class MainNavigator implements Navigator {
    private FragmentManager supportFragmentManager;

    public MainNavigator(FragmentManager supportFragmentManager) {
        this.supportFragmentManager = supportFragmentManager;
    }

    @Override
    public void showRegistrationForm() {
        //
    }
}
