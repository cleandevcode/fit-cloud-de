package z4;

import a5.m;
import a5.n;
import a5.s;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.support.v4.media.d;
import android.util.Log;
import android.util.Size;
import r4.g;
import r4.h;
import r4.i;

/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final s f31952a;

    /* renamed from: b */
    public final int f31953b;

    /* renamed from: c */
    public final int f31954c;

    /* renamed from: d */
    public final r4.b f31955d;

    /* renamed from: e */
    public final m f31956e;

    /* renamed from: f */
    public final boolean f31957f;

    /* renamed from: g */
    public final i f31958g;

    /* renamed from: z4.a$a */
    /* loaded from: classes.dex */
    public class C0607a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, h hVar) {
        boolean z10;
        if (s.f318j == null) {
            synchronized (s.class) {
                if (s.f318j == null) {
                    s.f318j = new s();
                }
            }
        }
        this.f31952a = s.f318j;
        this.f31953b = i10;
        this.f31954c = i11;
        this.f31955d = (r4.b) hVar.c(n.f299f);
        this.f31956e = (m) hVar.c(m.f297f);
        g<Boolean> gVar = n.f302i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31957f = z10;
        this.f31958g = (i) hVar.c(n.f300g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z10 = false;
        if (this.f31952a.a(this.f31953b, this.f31954c, this.f31957f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f31955d == r4.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0607a());
        Size size = imageInfo.getSize();
        int i10 = this.f31953b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f31954c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f31956e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder a10 = d.a("Resizing from [");
            a10.append(size.getWidth());
            a10.append("x");
            a10.append(size.getHeight());
            a10.append("] to [");
            a10.append(round);
            a10.append("x");
            a10.append(round2);
            a10.append("] scaleFactor: ");
            a10.append(b10);
            Log.v("ImageDecoder", a10.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f31958g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                if (z10) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i12 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
