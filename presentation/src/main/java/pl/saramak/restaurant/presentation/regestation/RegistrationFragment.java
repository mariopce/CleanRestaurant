package pl.saramak.restaurant.presentation.regestation;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.presenter.regestation.RegisterUserPresenter;
import pl.saramak.presenter.regestation.RegisterUserViewModel;
import pl.saramak.presenter.regestation.RegistrationView;
import pl.saramak.restaurant.android.OrmUserRepository;
import pl.saramak.restaurant.model.user.User;
import pl.saramak.restaurant.presentation.R;
import pl.saramak.usecases.UserUseCase;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegistrationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistrationFragment extends Fragment implements RegistrationView {


    private RegisterUserPresenter presenter;

    public RegistrationFragment() {

    }


    public static RegistrationFragment newInstance() {
        RegistrationFragment fragment = new RegistrationFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new RegisterUserPresenterAndroid(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_regestration_presenter, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewReady(this);
    }

    @Override
    public void onPause() {
        presenter.onPause();
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void registerUser(RegisterUserViewModel userViewModel) {
        presenter.registerUser(userViewModel);
    }
}
