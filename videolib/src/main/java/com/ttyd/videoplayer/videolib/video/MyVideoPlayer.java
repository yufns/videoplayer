package com.ttyd.videoplayer.videolib.video;

import android.content.Context;
import android.util.AttributeSet;
import com.ttyd.videoplayer.videolib.video.base.GSYVideoPlayer;

/**
 * Created by Eric on 2018/9/18.
 * Email:erichu1208@gmail.com
 */
public  class MyVideoPlayer extends GSYVideoPlayer {

    public MyVideoPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    @Override public int getLayoutId() {
        return 0;
    }

    @Override public void startPlayLogic() {

    }

    @Override protected void showWifiDialog() {

    }

    @Override protected void showProgressDialog(float deltaX, String seekTime, int seekTimePosition,
        String totalTime, int totalTimeDuration) {

    }

    @Override protected void dismissProgressDialog() {

    }

    @Override protected void showVolumeDialog(float deltaY, int volumePercent) {

    }

    @Override protected void dismissVolumeDialog() {

    }

    @Override protected void showBrightnessDialog(float percent) {

    }

    @Override protected void dismissBrightnessDialog() {

    }

    @Override protected void onClickUiToggle() {

    }

    @Override protected void hideAllWidget() {

    }

    @Override protected void changeUiToNormal() {

    }

    @Override protected void changeUiToPreparingShow() {

    }

    @Override protected void changeUiToPlayingShow() {

    }

    @Override protected void changeUiToPauseShow() {

    }

    @Override protected void changeUiToError() {

    }

    @Override protected void changeUiToCompleteShow() {

    }

    @Override protected void changeUiToPlayingBufferingShow() {

    }

    public MyVideoPlayer(Context context) {
        super(context);
    }

    public MyVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
