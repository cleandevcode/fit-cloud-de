package rj;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface d {

    /* renamed from: a */
    public static final /* synthetic */ int f25771a = 0;

    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(int i10, int i11) {
            return (i10 & new int[]{1, 2, 4, 8, 16, 32, 64}[i11]) > 0;
        }
    }
}
