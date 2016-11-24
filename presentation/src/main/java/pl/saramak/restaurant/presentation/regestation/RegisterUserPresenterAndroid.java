package pl.saramak.restaurant.presentation.regestation;

import android.content.Context;

import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.presenter.regestation.RegisterUserPresenter;
import pl.saramak.presenter.regestation.RegisterUserViewModel;
import pl.saramak.presenter.regestation.RegistrationView;
import pl.saramak.restaurant.android.OrmUserRepository;
import pl.saramak.usecases.UserUseCase;

/**
 * Created by mario on 24.11.16.
 */

public class RegisterUserPresenterAndroid implements RegisterUserPresenter {
    private RegistrationView view;
    private UserRepository userRepo;
    private Context context;

    public RegisterUserPresenterAndroid(Context context) {
        this.context = context;
    }

    @Override
    public RegistrationView getView() {
        return view;
    }

    @Override
    public void onViewReady(RegistrationView view) {
        this.view = view;
        userRepo = new OrmUserRepository(context);
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void registerUser(RegisterUserViewModel userViewModel) {
        new UserUseCase(userRepo).createNewUser();
    }
}
