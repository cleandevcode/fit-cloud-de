package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import f.q;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class TimePickerDialogFragment extends q {
    public static final /* synthetic */ int B0 = 0;

    @Keep
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Arguments implements Parcelable {
        public static final a CREATOR = new a();
        private final int timeMinute;
        private final String title;

        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                l.f(parcel, "parcel");
                return new Arguments(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i10) {
                return new Arguments[i10];
            }
        }

        public Arguments(int i10, String str) {
            this.timeMinute = i10;
            this.title = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Arguments(Parcel parcel) {
            this(parcel.readInt(), parcel.readString());
            l.f(parcel, "parcel");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getTimeMinute() {
            return this.timeMinute;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeInt(this.timeMinute);
            parcel.writeString(this.title);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static TimePickerDialogFragment a(int i10, String str) {
            TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new Arguments(i10, str));
            timePickerDialogFragment.Z0(bundle);
            return timePickerDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void H(int i10, String str);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Bundle U0 = U0();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("parcelArgs", Arguments.class) : U0.getParcelable("parcelArgs");
        l.c(parcelable);
        Arguments arguments = (Arguments) parcelable;
        m7.b bVar = new m7.b(V0());
        bVar.d(new m7.e(0, 23, true, null, null), new m7.e(0, 59, true, null, null), null);
        bVar.f(arguments.getTimeMinute() / 60, arguments.getTimeMinute() % 60);
        v9.b bVar2 = new v9.b(V0());
        bVar2.l(arguments.getTitle());
        bVar2.m(bVar);
        bVar2.h(17039370, new th.g(bVar, this, 2));
        bVar2.f(null);
        return bVar2.a();
    }
}
