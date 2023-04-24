package androidx.media;

import android.util.SparseIntArray;
import z2.d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* renamed from: b */
    public static final /* synthetic */ int f2814b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f2815a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.f2815a;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f2815a;
            return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2815a.hashCode();
    }

    public final String toString() {
        return this.f2815a.toString();
    }
}
