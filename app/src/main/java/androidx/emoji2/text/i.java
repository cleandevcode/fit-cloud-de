package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d */
    public static final ThreadLocal<x1.a> f2259d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f2260a;

    /* renamed from: b */
    public final n f2261b;

    /* renamed from: c */
    public volatile int f2262c = 0;

    public i(n nVar, int i10) {
        this.f2261b = nVar;
        this.f2260a = i10;
    }

    public final int a(int i10) {
        x1.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = c10.f30165b;
            int i11 = a10 + c10.f30164a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        x1.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            int i10 = a10 + c10.f30164a;
            return c10.f30165b.getInt(c10.f30165b.getInt(i10) + i10);
        }
        return 0;
    }

    public final x1.a c() {
        short s10;
        ThreadLocal<x1.a> threadLocal = f2259d;
        x1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new x1.a();
            threadLocal.set(aVar);
        }
        x1.b bVar = this.f2261b.f2285a;
        int i10 = this.f2260a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f30164a;
            int i12 = (i10 * 4) + bVar.f30165b.getInt(i11) + i11 + 4;
            int i13 = bVar.f30165b.getInt(i12) + i12;
            ByteBuffer byteBuffer = bVar.f30165b;
            aVar.f30165b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f30164a = i13;
                int i14 = i13 - byteBuffer.getInt(i13);
                aVar.f30166c = i14;
                s10 = aVar.f30165b.getShort(i14);
            } else {
                s10 = 0;
                aVar.f30164a = 0;
                aVar.f30166c = 0;
            }
            aVar.f30167d = s10;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        x1.a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i10 = c10.f30165b.getInt(a10 + c10.f30164a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
