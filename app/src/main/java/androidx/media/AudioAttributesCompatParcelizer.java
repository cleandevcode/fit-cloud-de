package androidx.media;

import z2.b;
import z2.d;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVar = audioAttributesCompat.f2815a;
        if (bVar.h(1)) {
            dVar = bVar.n();
        }
        audioAttributesCompat.f2815a = (AudioAttributesImpl) dVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2815a;
        bVar.o(1);
        bVar.w(audioAttributesImpl);
    }
}
