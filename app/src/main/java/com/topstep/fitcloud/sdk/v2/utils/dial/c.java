package com.topstep.fitcloud.sdk.v2.utils.dial;

import java.util.Arrays;
import jh.v;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final byte[] f12519a = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE];

    /* renamed from: b */
    public final int[] f12520b = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: c */
    public final int[] f12521c = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: d */
    public final int[] f12522d = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: e */
    public final int[] f12523e = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: f */
    public final int[] f12524f = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: g */
    public final int[] f12525g = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: h */
    public final int[] f12526h = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: i */
    public final int[] f12527i = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: j */
    public final int[] f12528j = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public short f12529a;

        /* renamed from: b */
        public short f12530b;

        /* renamed from: c */
        public int f12531c;

        /* renamed from: d */
        public int f12532d;

        /* renamed from: e */
        public int f12533e;

        /* renamed from: f */
        public int f12534f;

        public static a a(int i10, byte[] bArr) {
            a aVar = new a();
            aVar.f12529a = (short) (bArr[i10] & 255);
            int i11 = i10 + 1;
            aVar.f12530b = (short) (bArr[i11] & 255);
            int i12 = i11 + 1;
            aVar.f12531c = com.topstep.fitcloud.sdk.v2.utils.dial.b.g(i12, bArr);
            int i13 = i12 + 2;
            aVar.f12532d = com.topstep.fitcloud.sdk.v2.utils.dial.b.g(i13, bArr);
            int i14 = i13 + 2;
            aVar.f12533e = com.topstep.fitcloud.sdk.v2.utils.dial.b.g(i14, bArr);
            aVar.f12534f = com.topstep.fitcloud.sdk.v2.utils.dial.b.g(i14 + 2, bArr);
            return aVar;
        }

        public final String toString() {
            StringBuilder c10 = v.c("Module_t{enable=");
            c10.append((int) this.f12529a);
            c10.append(", style_number=");
            c10.append((int) this.f12530b);
            c10.append(", x=");
            c10.append(this.f12531c);
            c10.append(", y=");
            c10.append(this.f12532d);
            c10.append(", width=");
            c10.append(this.f12533e);
            c10.append(", height=");
            return v.b(c10, this.f12534f, '}');
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public short f12535a;

        /* renamed from: b */
        public short f12536b;

        /* renamed from: c */
        public short f12537c;

        /* renamed from: d */
        public short f12538d;

        /* renamed from: e */
        public short f12539e;

        /* renamed from: f */
        public short f12540f;

        /* renamed from: g */
        public short f12541g;

        /* renamed from: h */
        public short f12542h;

        /* renamed from: i */
        public int f12543i;

        /* renamed from: j */
        public short f12544j;

        /* renamed from: k */
        public short f12545k;

        /* renamed from: l */
        public short f12546l;

        /* renamed from: m */
        public short f12547m;

        /* renamed from: n */
        public short f12548n;

        /* renamed from: o */
        public short f12549o;

        /* renamed from: p */
        public int[] f12550p;

        public final String toString() {
            StringBuilder c10 = v.c("WatchFaceControl_t{index=");
            c10.append((int) this.f12535a);
            c10.append(", control=");
            c10.append((int) this.f12536b);
            c10.append(", enable=");
            c10.append((int) this.f12537c);
            c10.append(", type=");
            c10.append((int) this.f12538d);
            c10.append(", x=");
            c10.append((int) this.f12539e);
            c10.append(", y=");
            c10.append((int) this.f12540f);
            c10.append(", union_x0_width_x_add=");
            c10.append((int) this.f12541g);
            c10.append(", union_y0_height_y_add=");
            c10.append((int) this.f12542h);
            c10.append(", Imageid=");
            c10.append(this.f12543i);
            c10.append(", align=");
            c10.append((int) this.f12544j);
            c10.append(", union_time_style_number_language=");
            c10.append((int) this.f12545k);
            c10.append(", number=");
            c10.append((int) this.f12546l);
            c10.append(", module=");
            c10.append((int) this.f12547m);
            c10.append(", style=");
            c10.append((int) this.f12548n);
            c10.append(", reserved=");
            c10.append((int) this.f12549o);
            c10.append(", styleId=");
            c10.append(Arrays.toString(this.f12550p));
            c10.append('}');
            return c10.toString();
        }
    }

    /* renamed from: com.topstep.fitcloud.sdk.v2.utils.dial.c$c */
    /* loaded from: classes2.dex */
    public static class C0213c {

        /* renamed from: a */
        public long f12551a;

        /* renamed from: b */
        public int f12552b;

        /* renamed from: c */
        public int f12553c;

        /* renamed from: d */
        public long f12554d;

        /* renamed from: e */
        public int f12555e;

        /* renamed from: f */
        public int f12556f;

        /* renamed from: g */
        public long f12557g;

        /* renamed from: h */
        public int f12558h;

        /* renamed from: i */
        public int f12559i;

        /* renamed from: j */
        public int f12560j;

        /* renamed from: k */
        public int f12561k;

        /* renamed from: l */
        public long f12562l;

        /* renamed from: m */
        public int f12563m;

        /* renamed from: n */
        public short f12564n;

        /* renamed from: o */
        public short f12565o;

        /* renamed from: p */
        public a[] f12566p;

        public final String toString() {
            StringBuilder c10 = v.c("WatchFaceOffset_t{control_offset=");
            c10.append(this.f12551a);
            c10.append(", control_number=");
            c10.append(this.f12552b);
            c10.append(", control_size=");
            c10.append(this.f12553c);
            c10.append(", bitmap_index_offset=");
            c10.append(this.f12554d);
            c10.append(", bitmap_index_number=");
            c10.append(this.f12555e);
            c10.append(", bitmap_index_size=");
            c10.append(this.f12556f);
            c10.append(", bm_font_index_offset=");
            c10.append(this.f12557g);
            c10.append(", bm_font_index_number=");
            c10.append(this.f12558h);
            c10.append(", bm_font_ascii_number=");
            c10.append(this.f12559i);
            c10.append(", bm_font_index_size=");
            c10.append(this.f12560j);
            c10.append(", reserved=");
            c10.append(this.f12561k);
            c10.append(", bitmap_data_offset=");
            c10.append(this.f12562l);
            c10.append(", preview_id=");
            c10.append(this.f12563m);
            c10.append(", is_have_module=");
            c10.append((int) this.f12564n);
            c10.append(", module_number=");
            return v.b(c10, this.f12565o, '}');
        }
    }

    public final int a(int i10, byte b10, byte b11, byte b12) {
        int i11 = b10 & 255;
        int i12 = (i11 >> 3) << 16;
        int i13 = b11 & 255;
        int i14 = b12 & 255;
        int i15 = i14 >> 3;
        int i16 = ((i13 >> 2) << 8) | i12 | i15;
        if (i10 > 256) {
            for (int i17 = 0; i17 < 256; i17++) {
                if (i16 == this.f12520b[i17]) {
                    return i17;
                }
            }
            int i18 = (i13 >> 3) << 8;
            int i19 = i12 | i18 | i15;
            for (int i20 = 0; i20 < 256; i20++) {
                if (i19 == this.f12521c[i20]) {
                    return i20;
                }
            }
            int i21 = (i11 >> 4) << 16;
            int i22 = i14 >> 4;
            int i23 = i18 | i21 | i22;
            for (int i24 = 0; i24 < 256; i24++) {
                if (i23 == this.f12522d[i24]) {
                    return i24;
                }
            }
            int i25 = (i13 >> 4) << 8;
            int i26 = i21 | i25 | i22;
            for (int i27 = 0; i27 < 256; i27++) {
                if (i26 == this.f12523e[i27]) {
                    return i27;
                }
            }
            int i28 = (i11 >> 5) << 16;
            int i29 = i14 >> 5;
            int i30 = i25 | i28 | i29;
            for (int i31 = 0; i31 < 256; i31++) {
                if (i30 == this.f12524f[i31]) {
                    return i31;
                }
            }
            int i32 = (i13 >> 5) << 8;
            int i33 = i28 | i32 | i29;
            for (int i34 = 0; i34 < 256; i34++) {
                if (i33 == this.f12525g[i34]) {
                    return i34;
                }
            }
            int i35 = (i11 >> 6) << 16;
            int i36 = i14 >> 6;
            int i37 = i32 | i35 | i36;
            for (int i38 = 0; i38 < 256; i38++) {
                if (i37 == this.f12526h[i38]) {
                    return i38;
                }
            }
            int i39 = ((i13 >> 6) << 8) | i35 | i36;
            for (int i40 = 0; i40 < 256; i40++) {
                if (i39 == this.f12527i[i40]) {
                    return i40;
                }
            }
            int i41 = ((i11 >> 7) << 16) | ((i13 >> 7) << 8) | (i14 >> 7);
            for (int i42 = 0; i42 < 256; i42++) {
                if (i41 == this.f12528j[i42]) {
                    return i42;
                }
            }
        } else {
            for (int i43 = 0; i43 < i10; i43++) {
                if (i16 == this.f12520b[i43]) {
                    return i43;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x04f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.RandomAccessFile r49, android.graphics.Bitmap r50, android.graphics.Bitmap r51, com.topstep.fitcloud.sdk.v2.utils.dial.a.EnumC0212a r52, boolean r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 2401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.sdk.v2.utils.dial.c.b(java.io.RandomAccessFile, android.graphics.Bitmap, android.graphics.Bitmap, com.topstep.fitcloud.sdk.v2.utils.dial.a$a, boolean, boolean):void");
    }
}
