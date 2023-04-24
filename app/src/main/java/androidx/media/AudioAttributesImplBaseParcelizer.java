package androidx.media;

import z2.b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2818a = bVar.j(audioAttributesImplBase.f2818a, 1);
        audioAttributesImplBase.f2819b = bVar.j(audioAttributesImplBase.f2819b, 2);
        audioAttributesImplBase.f2820c = bVar.j(audioAttributesImplBase.f2820c, 3);
        audioAttributesImplBase.f2821d = bVar.j(audioAttributesImplBase.f2821d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.t(audioAttributesImplBase.f2818a, 1);
        bVar.t(audioAttributesImplBase.f2819b, 2);
        bVar.t(audioAttributesImplBase.f2820c, 3);
        bVar.t(audioAttributesImplBase.f2821d, 4);
    }
}
