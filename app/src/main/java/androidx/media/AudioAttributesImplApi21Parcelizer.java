package androidx.media;

import android.media.AudioAttributes;
import z2.b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2816a = (AudioAttributes) bVar.l(audioAttributesImplApi21.f2816a, 1);
        audioAttributesImplApi21.f2817b = bVar.j(audioAttributesImplApi21.f2817b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2816a;
        bVar.o(1);
        bVar.u(audioAttributes);
        bVar.t(audioAttributesImplApi21.f2817b, 2);
    }
}
