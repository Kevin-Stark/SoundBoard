package com.kevin.soundboard;

import java.util.Map;

import android.content.Context;
import android.content.res.AssetManager;

public class prepareDrums {

    Map<String, SoundInfo> prepareDrums(Map<String, SoundInfo> hash, Context context) {

        AssetManager Am = context.getAssets();
        SoundInfo info;
        info = new SoundInfo("Button31", "drums/cymbal5.wav", 0, 0, R.mipmap.cymbol0, R.mipmap.cymbol1, R.mipmap.blue);
        hash.put("Button31", info);

        info = new SoundInfo("Button32", "drums/hihat20.wav", 0, 0, R.mipmap.hihat0, R.mipmap.hihat1, R.mipmap.blue);
        hash.put("Button32", info);

        info = new SoundInfo("Button33", "drums/cymbal3.wav", 0, 0, R.mipmap.cymbol0, R.mipmap.cymbol1, R.mipmap.blue);
        hash.put("Button33", info);

        info = new SoundInfo("Button34", "drums/snare.mp3", 0, 0, R.mipmap.snare0, R.mipmap.snare1, R.mipmap.blue);
        hash.put("Button34", info);

        info = new SoundInfo("Button35", "drums/snaredrum79.wav", 0, 0, R.mipmap.snare0, R.mipmap.snare1, R.mipmap.blue);
        hash.put("Button35", info);

        info = new SoundInfo("Button36", "drums/tomtomdrum5.wav", 0, 0, R.mipmap.tomtom0, R.mipmap.tomtom1, R.mipmap.blue);
        hash.put("Button36", info);

        info = new SoundInfo("Button37", "drums/tomtomdrum6.wav", 0, 0, R.mipmap.tomtom0, R.mipmap.tomtom1, R.mipmap.blue);
        hash.put("Button37", info);

        info = new SoundInfo("Button38", "drums/tomtomdrum7.wav", 0, 0, R.mipmap.tomtom0, R.mipmap.tomtom1, R.mipmap.blue);
        hash.put("Button38", info);

        info = new SoundInfo("Button39", "drums/bassdrum6.wav", 0, 0, R.mipmap.bass0, R.mipmap.bass1, R.mipmap.blue);
        hash.put("Button39", info);

        return hash;
    }

}
