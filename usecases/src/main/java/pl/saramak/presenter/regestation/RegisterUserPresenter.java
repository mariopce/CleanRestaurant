package pl.saramak.presenter.regestation;


import pl.saramak.presenter.Presenter;

/**
 * Created by mario on 24.11.16.
 */

public interface RegisterUserPresenter extends Presenter<RegistrationView> {

    void registerUser(RegisterUserViewModel userViewModel);
}
