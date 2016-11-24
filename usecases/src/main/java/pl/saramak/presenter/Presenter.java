package pl.saramak.presenter;

/**
 * Created by mario on 24.11.16.
 */
public interface Presenter<T> {

    public T getView();

    void onViewReady(T view);

    void onPause();

    void onResume();
}
