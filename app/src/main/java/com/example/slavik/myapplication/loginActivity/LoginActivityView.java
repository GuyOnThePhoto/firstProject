package com.example.slavik.myapplication.loginActivity;

/**
 * Created by Slavik on 10.03.2018.
 */

public interface LoginActivityView {
    boolean areFieldsEmpty();
    void showErrorMessage();
    void showSuccessMessage();
    void hideErrorMessage();
    void showUserLoadingProgressBar();
    void hideUserLoadingProgressBar();
}
