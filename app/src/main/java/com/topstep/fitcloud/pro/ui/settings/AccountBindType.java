package com.topstep.fitcloud.pro.ui.settings;

import androidx.annotation.Keep;
import com.topstep.fitcloudpro.R;
import qa.p;

@tl.e
@Keep
/* loaded from: classes2.dex */
public enum AccountBindType {
    BIND_PHONE,
    MODIFY_PHONE,
    BIND_EMAIL,
    MODIFY_EMAIL;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11768a;

        static {
            int[] iArr = new int[AccountBindType.values().length];
            try {
                iArr[AccountBindType.BIND_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountBindType.MODIFY_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountBindType.BIND_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountBindType.MODIFY_EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11768a = iArr;
        }
    }

    public final int getTitleResId() {
        int i10 = a.f11768a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return R.string.account_modify_email;
                    }
                    throw new p();
                }
                return R.string.account_bind_email;
            }
            return R.string.account_modify_phone;
        }
        return R.string.account_bind_phone;
    }

    public final boolean isPhone() {
        return this == BIND_PHONE || this == MODIFY_PHONE;
    }
}
