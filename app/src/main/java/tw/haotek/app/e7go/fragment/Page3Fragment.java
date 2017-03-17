package tw.haotek.app.e7go.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tw.haotek.R;


/**
 * Created by Neo on 2015/12/21.
 */
public class Page3Fragment extends Fragment {
    private static final String TAG = Page3Fragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View child = inflater.inflate(R.layout.fragment_page_three, container, false);
        return child;
    }
}
