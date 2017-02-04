/*
 * Copyright (C) 2015 Zhang Rui <bbcallen@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rae.ui.media.controller;

import android.view.View;
import android.widget.MediaController;

public interface IMediaController {
    void hide();

    boolean isShowing();

    void setAnchorView(View view);

    void setEnabled(boolean enabled);

    void setMediaPlayer(MediaController.MediaPlayerControl player);

    void show(int timeout);

    void show();

    void reset();

    /**
     * @param what 查看{@link tv.danmaku.ijk.media.player.IMediaPlayer} MEDIA_INFO_* 开始的常量。
     */
    void onMediaInfo(int what);

    /**
     * 播放完毕
     */
    void onCompletion();

    //----------
    // Extends
    //----------
    void showOnce(View view);

}
