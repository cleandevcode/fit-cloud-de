package e5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e5.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m5.l;
import r4.j;
import t4.x;

/* loaded from: classes.dex */
public final class a implements j<ByteBuffer, c> {

    /* renamed from: f */
    public static final C0237a f13433f = new C0237a();

    /* renamed from: g */
    public static final b f13434g = new b();

    /* renamed from: a */
    public final Context f13435a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f13436b;

    /* renamed from: c */
    public final b f13437c;

    /* renamed from: d */
    public final C0237a f13438d;

    /* renamed from: e */
    public final e5.b f13439e;

    /* renamed from: e5.a$a */
    /* loaded from: classes.dex */
    public static class C0237a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final ArrayDeque f13440a;

        public b() {
            char[] cArr = l.f20382a;
            this.f13440a = new ArrayDeque(0);
        }
    }

    public a(Context context, ArrayList arrayList, u4.d dVar, u4.b bVar) {
        b bVar2 = f13434g;
        C0237a c0237a = f13433f;
        this.f13435a = context.getApplicationContext();
        this.f13436b = arrayList;
        this.f13438d = c0237a;
        this.f13439e = new e5.b(dVar, bVar);
        this.f13437c = bVar2;
    }

    public static int d(q4.c cVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(cVar.f24560g / i11, cVar.f24559f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder a10 = w1.h.a("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i10, "x");
            a10.append(i11);
            a10.append("], actual dimens: [");
            a10.append(cVar.f24559f);
            a10.append("x");
            a10.append(cVar.f24560g);
            a10.append("]");
            Log.v("BufferGifDecoder", a10.toString());
        }
        return max;
    }

    @Override // r4.j
    public final x<c> a(ByteBuffer byteBuffer, int i10, int i11, r4.h hVar) {
        q4.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f13437c;
        synchronized (bVar) {
            q4.d dVar2 = (q4.d) bVar.f13440a.poll();
            if (dVar2 == null) {
                dVar2 = new q4.d();
            }
            dVar = dVar2;
            dVar.f24566b = null;
            Arrays.fill(dVar.f24565a, (byte) 0);
            dVar.f24567c = new q4.c();
            dVar.f24568d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f24566b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f24566b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c10 = c(byteBuffer2, i10, i11, dVar, hVar);
            b bVar2 = this.f13437c;
            synchronized (bVar2) {
                dVar.f24566b = null;
                dVar.f24567c = null;
                bVar2.f13440a.offer(dVar);
            }
            return c10;
        } catch (Throwable th2) {
            b bVar3 = this.f13437c;
            synchronized (bVar3) {
                dVar.f24566b = null;
                dVar.f24567c = null;
                bVar3.f13440a.offer(dVar);
                throw th2;
            }
        }
    }

    @Override // r4.j
    public final boolean b(ByteBuffer byteBuffer, r4.h hVar) {
        return !((Boolean) hVar.c(h.f13479b)).booleanValue() && com.bumptech.glide.load.a.b(this.f13436b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, q4.d dVar, r4.h hVar) {
        Bitmap.Config config;
        int i12 = m5.h.f20372b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            q4.c b10 = dVar.b();
            if (b10.f24556c > 0 && b10.f24555b == 0) {
                if (hVar.c(h.f13478a) == r4.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b10, i10, i11);
                C0237a c0237a = this.f13438d;
                e5.b bVar = this.f13439e;
                c0237a.getClass();
                q4.e eVar = new q4.e(bVar, b10, byteBuffer, d10);
                eVar.h(config);
                eVar.b();
                Bitmap a10 = eVar.a();
                if (a10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder a11 = android.support.v4.media.d.a("Decoded GIF from stream in ");
                        a11.append(m5.h.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", a11.toString());
                    }
                    return null;
                }
                return new d(new c(new c.a(new f(com.bumptech.glide.b.b(this.f13435a), eVar, i10, i11, z4.b.f31959b, a10))));
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder a12 = android.support.v4.media.d.a("Decoded GIF from stream in ");
                a12.append(m5.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", a12.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder a13 = android.support.v4.media.d.a("Decoded GIF from stream in ");
                a13.append(m5.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", a13.toString());
            }
        }
    }
}
