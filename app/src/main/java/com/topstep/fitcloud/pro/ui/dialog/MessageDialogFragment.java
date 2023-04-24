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
public final class MessageDialogFragment extends q {
    public static final /* synthetic */ int B0 = 0;

    @Keep
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Arguments implements Parcelable {
        public static final a CREATOR = new a();
        private final String msg;
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

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Arguments(Parcel parcel) {
            this(parcel.readString(), parcel.readString());
            l.f(parcel, "parcel");
        }

        public Arguments(String str, String str2) {
            this.title = str;
            this.msg = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeString(this.title);
            parcel.writeString(this.msg);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static MessageDialogFragment a(String str, String str2) {
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new Arguments(str, str2));
            messageDialogFragment.Z0(bundle);
            return messageDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void j(String str);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Bundle U0 = U0();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("parcelArgs", Arguments.class) : U0.getParcelable("parcelArgs");
        l.c(parcelable);
        Arguments arguments = (Arguments) parcelable;
        v9.b bVar = new v9.b(V0());
        bVar.l(arguments.getTitle());
        bVar.e(arguments.getMsg());
        bVar.h(17039370, new th.a(this, 2));
        bVar.f(null);
        return bVar.a();
    }
}
