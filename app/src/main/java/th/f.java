package th;

import com.topstep.fitcloudpro.R;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public Boolean f28186a;

    /* renamed from: b */
    public Integer[] f28187b = {Integer.valueOf((int) R.string.ds_alarm_repeat_00_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_01_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_02_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_03_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_04_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_05_simple), Integer.valueOf((int) R.string.ds_alarm_repeat_06_simple)};

    /* renamed from: c */
    public final tl.i f28188c = new tl.i(a.f28189b);

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<Comparator<rj.a>> {

        /* renamed from: b */
        public static final a f28189b = new a();

        public a() {
            super(0);
        }

        @Override // fm.a
        public final Comparator<rj.a> m() {
            return new g6.b(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
        L4:
            r3 = 7
            r4 = 1
            if (r1 >= r3) goto L32
            int[] r3 = new int[r3]
            r3 = {x0072: FILL_ARRAY_DATA  , data: [1, 2, 4, 8, 16, 32, 64} // fill-array
            r3 = r3[r1]
            r3 = r3 & r9
            if (r3 <= 0) goto L13
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 == 0) goto L2f
            int r2 = r2 + 1
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.Integer[] r3 = r7.f28187b
            r3 = r3[r1]
            int r3 = r3.intValue()
            java.lang.String r3 = r8.getString(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L2f:
            int r1 = r1 + 1
            goto L4
        L32:
            if (r2 == 0) goto L66
            r1 = 2
            r5 = 6
            r6 = 5
            if (r2 == r1) goto L54
            if (r2 == r6) goto L42
            if (r2 == r3) goto L3e
            goto L64
        L3e:
            r9 = 2131951954(0x7f130152, float:1.9540337E38)
            goto L69
        L42:
            boolean r1 = rj.d.a.a(r9, r6)
            r1 = r1 ^ r4
            boolean r9 = rj.d.a.a(r9, r5)
            r9 = r9 ^ r4
            if (r1 == 0) goto L64
            if (r9 == 0) goto L64
            r9 = 2131951957(0x7f130155, float:1.9540343E38)
            goto L69
        L54:
            boolean r1 = rj.d.a.a(r9, r6)
            boolean r9 = rj.d.a.a(r9, r5)
            if (r1 == 0) goto L64
            if (r9 == 0) goto L64
            r9 = 2131951956(0x7f130154, float:1.9540341E38)
            goto L69
        L64:
            r8 = 0
            goto L6d
        L66:
            r9 = 2131951955(0x7f130153, float:1.954034E38)
        L69:
            java.lang.String r8 = r8.getString(r9)
        L6d:
            if (r8 != 0) goto L70
            goto L71
        L70:
            r0 = r8
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th.f.a(android.content.Context, int):java.lang.String");
    }
}
