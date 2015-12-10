package ru.vaszol.myapp.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import io.vov.vitamio.widget.VideoView;
import ru.vaszol.myapp.PreferenceHelper;
import ru.vaszol.myapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentTaskFragment extends Fragment {


//    private String pathToFileOrUrl = "http://192.168.0.103:8080/123";
//    private String rian = "rtmp://rian.cdnvideo.ru:1935/rr/stream20";
//    private String tv3 = "rtmp://95.211.120.96/beta/tv3?st=2674ba05b7c730a14bc3dbf05c118963";
//    private String ru2 = "rtmp://95.211.198.80/beta/rossiya2?st=e008e77bdcab5885b88b6b413cd1b416";
//    private VideoView mVideoView;
//    EditText strealLine;
//
//    PreferenceHelper preferenceHelper;
//
//    private SurfaceHolder _surfaceHolder;

    public CurrentTaskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


//        strealLine = (EditText) findViewById(R.id.stream_line);
//        strealLine.setText(pathToFileOrUrl);

//        PreferenceHelper.getInstance().init(getApplicationContext());
//        preferenceHelper = PreferenceHelper.getInstance();
//        fragmentManager = getFragmentManager();
//        runSplash();
//
//        if (!LibsChecker.checkVitamioLibs(this))
//            return;
//
//        mVideoView = (VideoView) findViewById(R.id.surface_view);
//
//        if (pathToFileOrUrl == "") {
//            Toast.makeText(this, "Please set the video path for your media file", Toast.LENGTH_LONG).show();
//            return;
//        } else {
//
//            /*
//             * Alternatively,for streaming media you can use
//             * mVideoView.setVideoURI(Uri.parse(URLstring));
//             */
//            mVideoView.setVideoPath(pathToFileOrUrl);
//            mVideoView.setMediaController(new MediaController(this));
//            mVideoView.requestFocus();
//
//            mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                @Override
//                public void onPrepared(MediaPlayer mediaPlayer) {
//                    // optional need Vitamio 4.0
//                    mediaPlayer.setPlaybackSpeed(1.0f);
//                }
//            });
//        }
        return inflater.inflate(R.layout.fragment_current_task, container, false);
    }

//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_splash) {
//            item.setChecked(!item.isChecked());
//            preferenceHelper.putBoolean(PreferenceHelper.SPLASH_IS_INVISIBLE, item.isChecked());
//            return true;
//        }
//        if(id == 2){
//            pathToFileOrUrl = rian;
//            strealLine.setText(rian);
//        }
//        if(id == 3){
//            pathToFileOrUrl = tv3;
//            strealLine.setText(tv3);
//        }
//        if(id == 4){
//            pathToFileOrUrl = ru2;
//            strealLine.setText(ru2);
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//
//    public void startPlay(View view) {
//        if (!TextUtils.isEmpty(pathToFileOrUrl)) {
//            mVideoView.setVideoPath(pathToFileOrUrl);
//        }
//    }
//
//    public void openVideo(View View) {
//        pathToFileOrUrl = String.valueOf(strealLine.getText());
//        mVideoView.setVideoPath(pathToFileOrUrl);
//    }

}
