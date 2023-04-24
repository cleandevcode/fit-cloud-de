package androidx.media;

import android.media.AudioAttributes;
import android.support.v4.media.d;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f2816a;

    /* renamed from: b */
    public int f2817b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2816a.equals(((AudioAttributesImplApi21) obj).f2816a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2816a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = d.a("AudioAttributesCompat: audioattributes=");
        a10.append(this.f2816a);
        return a10.toString();
    }
}
