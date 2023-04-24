package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.r;
import bi.m0;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import f.q;
import gm.l;
import java.util.Locale;
import kotlin.Metadata;
import o5.a0;

@Metadata
/* loaded from: classes2.dex */
public final class SelectIntDialogFragment extends q {
    public static final /* synthetic */ int C0 = 0;
    public b B0;

    @Keep
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Arguments implements Parcelable {
        public static final a CREATOR = new a();
        private final String des;
        private final int max;
        private final int min;
        private final int multiples;
        private final String title;
        private final int value;

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

        public Arguments(int i10, int i11, int i12, int i13, String str, String str2) {
            this.min = i10;
            this.max = i11;
            this.multiples = i12;
            this.value = i13;
            this.title = str;
            this.des = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Arguments(Parcel parcel) {
            this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            l.f(parcel, "parcel");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getDes() {
            return this.des;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final int getMultiples() {
            return this.multiples;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeInt(this.min);
            parcel.writeInt(this.max);
            parcel.writeInt(this.multiples);
            parcel.writeInt(this.value);
            parcel.writeString(this.title);
            parcel.writeString(this.des);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static SelectIntDialogFragment a(int i10, int i11, int i12, int i13, String str, String str2) {
            SelectIntDialogFragment selectIntDialogFragment = new SelectIntDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new Arguments(i10, i11, i12, i13, str, str2));
            selectIntDialogFragment.Z0(bundle);
            return selectIntDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {

        /* loaded from: classes2.dex */
        public static final class a {
            public static String a(int i10) {
                Locale locale = m0.f4330a;
                if (locale != null) {
                    return a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
                }
                l.l("systemLocale");
                throw null;
            }
        }

        void M(int i10, String str);

        String q(int i10, String str);
    }

    /* loaded from: classes2.dex */
    public static final class c implements m7.f {

        /* renamed from: b */
        public final /* synthetic */ Arguments f11443b;

        public c(Arguments arguments) {
            SelectIntDialogFragment.this = r1;
            this.f11443b = arguments;
        }

        @Override // m7.f
        public final String a(int i10, int i11) {
            String q10;
            SelectIntDialogFragment selectIntDialogFragment = SelectIntDialogFragment.this;
            b bVar = selectIntDialogFragment.B0;
            if (bVar == null || (q10 = bVar.q(this.f11443b.getMultiples() * i11, selectIntDialogFragment.f2540y)) == null) {
                int multiples = i11 * this.f11443b.getMultiples();
                Locale locale = m0.f4330a;
                if (locale != null) {
                    return a0.a(new Object[]{Integer.valueOf(multiples)}, 1, locale, "%d", "format(locale, format, *args)");
                }
                l.l("systemLocale");
                throw null;
            }
            return q10;
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        l.f(context, "context");
        super.A0(context);
        r rVar = this.f2537v;
        l.d(rVar, "null cannot be cast to non-null type com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.Listener");
        this.B0 = (b) rVar;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void F0() {
        super.F0();
        this.B0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Bundle U0 = U0();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("parcelArgs", Arguments.class) : U0.getParcelable("parcelArgs");
        l.c(parcelable);
        final Arguments arguments = (Arguments) parcelable;
        final OneWheelLayout oneWheelLayout = new OneWheelLayout(V0(), null, 6);
        oneWheelLayout.setConfig(new m7.e(arguments.getMin(), arguments.getMax(), false, arguments.getDes(), new c(arguments)));
        oneWheelLayout.setValue(arguments.getValue() / arguments.getMultiples());
        v9.b bVar = new v9.b(V0());
        bVar.l(arguments.getTitle());
        bVar.m(oneWheelLayout);
        bVar.h(17039370, new DialogInterface.OnClickListener() { // from class: com.topstep.fitcloud.pro.ui.dialog.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SelectIntDialogFragment selectIntDialogFragment = SelectIntDialogFragment.this;
                OneWheelLayout oneWheelLayout2 = oneWheelLayout;
                SelectIntDialogFragment.Arguments arguments2 = arguments;
                int i11 = SelectIntDialogFragment.C0;
                l.f(selectIntDialogFragment, "this$0");
                l.f(oneWheelLayout2, "$layout");
                l.f(arguments2, "$args");
                SelectIntDialogFragment.b bVar2 = selectIntDialogFragment.B0;
                if (bVar2 != null) {
                    bVar2.M(oneWheelLayout2.getValue() * arguments2.getMultiples(), selectIntDialogFragment.f2540y);
                }
            }
        });
        bVar.f(null);
        return bVar.a();
    }
}
