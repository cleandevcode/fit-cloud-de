package me;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import ie.b;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends BufferedInputStream {

    /* renamed from: n */
    public static final boolean f20472n = b.f16772b;

    /* renamed from: a */
    public int f20473a;

    /* renamed from: b */
    public int f20474b;

    /* renamed from: c */
    public int f20475c;

    /* renamed from: d */
    public boolean f20476d;

    /* renamed from: e */
    public boolean f20477e;

    /* renamed from: f */
    public int f20478f;

    /* renamed from: g */
    public byte[] f20479g;

    /* renamed from: h */
    public int f20480h;

    /* renamed from: i */
    public int f20481i;

    /* renamed from: j */
    public int f20482j;

    /* renamed from: k */
    public ArrayList<se.a> f20483k;

    /* renamed from: l */
    public String f20484l;

    /* renamed from: m */
    public long f20485m;

    public a(Context context, String str, InputStream inputStream, long j10) {
        super(inputStream);
        byte b10 = 1;
        this.f20475c = 1;
        this.f20480h = 4;
        this.f20481i = 16;
        if (available() < 44) {
            throw new IOException("The input file size is less to 44, please check!");
        }
        this.f20484l = str;
        this.f20485m = j10;
        C();
        this.f20482j = 0;
        this.f20483k = new ArrayList<>();
        byte[] bArr = this.f20479g;
        int length = bArr.length;
        for (byte b11 : bArr) {
            for (int i10 = 0; i10 < 8; i10++) {
                if (((byte) (((byte) (b11 >> i10)) & 1)) == 1) {
                    this.f20482j++;
                }
            }
        }
        long j11 = (this.f20482j * 12) + this.f20485m;
        byte[] bArr2 = this.f20479g;
        int length2 = bArr2.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length2) {
            byte b12 = bArr2[i12];
            long j12 = j11;
            int i13 = 0;
            int i14 = i11;
            while (i13 < 8) {
                if (((byte) (((byte) (b12 >> i13)) & b10)) == b10) {
                    byte[] bArr3 = new byte[12];
                    read(bArr3, 0, 12);
                    int i15 = this.f20478f;
                    se.a aVar = new se.a(i15, this.f20484l, i14, this.f20481i, j12, ((bArr3[3] << 24) & (-16777216)) | ((bArr3[2] << 16) & 16711680) | ((bArr3[b10] << 8) & 65280) | (bArr3[0] & 255), ((bArr3[7] << 24) & (-16777216)) | ((bArr3[6] << 16) & 16711680) | ((bArr3[5] << 8) & 65280) | (bArr3[4] & 255));
                    try {
                        te.a a10 = aVar.a(context, i15);
                        if (a10 != null) {
                            a10.k();
                            aVar.f26904i = a10.f28058o;
                            aVar.f26905j = a10.f28053j;
                            aVar.f26906k = a10.f28067x;
                            aVar.f26907l = a10.M;
                            a10.close();
                        }
                    } catch (IOException | BufferUnderflowException e10) {
                        ge.b.p(e10.toString());
                    }
                    ge.b.n(aVar.toString());
                    if (f20472n) {
                        ge.b.n(aVar.toString());
                    }
                    this.f20483k.add(aVar);
                    j12 += aVar.f26902g;
                }
                i14++;
                i13++;
                b10 = 1;
            }
            i12++;
            i11 = i14;
            j11 = j12;
            b10 = 1;
        }
        close();
    }

    public static a a(Context context, String str, InputStream inputStream, long j10) {
        a aVar = null;
        if (inputStream == null) {
            ge.b.p("InputStream can not be null");
            return null;
        }
        try {
            aVar = new a(context, str, inputStream, j10);
        } catch (IOException e10) {
            if (f20472n) {
                ge.b.d(e10.toString());
            }
        }
        try {
            inputStream.close();
        } catch (IOException e11) {
            ge.b.p(e11.toString());
        }
        return aVar;
    }

    public static a b(String str) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            a h10 = h(str, 0L, bufferedInputStream);
            try {
                bufferedInputStream.close();
            } catch (IOException e10) {
                ge.b.p(e10.toString());
            }
            return h10;
        } catch (IOException e11) {
            if (f20472n) {
                ge.b.n(e11.toString());
                return null;
            }
            return null;
        }
    }

    public static a h(String str, long j10, InputStream inputStream) {
        a aVar;
        try {
            aVar = new a(str, j10, inputStream);
        } catch (IOException e10) {
            if (f20472n) {
                ge.b.d(e10.toString());
            }
            aVar = null;
        }
        try {
            inputStream.close();
        } catch (IOException e11) {
            ge.b.p(e11.toString());
        }
        return aVar;
    }

    public final void C() {
        byte[] bArr = new byte[40];
        read(bArr, 0, 40);
        boolean z10 = true;
        if (f20472n) {
            ge.b.n(String.format(Locale.US, "PackHeader:(%d)%s", 40, he.a.a(bArr)));
        }
        int i10 = (((bArr[1] << 8) & 65280) | (bArr[0] & 255)) & Platform.CUSTOMER_ACTION_MASK;
        this.f20473a = i10;
        if (i10 != 19783) {
            throw new IOException(String.format("The signature(0x%04X) is not right", Integer.valueOf(this.f20473a)));
        }
        this.f20474b = ((bArr[5] << 24) & (-16777216)) | ((bArr[4] << 16) & 16711680) | ((bArr[3] << 8) & 65280) | (bArr[2] & 255);
        System.arraycopy(bArr, 6, new byte[32], 0, 32);
        int i11 = ((bArr[38] & 255) | (65280 & (bArr[39] << 8))) & Platform.CUSTOMER_ACTION_MASK;
        int i12 = i11 & 15;
        this.f20475c = i12;
        this.f20477e = ((byte) ((i11 >> 7) & 1)) == 1;
        this.f20478f = (i11 >> 8) & 255;
        if (i12 <= 1) {
            this.f20476d = true;
            this.f20480h = 4;
        } else {
            if (i12 != 2 && ((byte) ((i11 >> 6) & 1)) != 1) {
                z10 = false;
            }
            this.f20476d = z10;
            this.f20480h = 32;
        }
        int i13 = this.f20480h;
        this.f20481i = i13 * 4;
        byte[] bArr2 = new byte[i13];
        this.f20479g = bArr2;
        read(bArr2, 0, i13);
        this.f20485m += 40 + this.f20480h;
    }

    public final se.a j(int i10) {
        Iterator<se.a> it = this.f20483k.iterator();
        while (it.hasNext()) {
            se.a next = it.next();
            if (next.f26904i == i10) {
                return next;
            }
        }
        return null;
    }

    public final void k() {
        try {
            close();
        } catch (IOException e10) {
            ge.b.n(e10.toString());
        }
    }

    public final boolean q(int i10) {
        return s(i10 == 1 ? 2 + (this.f20475c >= 2 ? 128 : 16) : 2) != null;
    }

    public final se.a s(int i10) {
        ArrayList<se.a> arrayList = this.f20483k;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<se.a> it = this.f20483k.iterator();
            while (it.hasNext()) {
                se.a next = it.next();
                if (next.f26898c == i10) {
                    return next;
                }
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (f20472n) {
            sb2.append(String.format("signature==0x%04X", Integer.valueOf(this.f20473a)));
        }
        sb2.append(String.format(Locale.US, "size=0x%08x(%d)", Integer.valueOf(this.f20474b), Integer.valueOf(this.f20474b)) + String.format("packVersion=0x%02X, dualBank=%b", Integer.valueOf(this.f20475c), Boolean.valueOf(this.f20477e)) + String.format(", icType=0x%02X", Integer.valueOf(this.f20478f)) + String.format(", subFileNum=0x%04X, subFileIndicator=%s", Integer.valueOf(this.f20482j), he.a.a(this.f20479g)));
        return sb2.toString();
    }

    public final ArrayList v(int i10) {
        ArrayList arrayList = new ArrayList();
        ArrayList<se.a> arrayList2 = this.f20483k;
        if (arrayList2 != null && arrayList2.size() > 0) {
            int i11 = this.f20475c >= 2 ? 128 : 16;
            if (i10 == 1) {
                Iterator<se.a> it = this.f20483k.iterator();
                while (it.hasNext()) {
                    se.a next = it.next();
                    int i12 = next.f26898c;
                    if (i12 >= i11 || (this.f20478f == 11 && i12 == 24)) {
                        arrayList.add(next);
                    }
                }
            } else {
                Iterator<se.a> it2 = this.f20483k.iterator();
                while (it2.hasNext()) {
                    se.a next2 = it2.next();
                    if (next2.f26898c < i11) {
                        arrayList.add(next2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final se.a y() {
        return this.f20478f == 14 ? j(2048) : s(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r24, long r25, java.io.InputStream r27) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.<init>(java.lang.String, long, java.io.InputStream):void");
    }
}
