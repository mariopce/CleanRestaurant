package pl.saramak.restaurant.presentation.start;

import android.content.Context;

import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.presenter.start.FirstScreenPresenter;
import pl.saramak.presenter.start.FirstScreenView;
import pl.saramak.restaurant.android.OrmUserRepository;
import pl.saramak.usecases.UserUseCase;

/**
 * Created by mario on 24.11.16.
 */

public class FirstScreenPresenterAndroid implements FirstScreenPresenter{
    private final UserRepository userRepo;
    private final UserUseCase userInteractor;
    private FirstScreenView view;
    private Context context;

    public FirstScreenPresenterAndroid(Context context) {
        this.context = context;
        userRepo = new OrmUserRepository(context);
        userInteractor = new UserUseCase(userRepo);
    }

    @Override
    public FirstScreenView getView() {
        return view;
    }

    @Override
    public void onViewReady(FirstScreenView view) {
        this.view = view;

        if (userInteractor.isAnyUserRegisteredOnDevice()){
            view.showRegistrationForm();
        }else{
            view.showLoginForm();
        }
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }
}
