package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a */
    public final int f682a;

    /* renamed from: b */
    public final long f683b;

    /* renamed from: c */
    public final long f684c;

    /* renamed from: d */
    public final float f685d;

    /* renamed from: e */
    public final long f686e;

    /* renamed from: f */
    public final int f687f;

    /* renamed from: g */
    public final CharSequence f688g;

    /* renamed from: h */
    public final long f689h;

    /* renamed from: i */
    public ArrayList f690i;

    /* renamed from: j */
    public final long f691j;

    /* renamed from: k */
    public final Bundle f692k;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a */
        public final String f693a;

        /* renamed from: b */
        public final CharSequence f694b;

        /* renamed from: c */
        public final int f695c;

        /* renamed from: d */
        public final Bundle f696d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f693a = parcel.readString();
            this.f694b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f695c = parcel.readInt();
            this.f696d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f693a = str;
            this.f694b = charSequence;
            this.f695c = i10;
            this.f696d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Action:mName='");
            a10.append((Object) this.f694b);
            a10.append(", mIcon=");
            a10.append(this.f695c);
            a10.append(", mExtras=");
            a10.append(this.f696d);
            return a10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f693a);
            TextUtils.writeToParcel(this.f694b, parcel, i10);
            parcel.writeInt(this.f695c);
            parcel.writeBundle(this.f696d);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        public static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        public static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Bundle a(PlaybackState playbackState) {
            Bundle extras;
            extras = playbackState.getExtras();
            return extras;
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f682a = i10;
        this.f683b = j10;
        this.f684c = j11;
        this.f685d = f10;
        this.f686e = j12;
        this.f687f = 0;
        this.f688g = charSequence;
        this.f689h = j13;
        this.f690i = new ArrayList(arrayList);
        this.f691j = j14;
        this.f692k = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f682a = parcel.readInt();
        this.f683b = parcel.readLong();
        this.f685d = parcel.readFloat();
        this.f689h = parcel.readLong();
        this.f684c = parcel.readLong();
        this.f686e = parcel.readLong();
        this.f688g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f690i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f691j = parcel.readLong();
        this.f692k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f687f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction2 : j10) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l10 = b.l(customAction3);
                    MediaSessionCompat.a(l10);
                    customAction = new CustomAction(b.f(customAction3), b.o(customAction3), b.m(customAction3), l10);
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        return new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f682a + ", position=" + this.f683b + ", buffered position=" + this.f684c + ", speed=" + this.f685d + ", updated=" + this.f689h + ", actions=" + this.f686e + ", error code=" + this.f687f + ", error message=" + this.f688g + ", custom actions=" + this.f690i + ", active item id=" + this.f691j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f682a);
        parcel.writeLong(this.f683b);
        parcel.writeFloat(this.f685d);
        parcel.writeLong(this.f689h);
        parcel.writeLong(this.f684c);
        parcel.writeLong(this.f686e);
        TextUtils.writeToParcel(this.f688g, parcel, i10);
        parcel.writeTypedList(this.f690i);
        parcel.writeLong(this.f691j);
        parcel.writeBundle(this.f692k);
        parcel.writeInt(this.f687f);
    }
}
