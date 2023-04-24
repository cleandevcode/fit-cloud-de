package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a */
    public final String f643a;

    /* renamed from: b */
    public final CharSequence f644b;

    /* renamed from: c */
    public final CharSequence f645c;

    /* renamed from: d */
    public final CharSequence f646d;

    /* renamed from: e */
    public final Bitmap f647e;

    /* renamed from: f */
    public final Uri f648f;

    /* renamed from: g */
    public final Bundle f649g;

    /* renamed from: h */
    public final Uri f650h;

    /* renamed from: i */
    public MediaDescription f651i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            Uri mediaUri;
            mediaUri = mediaDescription.getMediaUri();
            return mediaUri;
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f643a = str;
        this.f644b = charSequence;
        this.f645c = charSequence2;
        this.f646d = charSequence3;
        this.f647e = bitmap;
        this.f648f = uri;
        this.f649g = bundle;
        this.f650h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L63
            int r1 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r14)
            java.lang.CharSequence r4 = android.support.v4.media.MediaDescriptionCompat.b.i(r14)
            java.lang.CharSequence r5 = android.support.v4.media.MediaDescriptionCompat.b.h(r14)
            java.lang.CharSequence r6 = android.support.v4.media.MediaDescriptionCompat.b.c(r14)
            android.graphics.Bitmap r7 = android.support.v4.media.MediaDescriptionCompat.b.e(r14)
            android.net.Uri r8 = android.support.v4.media.MediaDescriptionCompat.b.f(r14)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.b.d(r14)
            if (r2 == 0) goto L29
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.b(r2)
        L29:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L34
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L35
        L34:
            r10 = r0
        L35:
            if (r10 == 0) goto L4e
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L48
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L48
            r9 = r0
            goto L4f
        L48:
            r2.remove(r9)
            r2.remove(r11)
        L4e:
            r9 = r2
        L4f:
            if (r10 == 0) goto L52
            goto L5b
        L52:
            r2 = 23
            if (r1 < r2) goto L5a
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r14)
        L5a:
            r10 = r0
        L5b:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f651i = r14
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f644b) + ", " + ((Object) this.f645c) + ", " + ((Object) this.f646d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle;
        int i11 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f651i;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f643a);
            b.p(b10, this.f644b);
            b.o(b10, this.f645c);
            b.j(b10, this.f646d);
            b.l(b10, this.f647e);
            b.m(b10, this.f648f);
            if (i11 < 23 && this.f650h != null) {
                if (this.f649g == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(this.f649g);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f650h);
            } else {
                bundle = this.f649g;
            }
            b.k(b10, bundle);
            if (i11 >= 23) {
                c.b(b10, this.f650h);
            }
            mediaDescription = b.a(b10);
            this.f651i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
