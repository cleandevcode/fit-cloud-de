package androidx.media;

import android.media.AudioAttributes;
import z2.b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2816a = (AudioAttributes) bVar.l(audioAttributesImplApi26.f2816a, 1);
        audioAttributesImplApi26.f2817b = bVar.j(audioAttributesImplApi26.f2817b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f2816a;
        bVar.o(1);
        bVar.u(audioAttributes);
        bVar.t(audioAttributesImplApi26.f2817b, 2);
    }
}
