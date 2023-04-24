package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.r;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import f.q;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes2.dex */
public final class ChoiceIntDialogFragment extends q {
    public static final /* synthetic */ int B0 = 0;

    @Keep
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Arguments implements Parcelable {
        public static final a CREATOR = new a();
        private final String[] items;
        private final int selectValue;
        private final String title;
        private final int[] values;

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
        public Arguments(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.String r0 = "parcel"
                gm.l.f(r4, r0)
                java.lang.String[] r0 = r4.createStringArray()
                gm.l.c(r0)
                int[] r1 = r4.createIntArray()
                int r2 = r4.readInt()
                java.lang.String r4 = r4.readString()
                r3.<init>(r0, r1, r2, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.Arguments.<init>(android.os.Parcel):void");
        }

        public Arguments(String[] strArr, int[] iArr, int i10, String str) {
            l.f(strArr, "items");
            this.items = strArr;
            this.values = iArr;
            this.selectValue = i10;
            this.title = str;
        }

        public /* synthetic */ Arguments(String[] strArr, int[] iArr, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, (i11 & 2) != 0 ? null : iArr, i10, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String[] getItems() {
            return this.items;
        }

        public final int getSelectValue() {
            return this.selectValue;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int[] getValues() {
            return this.values;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeStringArray(this.items);
            parcel.writeIntArray(this.values);
            parcel.writeInt(this.selectValue);
            parcel.writeString(this.title);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static ChoiceIntDialogFragment a(String str, int i10, int[] iArr, String[] strArr) {
            ChoiceIntDialogFragment choiceIntDialogFragment = new ChoiceIntDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new Arguments(strArr, iArr, i10, str));
            choiceIntDialogFragment.Z0(bundle);
            return choiceIntDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void T(int i10, String str);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        int i10;
        Bundle U0 = U0();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("parcelArgs", Arguments.class) : U0.getParcelable("parcelArgs");
        l.c(parcelable);
        final Arguments arguments = (Arguments) parcelable;
        if (arguments.getValues() == null) {
            i10 = arguments.getSelectValue();
        } else {
            int length = arguments.getItems().length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (arguments.getSelectValue() == arguments.getValues()[i12]) {
                    i11 = i12;
                }
            }
            i10 = i11;
        }
        v9.b bVar = new v9.b(V0());
        bVar.l(arguments.getTitle());
        bVar.j(arguments.getItems(), i10, new DialogInterface.OnClickListener() { // from class: com.topstep.fitcloud.pro.ui.dialog.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                ChoiceIntDialogFragment.b bVar2;
                ChoiceIntDialogFragment choiceIntDialogFragment = ChoiceIntDialogFragment.this;
                ChoiceIntDialogFragment.Arguments arguments2 = arguments;
                int i14 = ChoiceIntDialogFragment.B0;
                l.f(choiceIntDialogFragment, "this$0");
                l.f(arguments2, "$args");
                r rVar = choiceIntDialogFragment.f2537v;
                if (rVar instanceof ChoiceIntDialogFragment.b) {
                    bVar2 = (ChoiceIntDialogFragment.b) rVar;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    String str = choiceIntDialogFragment.f2540y;
                    if (arguments2.getValues() != null) {
                        i13 = arguments2.getValues()[i13];
                    }
                    bVar2.T(i13, str);
                }
                dialogInterface.dismiss();
            }
        });
        return bVar.a();
    }
}
