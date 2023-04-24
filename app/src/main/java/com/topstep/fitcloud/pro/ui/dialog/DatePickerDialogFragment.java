package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bi.m0;
import com.topstep.fitcloudpro.R;
import f.q;
import gm.l;
import java.util.Date;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class DatePickerDialogFragment extends q {
    public static final /* synthetic */ int B0 = 0;

    @Keep
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Arguments implements Parcelable {
        public static final a CREATOR = new a();
        private final Long end;
        private final boolean hideDay;
        private final Long start;
        private final String title;
        private final Long value;

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

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Arguments(android.os.Parcel r11) {
            /*
                r10 = this;
                java.lang.String r0 = "parcel"
                gm.l.f(r11, r0)
                java.lang.Class r0 = java.lang.Long.TYPE
                java.lang.ClassLoader r1 = r0.getClassLoader()
                java.lang.Object r1 = r11.readValue(r1)
                boolean r2 = r1 instanceof java.lang.Long
                r3 = 0
                if (r2 == 0) goto L18
                java.lang.Long r1 = (java.lang.Long) r1
                r5 = r1
                goto L19
            L18:
                r5 = r3
            L19:
                java.lang.ClassLoader r1 = r0.getClassLoader()
                java.lang.Object r1 = r11.readValue(r1)
                boolean r2 = r1 instanceof java.lang.Long
                if (r2 == 0) goto L29
                java.lang.Long r1 = (java.lang.Long) r1
                r6 = r1
                goto L2a
            L29:
                r6 = r3
            L2a:
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.Object r0 = r11.readValue(r0)
                boolean r1 = r0 instanceof java.lang.Long
                if (r1 == 0) goto L39
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L39:
                r7 = r3
                java.lang.String r8 = r11.readString()
                byte r11 = r11.readByte()
                if (r11 == 0) goto L47
                r11 = 1
                r9 = 1
                goto L49
            L47:
                r11 = 0
                r9 = 0
            L49:
                r4 = r10
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment.Arguments.<init>(android.os.Parcel):void");
        }

        public Arguments(Long l10, Long l11, Long l12, String str, boolean z10) {
            this.start = l10;
            this.end = l11;
            this.value = l12;
            this.title = str;
            this.hideDay = z10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Long getEnd() {
            return this.end;
        }

        public final boolean getHideDay() {
            return this.hideDay;
        }

        public final Long getStart() {
            return this.start;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Long getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeValue(this.start);
            parcel.writeValue(this.end);
            parcel.writeValue(this.value);
            parcel.writeString(this.title);
            parcel.writeByte(this.hideDay ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static DatePickerDialogFragment a(Date date, Date date2, Date date3, String str, boolean z10) {
            DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new Arguments(Long.valueOf(date.getTime()), Long.valueOf(date2.getTime()), date3 != null ? Long.valueOf(date3.getTime()) : null, str, z10));
            datePickerDialogFragment.Z0(bundle);
            return datePickerDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void m(String str, Date date);
    }

    static {
        new a();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        int[] s10;
        Bundle U0 = U0();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("parcelArgs", Arguments.class) : U0.getParcelable("parcelArgs");
        l.c(parcelable);
        Arguments arguments = (Arguments) parcelable;
        m7.a aVar = new m7.a(V0());
        aVar.f(arguments.getStart() != null ? new Date(arguments.getStart().longValue()) : null, arguments.getEnd() != null ? new Date(arguments.getEnd().longValue()) : null, o0(R.string.unit_year), o0(R.string.unit_month), o0(R.string.unit_day), m0.o());
        if (arguments.getValue() != null) {
            s10 = tb.a.s(new Date(arguments.getValue().longValue()), null);
            aVar.g(s10[0], s10[1], s10[2]);
        }
        if (arguments.getHideDay()) {
            aVar.getChildAt(2).setVisibility(8);
        }
        v9.b bVar = new v9.b(V0());
        bVar.l(arguments.getTitle());
        bVar.m(aVar);
        bVar.h(17039370, new th.g(this, aVar, 1));
        bVar.f(null);
        return bVar.a();
    }
}
