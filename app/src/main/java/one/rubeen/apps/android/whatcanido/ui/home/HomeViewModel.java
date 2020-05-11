package one.rubeen.apps.android.whatcanido.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hello! this is: \"What can I do?\"");
    }

    public LiveData<String> getText() {
        return mText;
    }
}